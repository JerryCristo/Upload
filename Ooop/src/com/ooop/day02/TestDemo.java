package com.ooop.day02;
/**
 * 在一个类中静态代码块,构造代码块,构造器,
	它们执行的先后顺序是什么?
 * @author Administrator
 *
 */
public class TestDemo {
	{
		System.out.println("ConsCode");
	}
	static {
		System.out.println("StaticCode");
	}
	public TestDemo() {
		System.out.println("Cons");
	}
}

