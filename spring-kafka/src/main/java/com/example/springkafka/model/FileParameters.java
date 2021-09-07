package com.example.springkafka.model;

public class FileParameters {
	String firstName;
	String lastName;
	Long appId;
	String extension;
	public String getExtension() { return extension; }
	public void setExtension(String extension) {this.extension = extension; }
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getAppId() {
		return appId;
	}
	public void setAppId(Long appId) {
		this.appId = appId;
	}
}
