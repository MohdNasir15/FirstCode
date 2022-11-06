package nasir;

public class UnderAgeException extends Exception {
UnderAgeException()
{
super("you are under age");

}
UnderAgeException(String message){

super (message);
}
}
class voating{
	
	public static void main(String[]args) throws UnderAgeException {
		
		int age=20;
		try {
		if(age<18) {
			throw new UnderAgeException("u can not voating now:::");
		}
		else {
			System.out.println("u are voating now::::");
		}
	}
		catch(UnderAgeException e) {
e.printStackTrace();
		}
}}

