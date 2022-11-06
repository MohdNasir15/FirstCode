package nasir;

 class Employ {
	 float salary=50000;
	 
 }
 class Programer extends Employ{
	 int bouns =1000;
	 public static void main(String[]args) {
		 Programer p = new Programer();
		 System.out.println(" programer  salary is:"+p.salary);
		 System.out.println("bouuns of programer is:+p.bouuns");
	 }}