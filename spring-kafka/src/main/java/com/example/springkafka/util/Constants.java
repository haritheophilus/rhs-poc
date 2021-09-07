package com.example.springkafka.util;

public class Constants {
	
	public static class GeneralConstants {
		public static final String EMPTY_SPACE = " ";
		public static final String STATUS_SUCCESS = "SUCCESS";
		public static final String  DELETE_STATUS_SUCCESS="File deleted successfully";
		public static final String UNDER_SCORE = "_";
		public static final String DOT = ".";
		public static final String SLASH = "/";
		public static final String UPLOADFILE="/uploadFile/firstName/{firstName}/lastName/{lastName}/appId/{appId}";
		public static final String DOWNLOADFILE= "/downloadFile";
		public static final String DOWNLOADFILE_TO_BROWSER= "/toBrowser";
		public static final String DELETEFILE=	"/deleteFile/firstName/{firstName}/lastName/{lastName}/appId/{appId}";
		public static final String SEARCHDOWNLOAD= "/searchAndDownload/firstName/{firstName}/lastName/{lastName}/appId/{appId}";
	}
	
	public static class SwaggerConstants {
		public static final String SWAGGER_UI_PAGE = "swagger-ui.html";
		
		public static final String SWAGGER_UI_TITLE = "AWS S3 Bucket - REST APIs Documentation";
		public static final String SWAGGER_UI_DESCRIPTION = "list of all the APIs in the S3 Bucket";
		public static final String SWAGGER_UI_VERSION = "1.0.0";
		public static final String SWAGGER_UI_CONTACT = "Suresh Babu";
		public static final String SWAGGER_UI_CONTACT_EMAIL = "sureshgajjela@gmail.com";
	}


}
