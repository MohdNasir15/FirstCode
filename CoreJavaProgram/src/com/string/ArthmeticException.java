package com.string;

public record ArthmeticException() {
try {
	int data=100/0;
	
}
catch(ArthmeticException e) {
	System.out.println(e);
}
System.out.println("rest of the code....");

}
}
