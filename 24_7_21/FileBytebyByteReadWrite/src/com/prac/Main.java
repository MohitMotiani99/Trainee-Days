package com.prac;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(FileInputStream input = new FileInputStream("C:\\Users\\d976640\\Desktop\\samples\\telstrafile1.txt");
				BufferedInputStream bis = new BufferedInputStream(input);
			FileOutputStream output = new FileOutputStream("C:\\Users\\d976640\\Desktop\\samples\\telstrafile2.txt",true);
				BufferedOutputStream bos = new BufferedOutputStream(output);){
			
			int c;
			
			while((c=bis.read())!=-1) {
				
				bos.write(c);
				System.out.print((char)c);
				
				System.out.print(c+" ");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
