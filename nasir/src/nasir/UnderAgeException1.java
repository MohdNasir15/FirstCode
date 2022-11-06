package nasir;

public class UnderAgeException1 extends RuntimeException {
UnderAgeException1(){
	

super("u are under  age");
}
UnderAgeException1(String msg) {
}
}
class voting{
	public static void main (String[]args) {
		int age=19;
		try {
		if(age<20) {
		
	}
	throw new UnderAgeException1();
		}
		catch(UnderAge)
}}

