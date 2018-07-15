package com.test.Demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.Demo.service.AccountService;

/**
 * This controller handles accounts login and detail requests.
 */
@RestController
public class AccountController {

	@Autowired
	private AccountService service;
	
	@PostMapping("/api/logintobank/{bankname}")
	public Object loginToBank(@PathVariable("bankname") String bankName) {
		return service.loginToBank(bankName);
	}
	
	@GetMapping("/api/getaccounts/{bankname}")
	public Object getAccounts(@PathVariable("bankname") String bankName) {
		return service.getAccounts(bankName);
	}
	
	@GetMapping("/api/gettransactiondata/{accountnumber}")
	public Object getTransactionInfo(@PathVariable("accountnumber") String accountNumber) {
		return service.getAccountTransactionDetails(accountNumber);
	}

}
