package com.test.Demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.Demo.model.Account;
import com.test.Demo.repository.BankDummyRepository;

@Service
public class AccountService {

	@Autowired
	private BankDummyRepository repository;

	/**
	 * Logging into the bank.
	 * 
	 * @param bankName
	 * @return
	 */
	public Object loginToBank(String bankName) {
		boolean isLoggedIn = repository.isAuthenticated();

		if (!isLoggedIn) {
			return repository.prepareErrorMessage("You have not authorized to log into " + bankName);
		}

		return "";
	}

	/**
	 * Retrieving the list of accounts of the user from the specified bank.
	 * 
	 * @param bankName
	 * @return
	 */
	public Object getAccounts(String bankName) {
		boolean isLoggedIn = repository.isBankAuthenticated();

		if (!isLoggedIn) {
			return repository.prepareErrorMessage("You have not logged into " + bankName);
		}

		// Retrieving the account details of the user.
		List<Account> accountList = repository.getAccountDetails(bankName);
		return accountList;
	}

	/**
	 * Retrieving the transaction details of the specified account number.
	 * 
	 * @param accountNumber
	 * @return
	 */
	public Object getAccountTransactionDetails(String accountNumber) {

		boolean isLoggedIn = repository.isBankAuthenticated();

		if (!isLoggedIn) {
			return repository.prepareErrorMessage("You have not logged into bank.");
		}
		
		long accountNum = Long.valueOf(accountNumber);
		// Retrieving the account details of the user.
		Account account = repository.getAccountTransactionDetails(accountNum);
		return account;
	}

}
