package team.telstra;
import java.util.Scanner;

public class checkPrime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		System.out.println("Enter choice of method");
		System.out.println("1. Checks from 2 to n-1");
		System.out.println("2. Checks from 2 to n/2");
		System.out.println("3. Checks from 2 to root n");
		
		int ch=sc.nextInt();
		
		boolean ans=false;
		
		switch (ch) {
		case 1:
			ans=primeFun1(n);
			break;
		
		case 2:
			ans=primeFun2(n);
			break;
		
		case 3:
			ans=primeFun3(n);
			break;

		default:
			break;
		}
		
		if(ans)
			System.out.println("Yes "+n+" is a Prime Number");
		else
			System.out.println("No "+n+" is Not a Prime Number");
		
		sc.close();

	}
	
	public static boolean primeFun1(int n) {
		long startTime=System.nanoTime();
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return false;
		}
		long endTime=System.nanoTime();
		long time=endTime-startTime;
		System.out.println("Method took "+ time +" ns");
		return true;
	}
	
	public static boolean primeFun2(int n) {
		int x=n/2;
		long startTime=System.nanoTime();
		for(int i=2;i<=x;i++) {
			if(n%i==0)
				return false;
		}
		long endTime=System.nanoTime();
		long time=endTime-startTime;
		System.out.println("Method took "+ time +" ns");
		return true;
	}
	
	public static boolean primeFun3(int n) {
		int x=(int) Math.sqrt(n);
		long startTime=System.nanoTime();
		for(int i=2;i<=x;i++) {
			if(n%i==0)
				return false;
		}
		long endTime=System.nanoTime();
		long time=endTime-startTime;
		System.out.println("Method took "+ time +" ns");
		return true;
	}

}
