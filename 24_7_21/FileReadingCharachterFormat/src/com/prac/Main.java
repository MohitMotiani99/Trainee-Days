package com.prac;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//with autoclose
		
		FileReader fr=null;
		BufferedReader br=null;
		
		try{
			fr = new FileReader("C:\\Users\\d976640\\Desktop\\samples\\telstrafile1.txt");
			br = new BufferedReader(fr);
			
			
			String str=null;
			
			str=br.readLine();
			while(!str.equalsIgnoreCase("end")) {
				System.out.println(str);
				str=br.readLine();
			}
			System.out.println("--------------------------------");
			
			str=null;
			
			fr= new FileReader("C:\\Users\\d976640\\Desktop\\samples\\telstrafile1.txt");
			br= new BufferedReader(fr);
			
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
