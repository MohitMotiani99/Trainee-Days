package com.prac;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
		 
		 nestedObject.display();
		 System.out.println(nestedObject.x);
		 System.out.println(nestedObject.outer_x);
		 //System.out.println(nestedObject.y); // cant access as its private
		 System.out.println(nestedObject.z); //
		 System.out.println(nestedObject.a);
		 System.out.println(OuterClass.StaticNestedClass.a);
		 
	}
}
