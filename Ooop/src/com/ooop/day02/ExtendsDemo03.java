package com.ooop.day02;

public class ExtendsDemo03 {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.show();
		z.show();
	}
}

class Fu{
	public void show() {
		System.out.println("fu show run");
	}
}

class Zi extends Fu {
	public void show() {
		System.out.println("zi show run");
	}
}
