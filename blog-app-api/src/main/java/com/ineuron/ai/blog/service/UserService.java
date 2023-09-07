package com.ineuron.ai.blog.service;

import java.util.List;

import com.ineuron.ai.blog.payload.UserDto;

public interface UserService {

	 UserDto createUser(UserDto user);
	 UserDto updateUser(UserDto userDto,Integer id);
	 UserDto getUserById(Integer userId);
	 List<UserDto> getAllUsers();
	 void deleteUser(Integer userId);
}
