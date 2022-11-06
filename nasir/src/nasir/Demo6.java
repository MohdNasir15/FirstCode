package nasir;

public class Demo6 {
	public static void main(String[]args)
	{
		try {
		int a=100;
		int b=0;
		int c;
		c=a/b;
		System.out.println(c);
		
	}
	catch(ArithmeticException ae)
	{
		// ae.printStackTrace();
		System.out.println(ae);
		System.out.println(ae.getMessage());
	
	}

}}
