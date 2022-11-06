package nasir;

public class Test2  {
public void run() {
	System.out.println("THREAD TASK");
}
public static void main(String[]args) {
	
	Tas2 t=new Test2();
	Thread th=new Thread(t);
	
}
}
