package com.test.Demo.model;

public class Bank {

	private String bankId;
	private String name;
	private String branch;

	public Bank(String bankId, String name, String branch) {
		super();
		this.bankId = bankId;
		this.name = name;
		this.branch = branch;
	}

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

}
