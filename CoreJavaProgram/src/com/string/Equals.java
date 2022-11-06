package com.string;

import java.util.StringJoiner;



public class Equals {
public static void main(String[]args)
{
StringJoiner s1=new StringJoiner(" , ");
StringJoiner s2= new StringJoiner(" : ");

s1.add("rehan");
s1.add("nasir");
s1.add("kaif");
s1.add("uzair");
s2.add("ibraheem");
s2.add("najmu");
System.out.println(s1);    
System.out.println(s2);
System.out.println(s1.merge(s2));
}
}
