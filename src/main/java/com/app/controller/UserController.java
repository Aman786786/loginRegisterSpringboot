package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.LoginUser;
import com.app.entity.User;
import com.app.service.ServiceImpl;
import com.app.service.ValidationStatus;

@RestController
public class UserController {

	@Autowired
	private ServiceImpl serviceImpl;

	@PostMapping("/register")
	@CrossOrigin(origins = "http://localhost:4200")
	public ValidationStatus createUser(@RequestBody User user) throws Exception {
		return serviceImpl.createUser(user);
	}

	@PostMapping("/login")
	@CrossOrigin(origins = "http://localhost:4200")
	public ValidationStatus loginUserr(@RequestBody LoginUser loginUser) throws Exception {
		return serviceImpl.loginUserr(loginUser);

	}

}
