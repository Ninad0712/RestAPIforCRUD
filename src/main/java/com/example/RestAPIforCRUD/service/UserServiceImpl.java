package com.example.RestAPIforCRUD.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestAPIforCRUD.entity.User;
import com.example.RestAPIforCRUD.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepository;
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public List<User> fetchUserList() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
		
		
	}

	@Override
	public User updateUser(User user, long uid) {
		// TODO Auto-generated method stub
		User userDB = userRepository.findById(uid).get();
		if (Objects.nonNull(user.getFname())

	            && !"".equalsIgnoreCase(

	                user.getFname())) {

	            userDB.setFname(

	                user.getFname());

	        }
		if (Objects.nonNull(user.getLname())

	            && !"".equalsIgnoreCase(

	                user.getLname())) {

	            userDB.setLname(

	                user.getLname());

	        }
		if (Objects.nonNull(user.getDob())

	            && !"".equalsIgnoreCase(

	                user.getDob())) {

	            userDB.setDob(

	                user.getDob());

	        }
		if (Objects.nonNull(user.getCity())

	            && !"".equalsIgnoreCase(

	                user.getCity())) {

	            userDB.setCity(

	                user.getCity());

	        }
		if (Objects.nonNull(user.getMobile())

	            && !"".equalsIgnoreCase(

	                user.getMobile())) {

	            userDB.setMobile(

	                user.getMobile());

	        }
		
		return userRepository.save(userDB);
	}

	@Override
	public void deleteUserById(long uid) {
		// TODO Auto-generated method stub
		userRepository.deleteById(uid);
		
	}

}
