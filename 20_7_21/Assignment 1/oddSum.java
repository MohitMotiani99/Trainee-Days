package team.telstra;

import java.util.Scanner;

public class oddSum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		long n=sc.nextLong();
		
		String s = Long.toString(n);
		
		int sum=0;
		
		for(int i=0;i<s.length();i++) {
			if(i%2==0) 
				sum+=((int)s.charAt(i)-48);
		}
		
		System.out.println("Sum of digits at odd places(1-indexed) is: "+sum);
		
		sc.close();

	}

}
