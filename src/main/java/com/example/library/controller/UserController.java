package com.example.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.entity.User;
import com.example.library.service.ifs.UserService;
import com.example.library.vo.UserResponse;


@RestController
@CrossOrigin
public class UserController {

	@Autowired
    private UserService userService;
	
	@PostMapping(value="api/library/registerUser")
    public UserResponse registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }
	
	@GetMapping(value="api/library/getUserById")
	public UserResponse getUserById(@RequestBody User user) {
		return userService.getUserById(0);
	}
	
	
}
