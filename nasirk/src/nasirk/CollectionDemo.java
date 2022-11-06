package nasirk;

import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.TreeSet;

public class CollectionDemo {
	public static void main(String[]args) {
		ArrayList s= new ArrayList();
		 s.add(100);
		 s.add(200);
		 s.add(300);
		 
		 System.out.println(s);
		 ArrayList p= new ArrayList();
		 p.add("aaa");
		 p.add("bbb");
		 p.add("ccc");
		 System.out.println(p);
	     s.add(p);
		 System.out.println(s);


	}}
