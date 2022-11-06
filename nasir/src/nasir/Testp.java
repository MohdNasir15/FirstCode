package nasir;

public class Testp extends Thread {
	public void run () {
		System.out.println("Khan is executed by: "+Thread.currentThread().getName());}
		public static void main(String []args) {
			System.out.println("Nasir is printed by:" +Thread.currentThread().getName());
			Testp t=new Testp();
			t.start();
				
			
			
		
	
}
					
		
}
