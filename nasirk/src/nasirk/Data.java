package nasirk;
class Abcd{
	private String Phone;
	public void setPhone(String Phone) {
		this.Phone =Phone;
	}
	public String getPhone() {
		return Phone;
	}
}

public class Data {
	public static void main(String[]args) {
		Abcd c=new Abcd();
		c.setPhone("IPHONE APPLE");
		System.out.println(" MY NEW PHONE IS:----"+ c.getPhone());
		
	}

}
