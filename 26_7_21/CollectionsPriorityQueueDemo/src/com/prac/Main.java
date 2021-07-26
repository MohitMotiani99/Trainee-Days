package com.prac;

import java.util.PriorityQueue;
import java.util.Queue;

import com.prac.model.Item;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Item> pq = new PriorityQueue<Item>();
		
		pq.add(new Item(154,"java"));
		pq.add(new Item(45,"c++"));
		pq.add(new Item(4,"c"));
		pq.add(new Item(154,"javascript"));
		pq.add(new Item(160,"html"));
		
		System.out.println(pq);
		
		pq.poll();
		System.out.println();
		System.out.println(pq);
		
		pq.poll();
		System.out.println();
		System.out.println(pq);
		
		pq.poll();
		System.out.println();
		System.out.println(pq);
		
		pq.poll();
		System.out.println();
		System.out.println(pq);
		
		pq.poll();
		System.out.println();
		System.out.println(pq);
		
	}

}
