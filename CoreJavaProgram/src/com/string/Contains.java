package com.string;

public class Contains {
	public static void main(String[]args)
	{
		
		String str = "Welcome to JavaTpoint!";  
		if(str.contains(null))  
		{
			
			System.out.println("inside the if block");
		}
		
		else {
			System.out.println("inside the else block");
		}
	}
}
