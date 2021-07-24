package com.prac;

import com.prac.model.Interface1;

enum Color implements Interface1{
	RED {
		@Override
		public void colorCode() {
			// TODO Auto-generated method stub
			System.out.println("Hi I am RED");
			
		}
	},GREEN {
		@Override
		public void colorCode() {
			// TODO Auto-generated method stub
			System.out.println("Hi I am GREEN");
		}
	},BLUE {
		@Override
		public void colorCode() {
			// TODO Auto-generated method stub
			System.out.println("Hi I am BLUE");
		}
	};
	
	private Color() {
		System.out.println("Constructor call for "+this);
	}
	
	public void colorInfo() {
		System.out.println("This is "+this+" color");
	}
	
	public abstract void colorCode();
	
	public static void main(String[] args) {
		Color c1 = Color.BLUE;
		System.out.println(c1);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Showing off from ENUM");
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color c1 = Color.RED;
		System.out.println(c1);
		c1.show();
		c1.colorInfo();
		c1.colorCode();
		for(Color c:Color.values()) {
			System.out.println(c + " at "+c.ordinal());
		}
	}
	
}