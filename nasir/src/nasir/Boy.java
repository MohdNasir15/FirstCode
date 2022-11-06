package nasir;


class Dog1{
	void eat(){
		System.out.println("eating the dog");}}
 class Baby extends Dog1 {
	 void weep() {
		 System.out.println("wepping ");
}}
 class Boy extends Baby{
	 void play(){
		 System.out.println("playing");
		 
	 } public static void main(String[]args) {
		 Boy b=new Boy ();
		 b.eat();
		 b.weep();
		 b.play();
		 
	 }
	 }
 