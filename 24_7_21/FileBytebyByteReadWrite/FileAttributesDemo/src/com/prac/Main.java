package com.prac;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using file path
		File file1 = new File("C:\\Users\\d976640\\Desktop\\samples\\telstrafile1.txt");
		try {
			System.out.println(file1.createNewFile());
			System.out.println("File created succes......");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(file1.getAbsolutePath());
		System.out.println(file1.getName());
		System.out.println(file1.getParent());
		
		//using directory path
		File file2= new File("C:\\Users\\d976640\\Desktop\\samples\\hax","telstrafile2.txt");
		try {
			file2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println(file2.getAbsolutePath());
		
		file2 = new File("C:\\Users\\d976640\\Desktop\\samples","telstrafile2.txt");
		try {
			System.out.println(file2.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(file2.getAbsolutePath());
		System.out.println(file2.getName());
		System.out.println(file2.getParent());
		System.out.println(file2.getPath());
		
		System.out.println("----------------------------------------------");
		// relative path
		
		File file3 = new File("../../../../../Users/d976640/Desktop/samples","telstrafile2.txt");
		try {
			System.out.println(file3.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(file3);
		System.out.println(file3.getAbsolutePath());
		System.out.println(file3.getPath());
		System.out.println(file3.getParent());
		System.out.println(file3.getName());
		
		// for a direc
		
		System.out.println("---------------------------------");
		
		File dir = new File("../../../../../");
		File[] flist = dir.listFiles();
		
		for(File f:flist) {
			if(f.isDirectory())
				System.out.println(f.getName()+"     "+f.getPath());
		}
		
		// mkdir
		File dir2= new File("../../../../../hax");
//		System.out.println(dir2.mkdir());
//		
		System.out.println("--------------------------------");
		// delete
		System.out.println(file2.delete());
		System.out.println(file2.getName());
		System.out.println(file2.getPath());
		
		System.out.println(dir2.delete());
		System.out.println(dir2.getName());
	}

}
