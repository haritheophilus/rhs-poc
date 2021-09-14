package com.example.springkafka.service;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.azure.core.exception.AzureException;
import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import com.azure.storage.blob.specialized.BlockBlobClient;
import com.azure.storage.common.StorageSharedKeyCredential;
import com.example.springkafka.util.Constants;

@Service
public class AzureTestClient {

	private BlobServiceClient storageClient;
	private Logger logger = LoggerFactory.getLogger(AzureTestClient.class);
	String endpoint = "https://rhsblobstorage.blob.core.windows.net";
	String accountName = "rhsblobstorage";
	String accountKey = "2z2zTTIruoRq/iBkbwe+OyIPVrpHo3nNX5O0LEbWsmS/ucuOvu/B3lA/y7spoK2DQgnF4S79L2V4mFRsGHsNjg==";
	String blobContainerName = "my-first-blob-container";

	@PostConstruct
	private void initializeAzure() {
		
		StorageSharedKeyCredential credential = new StorageSharedKeyCredential(accountName, accountKey);

		storageClient = new BlobServiceClientBuilder().endpoint(endpoint).credential(credential).buildClient();

	}
	public String uploadFile(File file, String fileName)
			throws IOException {
		logger.info("Started uploading File");
		String fileUrl = "";
		try {
			fileUrl = endpoint + Constants.GeneralConstants.SLASH + blobContainerName + Constants.GeneralConstants.SLASH + fileName;
			uploadFileToBlobStorage(fileName, file);
		}
		catch (AzureException ase) {
			logger.info("Caught an AmazonServiceException from GET requests, rejected reasons:");
			logger.info("Error Message:    " + ase.getMessage());
			logger.info("HTTP Status Code: " + ase.getCause());

		} 
		return fileUrl;

	}


	private void uploadFileToBlobStorage(String fileName, File file) {
		try {
			

			BlobContainerClient blobContainerClient = storageClient.getBlobContainerClient(blobContainerName);
		
			BlobClient blobClient = blobContainerClient.getBlobClient(fileName);//uploads only the file and not the entire directory
			BlockBlobClient blockBlobClient = blobClient.getBlockBlobClient();
			blockBlobClient.upload(new BufferedInputStream(new FileInputStream(file.getAbsolutePath())), file.length(),true);

		
		}  catch (Exception e) {
			e.printStackTrace();
		}

	}


}
