package nasir;

import java.util.LinkedList;

public class CollectioList {
public static void main(String[]args) {
	LinkedList s1=new LinkedList();
	s1.add(200);
	s1.add(300);
	s1.add(500);
	
	LinkedList s=new LinkedList(s1);
	 s.add("nasir");
	 s.add("Rahul");
	 s.add(20);
	 s.add(45.9);
	 System.out.println(s);
	
	 System.out.println(s);
	 
	 
	
}
}
