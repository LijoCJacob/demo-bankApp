package com.test.Demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.Demo.model.Bank;
import com.test.Demo.repository.BankDummyRepository;

@Service
public class BankService {	
	
	@Autowired
	private BankDummyRepository repository;
	
	/**
	 * Retrieve all the details of the Banks.
	 */
	public List<Bank> getbanklist() {
		
		List<Bank> bankList = repository.bankList();
		
		return bankList;
	}
	
	/**
	 * Retrieve the details of a Bank.
	 * 
	 * @param name
	 * @return
	 */
	public Object getBankDetails(String name) {
		return repository.bankDetails(name);
	}
	
}
