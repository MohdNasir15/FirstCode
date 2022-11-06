package nasir;

public class N  extends Thread

{
public void run() {
	try {
		 mainthread.join();
		//mainthread.join();
		for(int i=1;i<5;i++) {
			System.out.println("child thread"+i);
			Thread.sleep(1000);
		}
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
public static void main(String[]args) {
	mainthread=Thread.currentThread();
	N a=new N();
	a.start();
	try {
		for(int i=1;i<5;i++) {
			System.out.println("main Thread:  "+i);
		
			Thread.sleep(1000);
		}
	}
	catch (Exception e) {
		System.out.println(e);
	}
}
}
