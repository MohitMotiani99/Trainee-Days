package com.prac.fpack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.prac.model.Student;

public class FileReadClass {
	public Student[] readFile() {
		
		Student[] sarr = new Student[5];
		
		try(FileReader fr= new FileReader("C:\\Users\\d976640\\Desktop\\samples\\Stdfile.txt");
				BufferedReader br = new BufferedReader(fr);) {
			
			String str = null;
			int i=0;
			while((str=br.readLine())!=null) {
				System.out.println(str);
				String[] word = str.split(":");
				sarr[i++]=new Student(Integer.parseInt(word[0]),word[1]);
				System.out.println("Record Read");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sarr;
	}
}
