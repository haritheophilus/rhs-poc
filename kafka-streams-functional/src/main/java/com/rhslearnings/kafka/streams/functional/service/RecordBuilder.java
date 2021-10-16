package com.rhslearnings.kafka.streams.functional.service;

import org.springframework.stereotype.Service;

import com.rhslearnings.kafka.json.producer.data.model.CardInfo;
import com.rhslearnings.kafka.streams.functional.output.data.model.Notification;

@Service
public class RecordBuilder {

	public Notification getNotification(CardInfo cardInfo) {

		Notification notification = new Notification();
		notification.setCustomerId(cardInfo.getCustomerId());
		notification.setEventType(cardInfo.getEventType());
		notification.setModifiedContactNumber(cardInfo.getContactNumber());
		notification.setModifiedEmailId(cardInfo.getEmailId());

		return notification;
	}

}
