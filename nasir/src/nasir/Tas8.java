package nasir;

public class Tas8  implements Runnable{
public void run() {
	System.out.println("THREAD TASK4");
}
public static void main(String[]args) {
	Tas8 t=new Tas8();
	Thread th=new Thread(t);
	th.start();
}
}

