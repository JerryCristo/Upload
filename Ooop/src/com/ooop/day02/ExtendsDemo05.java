package com.ooop.day02;

public class ExtendsDemo05 {
	public static void main(String[] args) {
		Son s = new Son(3);
	}
}

class Father {
	public Father() {
		System.out.println("Farther run");
	}
	public Father(int x) {
		System.out.println("Farther run"+x);
	}
}

class Son extends Father {
	public Son() {
		//在子类构造器第一行有一个默认的隐式语句super()
//		super();//调用父类的无参构造器
		/*
		 * 父类中没有无参构造器,子类中使用
		 * super调用父类的有参构造器,在()指定
		 * 参数即可
		 */
//		super(3);
//		super();
		System.out.println("Son run");
	}
	public Son(int x) {
		super();
//		this();
		System.out.println("Son run"+x);
	}
}
