package com.prac;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("HashMap");
		Map<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(100, "Books");
		hm.put(200, "Pens");
		hm.put(200, "Rings");
		hm.put(150, "Pencil");
		hm.put(null, null);
		hm.put(250, null);
		
		System.out.println(hm);
		System.out.println();
		
		System.out.println("Linked HashMap");
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		
		lhm.put(100, "Books");
		lhm.put(200, "Pens");
		lhm.put(200, "Rings");
		lhm.put(150, "Pencil");
		lhm.put(null, null);
		lhm.put(250, null);
		
		System.out.println(lhm);
		System.out.println();
		
		System.out.println("Hashtable");
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		ht.put(100, "Books");
		ht.put(200, "Pens");
		ht.put(200, "Rings");
		ht.put(150, "Pencil");
		//ht.put(null, null);
		//ht.put(250, null);
		
		System.out.println(ht);
		System.out.println();
		
		
		System.out.println("TreeMap");
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		
		tm.put(100, "Books");
		tm.put(200, "Pens");
		tm.put(200, "Rings");
		tm.put(150, "Pencil");
		//tm.put(null, null);
		tm.put(250, null);
		
		System.out.println(tm);
		System.out.println();
		
		
		
	}

}
