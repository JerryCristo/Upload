package com.ooop.day02;

public class ExtendsDemo04 {
	public static void main(String[] args) {

	}
}

class Phone {
	void show() {
		System.out.println("number");
	}
}

class Iphone extends Phone {
	void show() {
		/*
		 * 当对一个类进行子类的扩展,子类需要保留父类
		 * 的功能声明,但是要定义子类中该功能的特有内容
		 * 时,就使用覆盖(重写)操作来完成
		 */
		System.out.println("number");
		System.out.println("name");
		System.out.println("photo");
	}
}