package com.telstra;

import java.util.Random;

@SuppressWarnings("unused")
public class Customer {
	
	private int custId;
	private String custName;
	private Account account;
	
	private static int cId;
	static {
		cId=0;
	}
	
	private static int getCId() {
		Random rand=new Random();
		cId=rand.nextInt(5000)+1;
		return cId;
	}
	
	public Customer( String custName,String accountName) {
		super();
		this.custId = getCId();
		this.custName = custName;
		this.account = new Account(accountName,0);
	}

	public int getCustId() {
		return custId;
	}

	public String getCustName() {
		return custName;
	}
	
	public int checkBalance() {
		return account.getAccountBalance();
	}
	
	public String customerDetails() {
		return "The ID and Name of this Customer is "+this.getCustId()+" and "+this.getCustName()+" respectively";
	}
	
	public String accountDetails(){
		return "This is a "+account.getAccountName()+" type account and the current Balance is Rs. "+account.getAccountBalance();
	}
	
	public String withdraw(int withdrawAmt) {
		int bal=account.getAccountBalance();
		account.withdraw(withdrawAmt);
		if(bal==account.getAccountBalance())
			return "Account Has Insufficient Balance";
		else
			return "Final Balance is Rs. "+account.getAccountBalance();
	}
	
	public String deposit(int depositAmt) {
		account.deposit(depositAmt);
		return "Final Balance is Rs. "+account.getAccountBalance();
	}
}
