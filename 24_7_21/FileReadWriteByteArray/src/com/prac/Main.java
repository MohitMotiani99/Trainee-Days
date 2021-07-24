package com.prac;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(InputStream is = new FileInputStream("C:\\Users\\d976640\\Desktop\\samples\\telstrafile1.txt");
				BufferedInputStream bis = new BufferedInputStream(is);){
			
			byte[] buffer = new byte[is.available()];
			bis.read(buffer);
			
			for(byte b:buffer)
				System.out.print((char)b);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}

}
