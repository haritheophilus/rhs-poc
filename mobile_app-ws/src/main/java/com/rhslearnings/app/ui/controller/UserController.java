package com.rhslearnings.app.ui.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rhslearnings.app.exceptions.UserServiceException;
import com.rhslearnings.app.service.UserService;
import com.rhslearnings.app.shared.dto.UserDto;
import com.rhslearnings.app.ui.model.request.UserDetailsRequestModel;
import com.rhslearnings.app.ui.model.response.ErrorMessages;
import com.rhslearnings.app.ui.model.response.UserRest;

@RestController
@RequestMapping("users")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping(path = "/{id}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public UserRest getUser(@PathVariable String id, HttpServletRequest request) {
		StringBuffer requestUrl = request.getRequestURL();
		UserRest response = new UserRest();
		UserDto dto = userService.getUserById(id);
		BeanUtils.copyProperties(dto, response);
		return response;
	}

	private UserRest login(UserDetailsRequestModel userDetails) {

		if (userDetails.getLastName().isEmpty()) {
			throw new UserServiceException(ErrorMessages.MISSING_REQUIRED_FIELDS.getErrorMessage());
		}
		UserDto userdto = new UserDto();
		BeanUtils.copyProperties(userDetails, userdto);
		userdto.setEncryptedPassword(userDetails.getPassword());
		UserDto createduser = userService.createUser(userdto);
		UserRest response = new UserRest();
		BeanUtils.copyProperties(createduser, response);

		return response;

	}

	@PostMapping(consumes = { MediaType.APPLICATION_FORM_URLENCODED_VALUE })
	public String createHtmlUser(UserDetailsRequestModel userDetails) {
		System.out.println("Form Encoded method: Got the details");

		System.out.println("Form Encoded method: Need to persist in DB");

		return userDetails.getFirstName();// login(userDetails).getUserId();
	}

	@PostMapping(consumes = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) throws UserServiceException {

		return login(userDetails);
	}

	@PutMapping(path = "/{id}", consumes = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_XML_VALUE,
					MediaType.APPLICATION_JSON_VALUE })
	public UserRest updateUser(@PathVariable String id, @RequestBody UserDetailsRequestModel userDetails) {
		UserRest response = new UserRest();

		UserDto dto = new UserDto();

		BeanUtils.copyProperties(userDetails, dto);

		UserDto userDto = userService.updateUser(id, dto);
		BeanUtils.copyProperties(userDto, response);
		return response;
	}

	@DeleteMapping(path = "/{id}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public String deleteUser(@PathVariable String id) {
		userService.deleteUser(id);
		return "Successfully deleted user: " + id;
	}

	@GetMapping(produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public List<UserRest> getUsers(@RequestParam(value = "page", defaultValue = "0") int page,
			@RequestParam(value = "limit", defaultValue = "25") int limit) {
		List<UserRest> users = new ArrayList<UserRest>();

		List<UserDto> listOfUsers = userService.getUsers(page, limit);
		for (UserDto userDto : listOfUsers) {
			UserRest userRest = new UserRest();
			BeanUtils.copyProperties(userDto, userRest);
			users.add(userRest);
		}
		return users;
	}

}
