package com.prac;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.prac.model.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("sofa", 5000);
		hm.put("table", 3000);
		hm.put("lamp", 2000);
		
		System.out.println(hm);
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
		int totamt = 0;
		for(String key:hm.keySet())
			totamt+=hm.get(key);
		
		System.out.println("Total amt: "+totamt);
		
		
		
		TreeMap<Customer, String> custmap = new TreeMap<Customer, String>();
		custmap.put(new Customer(500,"Lary"), "Jersey");
		custmap.put(new Customer(501,"nary"), "florida");
		custmap.put(new Customer(502,"mary"), "states");
		custmap.put(new Customer(503,"bary"), "austin");
		
		System.out.println(custmap);
		
		
		for(Customer cust:custmap.keySet())
			System.out.println(cust.getName()+"  "+custmap.get(cust));
		
		// TODO mark it bois
		
		
	}

}
