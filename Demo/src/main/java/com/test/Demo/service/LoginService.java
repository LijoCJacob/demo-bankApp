package com.test.Demo.service;

import com.test.Demo.model.UserRegistration;

public interface LoginService {
	public Object register(UserRegistration userRegistration);
	public Object login(UserRegistration userRegistration);
	
}
