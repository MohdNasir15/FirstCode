package nasir;

public class Nas extends  Thread
{
public void run() {
	
	System.out.println("thread demo");
	
}

public static void main(String []ar) {
	Nas n=new Nas ();
	n.start();
}}