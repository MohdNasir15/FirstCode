package nasir;

public class Sleep extends Thread {
public void run() {
	for(int i=1;i<5;i++) {
		
		try {
			Thread.sleep(500);
		}
		catch(InterruptedException e) {
			
				System.out.println(e);
			
			System.out.println(i);
		}
	}
	
	public static void main(String[]args) {
		sleep s=new sleep();	
		sleep s2=new sleep();
		s1.start();
		s2.start();
	
}
}
