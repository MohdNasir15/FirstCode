package com.string;

import java.util.*;

import java.util.Arrays;

public class Java {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the yor Name");
		String name=s.next();
		System.out.println("Enter the your phone number");
		int no=s.nextInt();
		
		String text = new String("Hello, My Name is Nasir");
		String[] sentences = text.split("//");
		System.out.println(Arrays.toString(sentences));
		
		

	}
}
