package com.ineuron.ai.blog.service.impl;

import java.util.List;
import com.ineuron.ai.blog.exception.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.ineuron.ai.blog.entity.User;
import com.ineuron.ai.blog.payload.UserDto;
import com.ineuron.ai.blog.repository.UserRepo;
import com.ineuron.ai.blog.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDto createUser(UserDto userDto) {
		User user = this.dtoToEntity(userDto);
		User savedUser = this.userRepo.save(user);
		return this.entityToDto(savedUser);
	}

	// *****************************************************************

	@Override
	public UserDto updateUser(UserDto userDto, Integer id) {
		User user = this.userRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("User", "id", id));

		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setAbout(userDto.getAbout());

		User updatedUser = this.userRepo.save(user);
		UserDto userDto2 = this.entityToDto(updatedUser);

		return userDto2;
	}

	// *****************************************************************

	@Override
	public UserDto getUserById(Integer userId) {

		User user = this.userRepo.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User", "Id", userId));

		UserDto userDto=this.entityToDto(user);
		
		return userDto;
	}

	// *****************************************************************

	@Override
	public List<UserDto> getAllUsers() {

		return null;
	}

	// *****************************************************************

	@Override
	public void deleteUser(Integer userId) {

	}

	// *****************************************************************
//converting dto to entity object and vice-versa 

	private User dtoToEntity(UserDto userDto) {

		User user = new User();
		user.setId(userDto.getId());
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setAbout(userDto.getAbout());

		return user;

	}

	private UserDto entityToDto(User user) {
		UserDto userDto = new UserDto();
		userDto.setId(user.getId());
		userDto.setName(user.getName());
		userDto.setEmail(user.getEmail());
		userDto.setPassword(user.getPassword());
		userDto.setAbout(user.getAbout());

		return userDto;
	}

}
