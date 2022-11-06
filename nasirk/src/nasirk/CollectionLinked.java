package nasirk;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionLinked {
	public static void main(String[]args) {
		
	LinkedList<String> al= new LinkedList <String>();
	al.add("nasir");
	al.add("khan");
	Iterator<String> itr=al.iterator();  
while(itr.hasNext());
System.out.println(itr.next());
	}
}
