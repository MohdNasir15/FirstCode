package nasirk;

public class Anim {
	void eat() {
		System.out.println("eating");
	}

}
class Dog extends Anim{
	void wal() {
		System.out.println("walking");
	}
}
class Baby extends Anim{
void cry() {
	System.out.println("crying");
}
}
class Inheritance3{
	public static void main(String []args) {
		Baby b= new Baby();
		b.eat();
	//	b.wal();
		b.cry();
	}
}
