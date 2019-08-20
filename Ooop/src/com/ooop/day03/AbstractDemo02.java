package com.ooop.day03;

public class AbstractDemo02 {

}

abstract class Canidae {
	abstract void bellow();
}

class Dog extends Canidae{

	@Override
	void bellow() {
		System.out.println("Wang wang ");
	}
}

class Wolf extends Canidae {
	@Override
	void bellow() {
		System.out.println("Ao ao");
		
	}
}
