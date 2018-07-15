package com.test.Demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.Demo.model.UserRegistration;
import com.test.Demo.service.LoginService;

/**
 * This controller handles registration and initial login requests.
 */
@RestController
public class LoginController {
	
	@Autowired
	private LoginService service;
	
	@PostMapping("/api/register")
	public Object register(@RequestBody UserRegistration userRegistration) {
		
		return service.register(userRegistration);
	}
	
	@PostMapping("/api/login")
	public Object login(@RequestBody UserRegistration userRegistration) {
		
		return service.login(userRegistration);
	}
	
}
