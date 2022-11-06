package nasir;

 class Animal{
	void eat() { 
		System.out.println("eating");
	}
	
}
class Dog extends Animal {
	void dark() {
		System.out.println("darking");
	}
	public static void main(String args[]) {
		Dog d=new Dog();
		d.dark();
		d.eat();
		
	}
}

