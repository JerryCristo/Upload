package com.ooop.day01;

public class ConsDemo01 {
	public static void main(String[] args) {
		Person p = new Person();
		/*
		 * 构造方法就是创建对象时调用的方法
		 * 作用:可以给对象就行初始化,使对象一旦被创建出来
		 * 就具备一些内容
		 * 对象的创建都必须经过构造方法进行初始化
		 * 如果一个类中没
器就会有一个默认的
		 * 无参构造器,如果定义过构造器,那么默认的无参构造器
		 * 就不存在了
		 */
		p.speak();
		Person p1 = new Person("牛逼",6);
		p1.speak();
	}
}

class Person {
	String name;
	int age;
	public Person() {//无参构造器
		name = "baby";
		age = 1;
		System.out.println("Person run");
	}
	public Person(String n,int a) {
		name = n;
		age = a ; 
	}
	public void speak() {
		System.out.println(name+":"+age);
	}
}