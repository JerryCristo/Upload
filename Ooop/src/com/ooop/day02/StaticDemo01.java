package com.ooop.day02;

public class StaticDemo01 {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "张三";
		p.show();
		System.out.println(Person.country);
	}
}
class Person{
	String name;
	static String country = "CN";
	public static void show() {
		/*
		 * 1.静态方法中不能调用非静态的成员变量
		 * 	因为静态方法随着类的加载就已经存在了
		 * 成员变量随着对象的创建而存在，调用方法
		 * 的时候还没有name
		 * 2.静态方法中不能使用this关键字或者super关键字
		 */
		System.out.println(country+" "/*+this.name*/);
	}
}