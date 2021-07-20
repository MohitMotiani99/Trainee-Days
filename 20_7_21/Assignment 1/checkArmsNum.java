package team.telstra;

import java.util.Scanner;

public class checkArmsNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		System.out.println("Enter suitable way");
		System.out.println("1. Using String functions");
		System.out.println("2. Without using String Functions");
		
		int ch=sc.nextInt();
		
		boolean ans=false;
		
		switch (ch) {
		case 1:
			ans=check1(n);
			break;
		
		case 2:
			ans=check2(n);
			break;

		default:
			break;
		}
		
		if(ans)
			System.out.println(n+" is an Armstrong Number");
		else
			System.out.println(n+ " is not an Armstrong Number");
		
		sc.close();

	}
	
	public static boolean check2(int n) {
		int sum=0;
		int len=0;
		
		int x=n;
		while(x!=0) {
			len++;
			x/=10;
		}
		
		x=n;
		while(x!=0) {
			sum+=(int)Math.pow(x%10, len);
			x/=10;
		}
		
		return sum==n;
	}
	
	public static boolean check1(int n) {
		String s=Integer.toString(n);
		
		int len=s.length();
		int sum=0;
		for(int i=0;i<len;i++) {
			
			int a=(int)s.charAt(i)-48;
			sum+=Math.pow(a,len);
		}
		
		return sum==n;
	}

}
