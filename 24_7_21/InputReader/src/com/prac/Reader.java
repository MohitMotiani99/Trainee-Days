package com.prac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
	
	public String readInput1() {
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(ir);
		
		System.out.println("Read Input 1 Starts");
		
		String str1 = null,str2 = null;
		int res = 0;
		try {
			System.out.println("Enter 1st Number");
			str1 = br.readLine();
			System.out.println("Enter 2nd Number");
			str2=  br.readLine();
			res=Integer.parseInt(str1)/Integer.parseInt(str2);
			
		} catch (IOException e) {
			e.printStackTrace();
			//return e.getMessage();
		} catch(ArithmeticException e) {
			e.printStackTrace();
			//return e.getMessage();
		} catch(NumberFormatException e) {
			e.printStackTrace();
			//return e.getMessage();
		}
		finally {
			try {
				
				ir.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				return e.getMessage();
			}
		}
		System.out.println("Read Input 1 Ends");
		return "Result: "+res;
		
				
	}
	
	
	
	
	
	
	// autoclose
	public String readInput2() {
		
		System.out.println("Read Input 2 Starts");
		int res=0;
		
		try(InputStreamReader ir = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(ir);) {
			System.out.println("1st Number?");
			String str1 = br.readLine();
			System.out.println("2nd Number?");
			String str2 = br.readLine();
			
			res=Integer.parseInt(str1)/Integer.parseInt(str2);
			
			
		}
		catch(ArithmeticException e) {
			return e.getMessage();
		}
		catch(NumberFormatException e) {
			return e.getMessage();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			return e.getMessage();
		} 
		
		System.out.println("Read Input 2 Ends");
		return "Result: "+res;
	}
	
	
	
	
	
	
	// with throws
	public int readInput3() throws IOException,NumberFormatException,ArithmeticException {
		System.out.println("Read Input 3 Starts");
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println("1st?");
		String str1 = br.readLine();
		System.out.println("2nd?");
		String str2 = br.readLine();
		
		int res= Integer.parseInt(str1)/Integer.parseInt(str2);
		
		System.out.println("Read Input 3 Ends");
		
		return res;
	}
}
