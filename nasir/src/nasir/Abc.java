package nasir;

public class Abc implements Runnable {
public void run()
{
	try {
		
		thread.sleep(100);
	}
	catch(InterruptedException ie) {
		ie.printStackTrace();
	}
	
	System.out.println("The state of thread t1 while it invoked the method join() on thread t2 -"+ ThreadState.t1.getState());  
try {
	thread.sleep(200);
}
catch(InterruptedException ie) {
	
}


} 

	

}
