package nasirk;

 class GetAndSet {
	private String name; 
	private int mobile;
	
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
 class Test10{
	public static void main(String[] args) {
		GetAndSet s1=new GetAndSet();
		s1.setName("Mohammad_Nasir");
		s1.setMobile(9161);
		System.out.println(s1.getName() + s1.getMobile());
	}
	
}

