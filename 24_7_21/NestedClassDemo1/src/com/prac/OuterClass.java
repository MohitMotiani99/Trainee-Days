package com.prac;

public class OuterClass {

	static int outer_x = 10;
	
	int outer_y = 20;
	
	private static int outer_private =30;
	
	static class StaticNestedClass{
		
		int x=4;
		int outer_x= 50;
		
		private int y=44;
		protected int z=45;
		
		static int a=0;
		
		public void display() {
			System.out.println("outer_x = "+outer_x);
			System.out.println("outer_private = "+outer_private);
			System.out.println("x = "+x);
			System.out.println("y = "+y);
			System.out.println("z = "+z);
			System.out.println("a =" +a);
			
			//gives compilation error
			//System.out.println("outer_y = "+outer_y);
		}
		
		
		public static void main(String[] args) {
			
			System.out.println("Im here");
			
			OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
			nestedObject.display();
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("I was here");
	}
	
}
