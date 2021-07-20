package team.telstra;

import java.util.Scanner;

public class checkPallindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String s=sc.next();
		
		boolean ans=true;
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
				ans=false;
				break;
			}
		}
		if(ans)
			System.out.println(s+" is a Pallindrome");
		else
			System.out.println(s+ " is Not a Pallindrome");
		
		sc.close();
		
		
	}

}
