package nasir;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;

public class Coolec {
	public static void main(String[]args) {
		
		HashSet s=new HashSet();
		
		s.add(100);
		s.add(100);
		s.add(20);
		s.add(40);
		s.add(null);
		s.addAll(s);
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		
		
	}
	}
}


