package nasir;

public class Exm extends Thread {
public void run() {
	System.out.println("thread run");
}

public static void main(String[]args) {
Exm e=new Exm();
e.start();
}}
