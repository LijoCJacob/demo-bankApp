package com.test.Demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.test.Demo.service.BankService;

/**
 * This controller handles bank details requests.
 */
@RestController
public class BankController {

	@Autowired
	private BankService service;
	
	@GetMapping("/api/getbanklist")
	public Object getbanklist() {
		
		return service.getbanklist();
	}
	
	@GetMapping("/api/getbankdata/{bankname}")
	public Object getBankName(@PathVariable("bankname") String bankName) {
		
		return service.getBankDetails(bankName);
	}
	
	
	
}
