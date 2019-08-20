package com.ooop.day03;

public class AbstractDemo01 {

}

abstract class Demo {
	abstract void show();
}

class DemoA extends Demo {
	void show() {
		System.out.println("DemoA show");
	}
}

class DemoB extends Demo {
	void show() {
		System.out.println("DemoB show");
	}
}