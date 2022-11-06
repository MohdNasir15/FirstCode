package nasir;

public class Demo1 extends Thread {
public void run() {
	
	System.out.println("Jvm ":+Thread.currentThread());
	
}
public static void main(String []args) {
	System.out.println("Python"+Thread.currentThread().getName());
	Demo1 d=new Demo1();
	d.start();
}
}
