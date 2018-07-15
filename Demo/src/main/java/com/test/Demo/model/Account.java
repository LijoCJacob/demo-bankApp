package com.test.Demo.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.test.Demo.enumlist.AccountType;
import com.test.Demo.enumlist.CardType;

public class Account {

	private long accountNumber;
	private AccountType accountType;
	private double amount;
	private CardType cardType;
	private String timestamp;

	public Account() {
	}

	public Account(long accountNumber, AccountType accountType) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public CardType getCardType() {
		return cardType;
	}

	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date date) {
		this.timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(date);
	}

}
