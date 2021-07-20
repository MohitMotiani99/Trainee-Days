package team.telstra;

import java.util.Arrays;
import java.util.Scanner;

public class removeDups {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		
		System.out.println("Enter the elements");
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		Arrays.sort(arr);
		
		int[] arr2=new int[n];
		int len=0;
		
		for(int i=0;i<n;i++) {
			if(len==0 || arr2[len-1]!=arr[i])
			{
				arr2[len]=arr[i];
				len++;
			}
		}
		
		System.out.println("Unique Element array is");
		for(int i=0;i<len;i++)
			System.out.print(arr2[i]+" ");
		
		sc.close();

	}

}
