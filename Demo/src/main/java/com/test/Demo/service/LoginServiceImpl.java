package com.test.Demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.Demo.model.RegistrationFailure;
import com.test.Demo.model.UserRegistration;
import com.test.Demo.repository.BankDummyRepository;

@Service
public class LoginService {

	@Autowired
	private BankDummyRepository repository;
	
	public Object register(UserRegistration userRegistration) {
		return repository.register(userRegistration);
	}
	
	public Object login(UserRegistration userRegistration) {
		
		boolean isAuthenticated = repository.login(userRegistration);
		
		if(!isAuthenticated) {
			RegistrationFailure registrationFailure = new RegistrationFailure("Login Failed","Yes");
			return registrationFailure;
		}
		
		return "";
	}
	
}
