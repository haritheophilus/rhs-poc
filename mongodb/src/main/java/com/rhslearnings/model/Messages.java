package com.rhslearnings.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Messages")
public class Messages {
	  @Transient
	    public static final String SEQUENCE_NAME = "users_sequence";
	
	@Id
	private long id;

	private String topicName;

	private String content;

	public long getId() {
		return id;
	}

	public void setId(long msgId) {
		this.id = msgId;
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

	@Override
	public String toString() {
		return "Messages [msgId=" + id + ", topicName=" + topicName + ", content=" + content + "]";
	}

	

}
