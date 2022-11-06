package nasirk;

 class TestCase {
 String name;
 int mobile;

  public String getName() {
	  return name;	  
  }
  public int getMobile() {
	  return mobile;
  }
  public void setName(String name) {
	  
	  this.name=name;
  }	
  public void setMobile(int mobile) {
	  this.mobile=mobile;
  }
}
class Test_01{
	public static void main(String[] args) {
		TestCase a1=new TestCase();
		a1.setName("Mohammad");
		a1.setMobile(123);
		System.out.println(a1.getName()+a1.getMobile());
	}
}