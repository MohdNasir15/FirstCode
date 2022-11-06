package nasir;

public class Tes  extends Thread {
	public void run() {
		System.out.println("child thread priortiy"+Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getPriority());
	}
	public static void main(String[]args) {
		System.out.println("main thread old priority"+Thread.currentThread().getPriority());

		Thread.currentThread().getPriority();
		System.out.println("main thread new priorty:"+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		Tes t=new Tes();
		t.start();
		
		
		
	}}