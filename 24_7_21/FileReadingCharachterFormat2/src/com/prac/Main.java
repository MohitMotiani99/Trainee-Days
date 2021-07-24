package com.prac;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			File f = new File("C:\\Users\\d976640\\desktop\\samples\\telstrafile1.txt");
			fr= new FileReader(f);
			br = new BufferedReader(fr);
			
			String str=null;
			
			while((str=br.readLine())!=null) 
				System.out.println(str);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
