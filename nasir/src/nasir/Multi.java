package nasir;

public class Multi extends Thread {
public void run() {
	System.out.println("running....");
}
public static void main(String[]atgs) {
	
	Multi m=new Multi();
	Multi m1=new Multi();
	System.out.println("Name of m:"+m.getName());
	System.out.println("Name of m1:"+m1.getName());
	m.start();
	m1.start();
}
}
//	m1.getName("Nasir khan")
