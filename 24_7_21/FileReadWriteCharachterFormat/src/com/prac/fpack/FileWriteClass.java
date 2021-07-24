package com.prac.fpack;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.prac.model.Student;

public class FileWriteClass {

	public String createRec(Student s) {
		return s.getSId()+":"+s.getSName();
	}
	
	public void writeRec(int id,String name) {
		
		Student s= new Student(id,name);
		String str = createRec(s);
		
		try (FileWriter fw = new FileWriter("C:\\Users\\d976640\\Desktop\\samples\\Stdfile.txt",true);
				BufferedWriter bw = new BufferedWriter(fw);){
			
			bw.write(str);
			bw.newLine();
			
			System.out.println("Record Added Success.......");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
