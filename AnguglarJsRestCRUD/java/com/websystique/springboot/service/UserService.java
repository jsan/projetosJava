package com.websystique.springboot.service;

import java.util.List;

import com.websystique.springboot.model.User;

public interface UserService {
	
	User findById(Long id);
	
	User findByName(String name);
	
	List<User> findByAge(int age);

	void saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUserById(Long id);
	
	void deleteAllUsers();
	
	List<User> findAllUsers();
	
	boolean isUserExists(Long id);

}
