package com.rhslearnings.kafka.streams.functional.impl.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.finserv.data.model.CardV11;
import com.finserv.data.model.Email;
import com.finserv.data.model.Email.ContactAllowed;
import com.rhslearnings.kafkastreams.republish.data.model.Notification;

@Service
public class ActualTransformer {
public Notification getNotification(CardV11 cardInfo) {
		
		Notification notification = new Notification();
		System.out.println("Card Number: "+ cardInfo.getData().getCard().getNumber());
		notification.setCustomerId(Double.valueOf(1112223334));//junk as customerId
		notification.setEventType(cardInfo.getData().getCard().getType().toString());//type of card
		notification.setModifiedContactNumber(Double.valueOf(1112223334));//some dummy data
		List<Email> emails = cardInfo.getData().getCard().getParty().getEmail();
		
		for(Email email : emails) {
			System.out.println(email.getType().name());
			System.out.println(email.getType() == (Email.Type.PERSONAL));
			System.out.println(email.getType().equals(Email.Type.PERSONAL));
			
			
			if(email.getIsPreferred() != null && email.getIsPreferred() ) {
				notification.setModifiedEmailId(email.toString());
			}
		}
		
		
		
		
		return notification;
	}
	

}
