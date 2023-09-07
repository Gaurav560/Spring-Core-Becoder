package com.ineuron.ai.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ineuron.ai.blog.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	

}
