package nasirk;

public class Bank {
	float getRateOfInterest(){
		return 0;
	}}
class SBI extends Bank{
	float getRateOfInterset() {
		return 8.5f;
	}
}
class ICICI extends Bank{
	float getRateOfInterset(){
	return 9.6f ;
}}
class AXIS extends Bank{
	float getRateOfInterset() {
		return 5.2f;
		
	}
}
class Test{
	public static void main(String[]args) {
		Bank b;
		b=new SBI();
		System.out.println(" SBI get rate of interset"+ b.getRateOfInterest());
		
		
	}
}