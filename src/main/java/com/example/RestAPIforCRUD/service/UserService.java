package com.example.RestAPIforCRUD.service;

import java.util.List;

import com.example.RestAPIforCRUD.entity.User;

public interface UserService {
	
	User saveUser(User user);
	
	List<User> fetchUserList();
	
	User updateUser(User user,long uid);
	
	void deleteUserById(long uid);

}
