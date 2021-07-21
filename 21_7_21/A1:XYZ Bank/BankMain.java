package com.telstra;

import java.util.Scanner;


public class BankMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Customer Name: ");
		String custName=sc.nextLine();
		
		
		
		System.out.println("Enter the Bank Account Name/Type to Make: ");
		System.out.println("1. Savings Account");
		System.out.println("2. Current Account");
		int ch=sc.nextInt();
		String accountName="";
		
		switch (ch) {
		case 1:
			accountName="Savings";
			break;
		case 2:
			accountName="Current";
			break;
		default:
			break;
		}
				
		Customer customer = new Customer(custName,accountName);
		
		do {
		
			System.out.println("Enter the action to perform: ");
			System.out.println("1. Check Balance");
			System.out.println("2. Withdraw Amount");
			System.out.println("3. Deposit Amount");
			System.out.println("4. Check Account Details");
			System.out.println("5. Check Customer Details");
			ch=sc.nextInt();
			
			switch (ch) {
			case 1:
				System.out.println("Your Current Balance is "+customer.checkBalance());
				break;
			case 2:
				System.out.println("Enter Amount to be Withdrawn: ");
				int amt=sc.nextInt();
				System.out.println(customer.withdraw(amt));
				break;
			case 3:
				System.out.println("Enter Amount to be Deposited: ");
				amt=sc.nextInt();
				System.out.println(customer.deposit(amt));
				break;
			case 4:
				System.out.println(customer.accountDetails());
				break;
			case 5:
				System.out.println(customer.customerDetails());
				break;
			default:
				break;
			}
			System.out.println("\nContinue?");
			
		}while(equals(sc.next()));
		
		System.out.println("Application Ended");
		
		sc.close();

	}
	
	private static boolean equals(String s) {
		return s.charAt(0)=='y';
	}

}
