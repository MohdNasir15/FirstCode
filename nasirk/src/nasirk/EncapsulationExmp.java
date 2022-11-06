package nasirk;

class NasirKha{
	private  String name;
public void setName( String name) {
	this.name =name;
}
public String getName() {
	return name;
}
}

public class EncapsulationExmp {
	public static void main(String[] args) {
		NasirKha n= new NasirKha();
		n.setName("nasir");
		System.out.println(" My Name is:"+n.getName());
	}

}
