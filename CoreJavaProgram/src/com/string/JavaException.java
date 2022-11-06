package com.string;

public class JavaException {
public static void main(String[]args)
{
try {
	
	int data=100/0;
}	
catch(ArthmeticException e) {
	System.out.println(e);
}
System.out.println("rest of the code");
}
}
