package com.ooop.day02;

public class StaticDemo02 {
	public static void main(String[] args) {
		Human.method();
		Human h = new Human("уехЩ", 3);
		h.show();
	}
}

class Human {
	private String name;
	private int age;
	static String country = "CN";

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println(this.name+":"+country+":"+this.age);
	}
	
	public static void method() {
		System.out.println(Human.country);
	}
}