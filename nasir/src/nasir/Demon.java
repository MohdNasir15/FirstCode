package nasir;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class Demon {
	public static void main(String[]args) {
	List a=new ArrayList();
	a.add(10);
	a.add(20);
	a.add("Khan");
	
	
		ListIterator d  = a.listIterator();
		d.next();
		d.next();
		System.out.println("-----------------------");
		while(d.hasPrevious()) {
			System.out.println(d.previous());
			
		}
		d.set(300);
		System.out.println(d);
		
	
	}}	
