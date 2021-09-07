package com.rhslearnings.app.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.rhslearnings.app.shared.dto.UserDto;

public interface UserService extends UserDetailsService {
UserDto createUser(UserDto user);
UserDto getUser(String email);
UserDto getUserById(String userId);
UserDto updateUser(String id, UserDto user);
void deleteUser(String id);
List<UserDto> getUsers(int page, int limit);
}
