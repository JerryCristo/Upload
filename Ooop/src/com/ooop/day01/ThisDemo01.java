package com.ooop.day01;

public class ThisDemo01 {
	public static void main(String[] args) {
		People p1 = new People("张三",3);
//		p1.speak();
		People p2 = new People("李四",4);
//		p2.speak();
		People p3 = new People("王五",5);
		System.out.println(p1.compare(p2));
	}
}
class People {
	private String name ;
	private int age ;
	public People(String name ,int age) {
		this(name);//this.name = name;
		this.age = age;
//		this(name);//Constructor call must be the first statement in a constructor
	}
	public People(String name) {
		this.name = name ;
	}
	public void speak() {
		System.out.println(name+" "+age);
	}
	public boolean compare(People p) {
		return this.age==p.age;
	}
}
