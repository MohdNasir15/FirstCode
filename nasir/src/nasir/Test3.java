package nasir;

public class Test3 extends Thread {
	public void run() {
	try {
		for(int i=1;i<5;i++) {
			System.out.println("child thread"+i);
			Thread.sleep(1000);
		}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}
	public static void main (String []args) throws InterruptedException {
		Test3 t= new Test3();
		t.start();
		t.join();
		try {
			for(int i=1;1<=5;i++) {
				System.out.println("main thread"+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
					