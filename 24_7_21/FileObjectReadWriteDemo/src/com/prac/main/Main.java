package com.prac.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.prac.model.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(FileOutputStream output = new FileOutputStream("C:\\Users\\d976640\\Desktop\\samples\\std.dat");
				ObjectOutputStream out = new ObjectOutputStream(output);
			FileInputStream input = new FileInputStream("C:\\Users\\d976640\\Desktop\\samples\\std.dat");
				ObjectInputStream in = new ObjectInputStream(input);){
			
			Student sob1 = new Student(1,"Rek",80);
			out.writeObject(sob1);
			
			Student sob2 = new Student(2,"kek",70);
			out.writeObject(sob2);
			
			Student sob3 = new Student(1,"dek",90);
			out.writeObject(sob3);
			
			System.out.println("Records Written.....");
			
			
			while(input.available()>0) {
				Student student = (Student)in.readObject();
				
				System.out.println(student);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
