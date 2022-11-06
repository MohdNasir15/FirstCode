package nasir;

public class Ab extends Thread
{
	public void run() {
		System.out.println("task1");
	}

}
class A2 extends Thread {
	public void run() {
		
	}
}
class main{
	public static void  main(String []args) {
		Ab a=new Ab();
		a.start();
		A2 a2=new A2();
		a2.start();
	}
}