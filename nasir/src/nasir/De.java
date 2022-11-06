package nasir;
import java.util.*;

public class De{
public static void main(String[]args) {
	
	
	int age;
	System.out.println("Enter ur age");
	Scanner  s=new Scanner(System.in);
	age=s.nextInt();
	if(age>50) {
		System.out.println(" you are avialble for voating");
	
		}
	else if (age>40) {
		System.out.println(" u are not avilble  ");
		
	}
	else if(age>30) {
		System.out.println(" yor are not avilble ");
	}
	else {
		System.out.println(" u are not avilable for vt");
	}
	}	
}

