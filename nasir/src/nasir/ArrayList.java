package nasir;
import  java.util.*;
 public class ArrayListExample {
	public static void main(String[]args) {
		ArrayList<String> list=new ArrayList<String>();
list.add("mango");
list.add("Apple");
list.add("Banana");
list.add("Grapes");
Iterator itr=list.iterator();
//while(itr.hasNext()
while(itr.hasNext()){
System.out.println(itr.next());
	}
	}
}
