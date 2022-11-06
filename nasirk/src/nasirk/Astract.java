package nasirk;

abstract class Bike71 {
	abstract void run();
	

}
class Honda8 extends Bike71{
	void run() {
		System.out.println(" running is safly ");
		Bike71 b= new Honda8();
		b.run();
		
	}
	
}
