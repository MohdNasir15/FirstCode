package com.string;

public class Catch {
public static void main(String[] args) {
	int a=50;
	int b=100;
	int data;
	try {
		data =a/b;
	}
	catch(Exception e)
	{
		System.out.println(a/(b+2));
	}

}
}
