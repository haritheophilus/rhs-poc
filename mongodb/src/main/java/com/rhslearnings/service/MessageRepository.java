package com.rhslearnings.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rhslearnings.model.Messages;

public interface MessageRepository extends MongoRepository<Messages, Long> {

}
