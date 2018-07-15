package com.test.Demo.model;

public class BankLogin {

	private String username;
	private String password;
	private String corpId;

	public BankLogin(String username, String password, String corpId) {
		super();
		this.username = username;
		this.password = password;
		this.corpId = corpId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCorpId() {
		return corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

}
