package com.rhslearnings.model;

import com.fasterxml.jackson.annotation.JsonCreator;

public class MessageResponse {
	private String msgId ;
	private String topicName;
	private String content;
	public String getMsgId() {
		return msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
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
	@JsonCreator
	public MessageResponse(String msgId, String topicName, String content) {
		super();
		this.msgId = msgId;
		this.topicName = topicName;
		this.content = content;
	}
	
	public MessageResponse() {}
}
