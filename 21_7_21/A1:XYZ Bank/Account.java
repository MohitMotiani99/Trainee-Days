package com.telstra;

import java.util.Random;

@SuppressWarnings("unused")
public class Account {
	
	private int accountId;
	private String accountName;
	private int accountBalance;
	
	private static int id;
	
	static {
		id=0;
	}
	
	private static int getId() {
		Random rand=new Random();
		id=rand.nextInt(1000)+1;
		return id;
	}
	
	public Account(String accountName, int accountBalance) {
		super();
		this.accountId = getId();
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}
	
	
	public String getAccountName() {
		return accountName;
	}

	public int getAccountBalance() {
		return accountBalance;
	}
	
	public void withdraw(int withDrawAmt) {
		if(accountBalance>=withDrawAmt)
			accountBalance-=withDrawAmt;
	}
	
	public void deposit(int depositAmt) {
		accountBalance+=depositAmt;
	}
	
}
