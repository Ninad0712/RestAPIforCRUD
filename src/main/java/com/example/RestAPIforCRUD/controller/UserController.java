package com.example.RestAPIforCRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestAPIforCRUD.entity.User;
import com.example.RestAPIforCRUD.service.UserService;

@RestController
public class UserController {
	@Autowired 
	private UserService userService;
	@PostMapping("/user")
    public User saveUser(@RequestBody User user)
    {
        return userService.saveUser(user);
    }
    @GetMapping("/user")
    public List<User> fetchUserList()
    {
        return userService.fetchUserList();
    }
    @PutMapping("/user/{uid}")
    public User
    updateDepartment(@RequestBody User user,@PathVariable("uid") Long uid)
    {
        return userService.updateUser(user, uid);
    }
    @DeleteMapping("/user/{uid}")
    public String deleteUserById(@PathVariable("uid")Long uid)
    {
        userService.deleteUserById(uid);
        return "Deleted Successfully";

    }
	
}
