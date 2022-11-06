package nasir;

import java.util.Vector;

public class DemoVect
   {
	public static void main(String[]args)
	
	{
		Vector v=new Vector();
		v.add("deepak");
		v.add("Nasir");
		v.add(10.5);
		v.add(100);
		v.add(120.3);
		v.add('n');
		//System.out.println( v);
		
		System.out.println(v.removeElement("Deepak"));
		System.out.println(v);
		
		
		
		
	}

    }
