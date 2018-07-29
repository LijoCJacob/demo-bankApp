package com.test.Demo.service;

import com.test.Demo.model.BankLogin;

public interface AccountService {
	public Object loginToBank(String bankName, BankLogin bankLogin);
	public Object getAccounts(String bankName);
	public Object getAccountTransactionDetails(String accountNumber);
}
