package com.prac;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> strarr = new ArrayList<String>();
		strarr.add("Meera");
		strarr.add("Arjun");
		strarr.add("Mary");
		strarr.add("Coach");
		
		System.out.println(strarr);
		
		strarr.add(2, "Inserted");
		System.out.println(strarr);
		
		strarr.remove(3);
		System.out.println(strarr);
		strarr.add(3,"Mary");
		System.out.println(strarr);
		strarr.add("Mary");
		System.out.println(strarr);
		strarr.remove("Mary");
		System.out.println(strarr);
		
		System.out.println();
		System.out.println();
		
		ArrayList<String> subarr = new ArrayList<String>();
		
		subarr.add("One");
		subarr.add("Two");
		
		strarr.addAll(1,subarr);
		System.out.println(strarr);
		
		System.out.println(strarr.get(3));
		
		for(String str:strarr)
			System.out.print(str+" ");
		System.out.println();
		for(int i=0;i<strarr.size();i++)
			System.out.print(strarr.get(i)+" ");
		System.out.println();
		
		System.out.println();
		
		Iterator<String> it = strarr.iterator();
		while(it.hasNext()) {
			System.out.print(it.next().toUpperCase()+"  ");
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("No. of elements?");
		int n = sc.nextInt();
		
		ArrayList<Integer> ilist = new ArrayList<Integer>(n);
		
		System.out.println(ilist.size());
		for(int i=1;i<=n;i++) {
			System.out.println("Element?");
			ilist.add(sc.nextInt());
		}
		int sum=0;
		Iterator<Integer> it1 = ilist.iterator();
		
		while(it1.hasNext())
			sum+=it1.next();
		System.out.println("Sum: "+sum);
		
		
		ArrayList<Person> plist = new ArrayList<Person>();
		plist.add(new Person(10,22));
		plist.add(new Person(20,22));
		
		System.out.println(plist);
		for(Person p:plist)
			if(p.getId()==10)
				System.out.println(p);
		
		
		sc.close();
		
		
	}

}
