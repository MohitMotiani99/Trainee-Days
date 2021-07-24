package com.prac.mainpack;

import java.util.Scanner;

import com.prac.fpack.FileReadClass;
import com.prac.fpack.FileWriteClass;
import com.prac.model.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		boolean ch = sc.nextBoolean();
		
		if(ch) {
			System.out.println("ID?");
			int id=sc.nextInt();
			System.out.println("Name?");
			String name = sc.next();
			
			FileWriteClass fw = new FileWriteClass();
			
			fw.writeRec(id, name);
		}
		else {
			FileReadClass fr = new FileReadClass();
			Student[] sarr = fr.readFile();
			
			System.out.println("Printing.......");
			for(Student s:sarr) {
				if(s!=null)
					System.out.println(s);
			}
		}
		
		sc.close();
		
	}

}
