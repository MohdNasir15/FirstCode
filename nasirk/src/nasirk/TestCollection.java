package nasirk;

import java.util.ArrayList;
import java.util.Iterator;


public class TestCollection {
	public static void main(String[]args) {
		
		ArrayList <String> list= new ArrayList<String>();

		list.add("Nasir");
list.add("khan");
Iterator itr=list.iterator();
	while(itr.hasNext());
	System.out.println(itr.next());
	}

}
