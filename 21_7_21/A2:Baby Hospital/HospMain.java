package com.telstra;

import java.util.Scanner;

public class HospMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter capacity of hospital:");
		int cap=sc.nextInt();
		
		Baby[] arr=new Baby[cap];
		int len=0;
		do {
			System.out.println("Inserting info for a new Baby: \n");
			
			System.out.println("Enter the Weight for the baby");
			double weight=sc.nextDouble();
			
			System.out.println("Enter the Color(Blue/Pink) for the baby");
			String color=sc.next();
			
			System.out.println("Enter the Breathing Effort(Absent/Weak/Good) for the baby");
			String breathingEffort=sc.next();
			
			System.out.println("Enter the Heart Rate for the baby");
			int heartRate=sc.nextInt();
			
			arr[len]=new Baby(weight,color,breathingEffort,heartRate);
			
			System.out.println("Baby Condition is: ");
			System.out.println(arr[len].reportBaby());
			
			len++;
			
			System.out.println("\nContinue? ");
		}while(sc.next().equals("y") && len<cap);
		
		System.out.println("Application Ended");
		
		System.out.println("\nBaby Details:-\n");
		for(int i=0;i<len;i++)
			System.out.println(arr[i]);
		
		sc.close();

	}

}
