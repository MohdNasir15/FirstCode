package nasir;

public class Demo7 {
	public static void main(String[] args) {
		try {
			
			int data=100/5;
			System.out.println(data);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
			
		}
		finally {
			System.out.println("finally block is always");
		}
		
	}

}
