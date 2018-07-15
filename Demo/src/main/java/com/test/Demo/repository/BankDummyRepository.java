package com.test.Demo.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.test.Demo.enumlist.AccountType;
import com.test.Demo.enumlist.CardType;
import com.test.Demo.model.Account;
import com.test.Demo.model.Bank;
import com.test.Demo.model.AccountFailure;
import com.test.Demo.model.BankLogin;
import com.test.Demo.model.RegistrationFailure;
import com.test.Demo.model.UserRegistration;

/**
 * This class contains hard-coded values for simulation purposes.
 * 
 * @author Lijo Jacob
 *
 */
@Component
public class BankDummyRepository {

	// Below are the temporary holders for testing purpose.
	private static List<UserRegistration> userRegisteredList = new ArrayList<UserRegistration>();
	private static boolean isAuthenticated = false;
	private static boolean isBankAuthenticated = false;
	private static boolean isAccountsLoaded = false;
	List<Account> accountList = new ArrayList<Account>();
	
	/**
	 * Registration process.
	 * @param userRegistration
	 * @return
	 */
	public Object register(UserRegistration userRegistration) {

		boolean isExisting = false;

		for (UserRegistration registeredUser : userRegisteredList) {
			if (userRegistration.getUsername().equalsIgnoreCase(registeredUser.getUsername())
					&& userRegistration.getPassword().equalsIgnoreCase(registeredUser.getPassword())) {
				isExisting = true;
			}
		}

		if (isExisting) {
			RegistrationFailure registrationFailure = new RegistrationFailure("Registration Failed", "Yes");
			return registrationFailure;
		} else {
			userRegisteredList.add(userRegistration);
		}

		return "";
	}

	/**
	 * Login process.
	 * @param userRegistration
	 * @return
	 */
	public boolean login(UserRegistration userRegistration) {

		for (UserRegistration registeredUser : userRegisteredList) {
			if (userRegistration.getUsername().equalsIgnoreCase(registeredUser.getUsername())
					&& userRegistration.getPassword().equalsIgnoreCase(registeredUser.getPassword())) {
				isAuthenticated = true;
			}
		}

		return isAuthenticated;
	}

	/**
	 * Verifies initial login.
	 * @return
	 */
	public boolean isAuthenticated() {
		/*
		 * Retrieve user details from the Authentication object to verify the
		 * user.
		 */
		if (isAuthenticated) {
			isBankAuthenticated = true;
		}

		return isAuthenticated;
	}

	/**
	 * Verifies bank login.
	 * @return
	 */
	public boolean isBankAuthenticated() {
		return isBankAuthenticated;
	}

	public Object prepareErrorMessage(String errorMessage) {
		AccountFailure accountFailure = new AccountFailure(errorMessage);
		return accountFailure;
	}

	/**
	 * Dummy Bank list.
	 */
	public List<Bank> bankList() {
		List<Bank> bankList = new ArrayList<Bank>();
		if (isAuthenticated) {
			bankList.add(new Bank("1234509876", "CitiBank", "Koramangala"));
			bankList.add(new Bank("5678901234", "ICICI Bank", "Sarjapur"));
		}
		return bankList;
	}

	/**
	 * Dummy Bank details.
	 * @param name
	 * @return
	 */
	public Object bankDetails(String name) {
		BankLogin bankDetails = new BankLogin("Yes", "Yes", "Yes");
		return bankDetails;
	}

	/**
	 * Dummy account list.
	 * @param bankName
	 * @return
	 */
	public List<Account> getAccountDetails(String bankName) {

		/*
		 * Retrieve user details from the Authentication object and query with
		 * the bankName to retrieve the account details.
		 */
		if (!isAccountsLoaded) {
			Account account1 = new Account(1234567890, AccountType.SAVINGS);
			Account account2 = new Account(1234509876, AccountType.CURRENT);
			accountList.add(account1);
			accountList.add(account2);
			isAccountsLoaded = true;
		}

		return accountList;
	}

	/**
	 * Dummy account details.
	 * @param accountNumber
	 * @return
	 */
	public Account getAccountTransactionDetails(long accountNumber) {

		Account resultAccount = new Account();
		for (Account account : accountList) {
			if (account.getAccountNumber() == accountNumber) {

				resultAccount = new Account(account.getAccountNumber(), account.getAccountType());
				resultAccount.setAmount(1000);
				resultAccount.setCardType(CardType.DEBIT);
				resultAccount.setTimestamp(new Date());
				break;
			}
		}
		return resultAccount;
	}

}
