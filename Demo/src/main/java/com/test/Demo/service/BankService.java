package com.test.Demo.service;

import java.util.List;

import com.test.Demo.model.Bank;

public interface BankService {
	public List<Bank> getbanklist();
	public Object getBankDetails(String name);
}
