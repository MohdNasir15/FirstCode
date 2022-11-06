package nasir;
import java.util.Scanner;
public class YoungerAgeException extends RuntimeException {
YoungerAgeException(String msg) {
	super(msg);

}
}
 class voating{
	 public static void main(String[]args) {
		 
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter Your age....");
		 int age=s. nextInt();
		 if(age<18) {
			 throw new YoungerAgeException("You are not eligible for voating");
			 
		 }
		 
		 else {
			 System.out.println("you can voate sucessfully");
		 }
		
	 }
 }