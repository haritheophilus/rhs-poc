package com.rhslearnings.model;

import com.fasterxml.jackson.annotation.JsonCreator;

public class MessageRequestDetails {
	private String topicName;
	private String content;
	
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public MessageRequestDetails() {}    
	
	@JsonCreator
	public MessageRequestDetails(String topicName, String content) {
		super();
		this.topicName = topicName;
		this.content = content;
	}
	
	
	
	

}
