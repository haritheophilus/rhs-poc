package com.rhslearnings.hwservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rhslearnings.hwservice.entity.MyDatabaseService;


@RestController
@RequestMapping("/msgsrv")
public class PersistMsgController {
	
	  @Autowired MyDatabaseService databaseService;
	 
	
@PostMapping("/")
public  String saveMessage(@RequestBody String message) {
	
	return databaseService.save(message);
	
}
@GetMapping("/test")
@ResponseBody
	public String displayWelcome() {
	return "Mike Testing";
}
}
