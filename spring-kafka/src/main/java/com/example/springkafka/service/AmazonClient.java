package com.example.springkafka.service;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.*;
import com.example.springkafka.model.FileParameters;
import com.example.springkafka.util.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.PostConstruct;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class AmazonClient {

	private AmazonS3 s3client;

	@Value("${amazonProperties.endpointUrl}")
	private String endpointUrl;
	@Value("${amazonProperties.bucketName}")
	private String bucketName;
	@Value("${amazonProperties.accessKey}")
	private String accessKey;
	@Value("${amazonProperties.secretKey}")
	private String secretKey;
	@Value("${amazonProperties.downloadpath}")
	private String downloadPath;
	@Value("${amazonProperties.downloadextension}")
	private String downloadExtension;

	private Logger logger = LoggerFactory.getLogger(AmazonClient.class);

	@PostConstruct
	private void initializeAmazon() {
		AWSCredentials credentials = new BasicAWSCredentials(this.accessKey, this.secretKey);
		this.s3client = new AmazonS3Client(credentials);
	}

	public String uploadFile(MultipartFile multipartFile, String firstName, String lastName, Long appId)
			throws IOException {
		logger.info("Started uploading File");
		String fileUrl = "";
		try {
			File file = convertMultiPartToFile(multipartFile);
			String fileName = generateFileName(multipartFile, firstName, lastName, appId);
			fileUrl = endpointUrl + Constants.GeneralConstants.SLASH + bucketName + Constants.GeneralConstants.SLASH + fileName;
			uploadFileTos3bucket(fileName, file);
			file.delete();
		} 
		catch (AmazonServiceException ase) {
			logger.info("Caught an AmazonServiceException from GET requests, rejected reasons:");
			logger.info("Error Message:    " + ase.getMessage());
			logger.info("HTTP Status Code: " + ase.getStatusCode());
			logger.info("AWS Error Code:   " + ase.getErrorCode());
			logger.info("Error Type:       " + ase.getErrorType());
			logger.info("Request ID:       " + ase.getRequestId());

		} catch (AmazonClientException ace) {
			logger.info("Caught an AmazonClientException: ");
			logger.info("Error Message: " + ace.getMessage());
		} catch (IOException ioe) {
			logger.info("IOE Error Message: " + ioe.getMessage());

		}
		return fileUrl;

	}

	public String uploadFile(File file, String fileName)
			throws IOException {
		logger.info("Started uploading File");
		String fileUrl = "";
		try {
			fileUrl = endpointUrl + Constants.GeneralConstants.SLASH + bucketName + Constants.GeneralConstants.SLASH + fileName;
			uploadFileTos3bucket(fileName, file);
		}
		catch (AmazonServiceException ase) {
			logger.info("Caught an AmazonServiceException from GET requests, rejected reasons:");
			logger.info("Error Message:    " + ase.getMessage());
			logger.info("HTTP Status Code: " + ase.getStatusCode());
			logger.info("AWS Error Code:   " + ase.getErrorCode());
			logger.info("Error Type:       " + ase.getErrorType());
			logger.info("Request ID:       " + ase.getRequestId());

		} catch (AmazonClientException ace) {
			logger.info("Caught an AmazonClientException: ");
			logger.info("Error Message: " + ace.getMessage());
		}
		return fileUrl;

	}

	private void uploadFileTos3bucket(String fileName, File file) {
		//s3client.createBucket("rhs-dem-abc-1", Region.AP_Mumbai);
		
		s3client.putObject(new PutObjectRequest(bucketName, fileName, file));
	}

	private String generateFileName(MultipartFile multiPart, String firstName, String lastName, Long appId) {
		logger.info("multiPart.getOriginalFilename()" + multiPart.getOriginalFilename());
		String[] fileNameSplits = multiPart.getOriginalFilename().split("\\.");
		int extensionIndex = fileNameSplits.length - 1;
		String extension = fileNameSplits[extensionIndex];
		return multiPart.getOriginalFilename().replace(multiPart.getOriginalFilename(),
				firstName + Constants.GeneralConstants.UNDER_SCORE + lastName + Constants.GeneralConstants.UNDER_SCORE + String.valueOf(appId) +
				Constants.GeneralConstants.DOT + extension);
	}

	private File convertMultiPartToFile(MultipartFile file) throws IOException {
		File convFile = new File(file.getOriginalFilename());
		FileOutputStream fos = new FileOutputStream(convFile);
		fos.write(file.getBytes());
		fos.close();
		return convFile;
	}

	public String downloadFile(FileParameters fileParameters) {
		//String extension = "txt";
		InputStream in = null;
		String fileName = fileParameters.getFirstName() + "_" + fileParameters.getLastName() + "_"
				+ fileParameters.getAppId().toString() + "." + fileParameters.getExtension();
		System.out.println("fileName is :: " + fileName);
		try {
			S3Object s3object = s3client.getObject(bucketName, fileName);
			in = s3object.getObjectContent();
			System.out.println("Files downloaded successfully");
			OutputStream outputStream = new FileOutputStream(new File(downloadPath+fileName));
			int read = 0;

			byte[] bytes = new byte[in.available()];
			while ((read = in.read(bytes)) != -1) {
				outputStream.write(bytes, 0, read);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return Constants.GeneralConstants.STATUS_SUCCESS;
	}

	public S3Object getS3Object(FileParameters fileParameters){
		String fileName = fileParameters.getFirstName()+"_"+fileParameters.getLastName()+"_"+fileParameters.getAppId()+
				"."+fileParameters.getExtension();
			S3Object s3Object = s3client.getObject(bucketName, fileName);
			return s3Object;
	}

	public String deleteFileFromS3Bucket(String firstName,String lastName,  Long appId) {
		String fileName = firstName + "_" + lastName + "_"+ appId.toString() + "." + "txt";
		s3client.deleteObject(new DeleteObjectRequest(bucketName, fileName));
		System.out.println("Successfully deleted");
		return Constants.GeneralConstants.DELETE_STATUS_SUCCESS;
	}

	public String listObjects(String firstName, String lastName, Long appId) {
		ObjectListing objectListing = s3client.listObjects(bucketName);
		List<String> fileNamesListInBucket = new ArrayList<String>();
		for (S3ObjectSummary os : objectListing.getObjectSummaries()) {
			String fileNameInBucket = os.getKey();
			fileNamesListInBucket.add(fileNameInBucket);
		}
		for (String filename : fileNamesListInBucket) {
			System.out.println("fileNameInBucket is :: " + filename);
		}
		FileParameters fileParameters = new FileParameters();
		fileParameters.setFirstName(firstName);
		fileParameters.setLastName(lastName);
		fileParameters.setAppId(appId);
		String fileName = fileParameters.getFirstName() + "_" + fileParameters.getLastName() + "_"
				+ fileParameters.getAppId().toString() + "." + downloadExtension;
		if (fileNamesListInBucket.contains(fileName)) {
			System.out.println("Downloading file " + fileName);
			downloadFile(fileParameters);
		}
		return Constants.GeneralConstants.STATUS_SUCCESS;
	}

}