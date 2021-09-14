package com.learning.azure.kafka.service;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.azure.core.exception.AzureException;
import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import com.azure.storage.blob.specialized.BlockBlobClient;
import com.azure.storage.common.StorageSharedKeyCredential;

@Service
public class AzureTestClient {

	@Value("${backup.extension}")
	private String fileExtension;

	LocalDate localDate = LocalDate.now();

	private static BlobServiceClient storageClient;
	private Logger logger = LoggerFactory.getLogger(AzureTestClient.class);

	@Value("${AzureProperties.endpointUrl}")
	private String endpoint; 
	
	@Value("${AzureProperties.accountName}")
	private String accountName ;
	
	@Value("${AzureProperties.accountKey}")
	private String accountKey;
	
	@Value("${AzureProperties.blobContainerName}")
	private String blobContainerName ;

	@PostConstruct
	private void initializeAzure() {

		StorageSharedKeyCredential credential = new StorageSharedKeyCredential(accountName, accountKey);

		storageClient = new BlobServiceClientBuilder().endpoint(endpoint).credential(credential).buildClient();

	}

	public void uploadFileToBlobStorage(String fileName, String message) throws IOException {
		try {

			String topicName = fileName;
			fileName = localDate + ":" + fileName;
			localDate = LocalDate.now().compareTo(localDate) > 0 ? LocalDate.now() : localDate;
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(topicName);
			stringBuilder.append(localDate.toString());
			stringBuilder.append(fileExtension);
			File file = new File(stringBuilder.toString());
			boolean boo = file.createNewFile();
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
			writer.append(message + "\n");
			writer.close();

			BlobContainerClient blobContainerClient = storageClient.getBlobContainerClient(blobContainerName);

			BlobClient blobClient = blobContainerClient.getBlobClient(fileName);// uploads only the file and not the
																				// entire directory
			BlockBlobClient blockBlobClient = blobClient.getBlockBlobClient();
			blockBlobClient.upload(new BufferedInputStream(new FileInputStream(file.getAbsolutePath())), file.length(),
					true);
			file.delete();

		} catch (AzureException ase) {
			logger.info("Caught an Azure Exception from GET requests, rejected reasons:");
			logger.info("Error Message:    " + ase.getMessage());
			logger.info("HTTP Status Code: " + ase.getCause());

		} catch (Exception e) {
			logger.info("Java Exception " + e.getCause());
		}

	}

	/*
	 * public static void main(String[] args) { try { StringBuilder stringBuilder =
	 * new StringBuilder(); // stringBuilder.append(backupFolder);
	 * stringBuilder.append("DemoTopic"); stringBuilder.append(".txt"); File file =
	 * new File(stringBuilder.toString()); boolean boo = file.createNewFile();
	 * BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
	 * writer.append("My Name is Anthony Gunzalves" + "\n"); writer.close();
	 * StorageSharedKeyCredential credential = new
	 * StorageSharedKeyCredential(accountName, accountKey);
	 * 
	 * storageClient = new
	 * BlobServiceClientBuilder().endpoint(endpoint).credential(credential).
	 * buildClient(); BlobContainerClient blobContainerClient =
	 * storageClient.getBlobContainerClient(blobContainerName);
	 * 
	 * BlobClient blobClient = blobContainerClient.getBlobClient("DemoTopic.txt");//
	 * uploads only the file and not // the entire directory BlockBlobClient
	 * blockBlobClient = blobClient.getBlockBlobClient(); String temp =
	 * file.getAbsolutePath(); blockBlobClient.upload(new BufferedInputStream(new
	 * FileInputStream(file.getAbsolutePath())), file.length(), true); } catch
	 * (Exception e) { e.printStackTrace(); ; }
	 * 
	 * }
	 */

}
