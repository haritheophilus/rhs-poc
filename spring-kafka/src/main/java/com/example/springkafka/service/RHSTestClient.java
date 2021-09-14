package com.example.springkafka.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3Client;
import com.example.springkafka.util.Constants;

import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;
import software.amazon.awssdk.services.s3.model.PutObjectResponse;


@Service
public class RHSTestClient {
	
	private S3Client s3client;
	private Logger logger = LoggerFactory.getLogger(RHSTestClient.class);
	
	@Value("${amazonProperties.endpointUrl}")
	private String endpointUrl;
	@Value("${amazonProperties.bucketName}")
	private String bucketName;
	@Value("${amazonProperties.downloadpath}")
	private String downloadPath;
	@Value("${amazonProperties.downloadextension}")
	private String downloadExtension;
	
	
	@PostConstruct
	private void initializeAmazon() {
		
		this.s3client = S3Client.create();
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
		Map<String, String> metadata = new HashMap<>();
		metadata.put("x-amz-meta-myVal", "test");

		PutObjectRequest putOb = PutObjectRequest.builder().bucket(bucketName).key(fileName).metadata(metadata).build();
		
		PutObjectResponse response = s3client.putObject(putOb,RequestBody.fromBytes(getObjectFile(file.getPath())));
	}
	
	private static byte[] getObjectFile(String filePath) {

		FileInputStream fileInputStream = null;
		byte[] bytesArray = null;

		try {
			File file = new File(filePath);
			bytesArray = new byte[(int) file.length()];
			fileInputStream = new FileInputStream(file);
			fileInputStream.read(bytesArray);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return bytesArray;
	}

	
	/*
	 * public static void main(String args[]) throws Exception {
	 * 
	 * // create a client connection based on credentials S3Client s3client =
	 * S3Client.create();
	 * 
	 * // new S3Client.(credentials); String bucketName = "sample-rhs-bucket"; //
	 * s3client.createBucket(bucketName);
	 * 
	 * StringBuilder stringBuilder = new StringBuilder(); stringBuilder.append(
	 * "E:\\RHS-Git\\rhs-poc\\spring-kafka\\BackupNew\\test.txt");
	 * 
	 * Map<String, String> metadata = new HashMap<>();
	 * metadata.put("x-amz-meta-myVal", "test");
	 * 
	 * PutObjectRequest putOb =
	 * PutObjectRequest.builder().bucket(bucketName).key("test.txt").metadata(
	 * metadata) .build(); PutObjectResponse response = s3client.putObject(putOb,
	 * RequestBody.fromBytes(getObjectFile(
	 * "E:\\RHS-Git\\rhs-poc\\spring-kafka\\BackupNew\\test.txt")));
	 * 
	 * System.out.println("file uploaded sucessfully to " + bucketName); }
	 */

	
}
