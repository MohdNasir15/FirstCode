package nasir;

public class Medical {
public void run() {
	try {
		System.out.println("Medical Start");
		Thread.sleep(3000);
		System.out.println("Midical Complete ");
	}
	catch(Exception e) {
		System.out.println(e);
		
	}
}

public void start() {
	// TODO Auto-generated method stub
	
}
}
class Drive extends Thread{
	public void run(){
		try {
			System.out.println("test drive start");
			Thread.sleep(500);
			System.out.println("test drive completed");
		}
	
	catch(Exception  e) {
		System.out.println(e);
	}
}}
class Officer extends Thread
{
	
public void run() {
	try {
		System.out.println("office takes the file");
		Thread.sleep(3000);
		System.out.println("officer works completed");
	}

catch(Exception e) {
	System.out.println(e);
}
}
}
 class Demok{
	public static void main(String []aregs) throws InterruptedException {
		Medical medical= new Medical();
		medical.start();
		Thread thread = new Thread();
		thread.join();
		Drive d=new Drive();
		d.start();
		d.join();
		Officer o=new Officer();
		o.start();
	}
}