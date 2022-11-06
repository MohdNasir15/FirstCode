package nasirk;

 class Adder {
	static int add(int a, int b) {
		return a+b;
	}
static double add(double a,double b) {
	return a+b;
}
}
class OverLoading{
	public static void main(String[]args) {
		System.out.println(Adder.add(22,11));
		System.out.println(Adder.add(30.9,40.4));
			}
}
