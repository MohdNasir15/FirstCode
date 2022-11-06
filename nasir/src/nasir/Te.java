
package nasir;

import java.util.Enumeration;
import java.util.Vector;

public class Te {
	public static void main(String[]args ) {
		
		Vector v=new Vector();
		v.add(19);
		v.add("nasir");
		v.add("java programing");
		v.add(65.6);
		v.add(10.4);
		Enumeration e=v.elements();
		while (e.hasMoreElements()) {

			System.out.println(e.nextElement());
			
		}}}