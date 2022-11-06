package nasirk;
class Java{
private String Mobile;
 private int Bike;
 public String  getMobile() {
	 return Mobile;
	 
 }
 public int getBike() {
	 return Bike;
 }
 public void  setMobile(String Mobilr) {
	 this.Mobile=Mobile;
	 
 }
 public void setBike(int Bike) {
	 this.Bike=Bike;
 }
}


public class EncapsulationExamp {
	public static void main(String []args) {
		Java n=new Java();
		n.setMobile("iphne");
		n.setBike(12);
		System.out.println(" BIKE IS PULASER::__" +n.getBike());
		System.out.println("MY BOBLE IS :::"+n.getMobile());
	}
	

}
