package com.ooop.day03;

public class FinalDemo {

}

/*final*/ class Father{
	/*final*/ int x =1;
	/*final*/ void method() {
		
	}
}

class Son extends Father {
	void method() {
		x = 10;
		System.out.println("...");
	}
	
}