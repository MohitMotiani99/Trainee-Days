package team.telstra;

public class Main {

	public static void main(String[] args) {
		
		long startTime=0;
		long endTime=0;
		long time=0;
		
		// CASE 1
		
		int j=10,k=20,l=30,m=40,n=50,count=100;
		
		// Without Opt
		startTime=System.nanoTime();
		for(int i=1;i<count;i++) {
			int x=i*j*k*l*m*n;
		}
		endTime=System.nanoTime();
		time=endTime-startTime;
		System.out.println("Case 1: Without Optimisation Exec Time: "+ time);
		
		// With Opt
		startTime=System.nanoTime();
		int val=j*k*l*m*n;
		int incAmount=val;
		for(int i=1;i<count;i++) {
			int x=incAmount;
			incAmount+=val;
		}
		endTime=System.nanoTime();
		time=endTime-startTime;
		System.out.println("Case 1: With Optimisation Exec Time: "+ time);
		
		// CASE 2
		
		int numD=5,numR=5;
		int[] discountTbl= {10,20,30,40,50};
		int[] rateTbl= {1,1,1,1,1};
		
		// Without Opt
		startTime=System.nanoTime();
		for (int discount = 0; discount < numD; discount++) 
		{ 
			 for (int rate = 0; rate < numR; rate++) 
			 { 
			     rateTbl[rate] = rateTbl[rate] * discountTbl[discount]; 
			 } 
		}
		endTime=System.nanoTime();
		time=endTime-startTime;
		System.out.println("Case 2: Without Optimisation Exec Time: "+ time);
		
		// With Opt
		
		startTime=System.nanoTime();
		for (int discount = 0; discount < numD; discount++) 
		{ 
			int val2=discountTbl[discount];
			 for (int rate = 0; rate < numR; rate++) 
			 { 
			     rateTbl[rate] = rateTbl[rate] * val2; 
			 } 
		}
		endTime=System.nanoTime();
		time=endTime-startTime;
		System.out.println("Case 2: With Optimisation Exec Time: "+ time);
		
		
		// CASE 3
		
		count=100;
		
		// Without Opt
		startTime=System.nanoTime();
		for (int i=1; i<count; i++) { 
			   double x = Math.pow(Math.log(i) / Math.log(3), 2); 
		}
		endTime=System.nanoTime();
		time=endTime-startTime;
		System.out.println("Case 3: Without Optimisation Exec Time: "+ time);
		
		// With Opt
		
		startTime=System.nanoTime();
		double l3=Math.log(3);
		for (int i=1; i<count; i++) { 
				double val3=Math.log(i)/l3;
			   double x = val3*val3; 
		}
		endTime=System.nanoTime();
		time=endTime-startTime;
		System.out.println("Case 3: With Optimisation Exec Time: "+ time);
		
	}

}
