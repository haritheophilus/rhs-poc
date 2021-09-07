package com.rhslearnings.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.rhslearnings.app.exceptions.UserServiceException;
import com.rhslearnings.app.io.entity.UserEntity;
import com.rhslearnings.app.io.repositories.UserRepository;
import com.rhslearnings.app.service.UserService;
import com.rhslearnings.app.shared.Utils;
import com.rhslearnings.app.shared.dto.UserDto;
import com.rhslearnings.app.ui.model.response.ErrorMessages;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository repository;
	@Autowired
	Utils util;
	@Autowired
	BCryptPasswordEncoder encryptPwd;

	@Override
	public UserDto getUserById(String userId) {
		UserEntity entity = repository.findByUserId(userId);
		if (entity == null)
			throw new UsernameNotFoundException(userId);
		UserDto dto = new UserDto();
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}

	@Override
	public UserDto createUser(UserDto user) {

		UserEntity tempUser = repository.findByEmail(user.getEmail());
		if (tempUser != null)
			throw new RuntimeException("The user with the email id already exists.");

		UserEntity entity = new UserEntity();
		BeanUtils.copyProperties(user, entity);
		entity.setEncryptedPassword(encryptPwd.encode(user.getEncryptedPassword()));
		entity.setUserId(util.generatedUserId(30));
		UserEntity returnEntity = repository.save(entity);
		UserDto dto = new UserDto();
		BeanUtils.copyProperties(returnEntity, dto);
		return dto;
	}

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		UserEntity entity = repository.findByEmail(email);
		if (entity == null)
			throw new UsernameNotFoundException(email);

		return new User(entity.getEmail(), entity.getEncryptedPassword(), new ArrayList<>());
	}

	@Override
	public UserDto getUser(String email) {
		UserEntity entity = repository.findByEmail(email);
		if (entity == null)
			throw new UsernameNotFoundException(email);
		UserDto dto = new UserDto();
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}

	@Override
	public UserDto updateUser(String id, UserDto user) {
		UserEntity entity = repository.findByUserId(id);
		if (entity == null)
			throw new UserServiceException(ErrorMessages.NO_RECORD_FOUND.getErrorMessage());

		entity.setFirstName(user.getFirstName());
		entity.setLastName(user.getLastName());
		UserEntity updatedEntity = repository.save(entity);
		UserDto dto = new UserDto();
		BeanUtils.copyProperties(updatedEntity, dto);
		return dto;
	}

	@Override
	public void deleteUser(String id) {
		UserEntity entity = repository.findByUserId(id);
		if (entity == null)
			throw new UserServiceException(ErrorMessages.NO_RECORD_FOUND.getErrorMessage());

		repository.delete(entity);
	}

	@Override
	public List<UserDto> getUsers(int page, int limit) {
		
		
		Pageable pageRequest =  PageRequest.of(page, limit);
		Page<UserEntity> pages = repository.findAll(pageRequest);
		List<UserEntity> pageEntities = pages.getContent();
		
		List<UserDto> returnValue = new ArrayList<UserDto>();
				
		for(UserEntity entity : pageEntities)
		{
			UserDto dto = new UserDto();
			BeanUtils.copyProperties(entity,dto);
			returnValue.add(dto);
		}
		
		return returnValue;
	}
	
	

}
