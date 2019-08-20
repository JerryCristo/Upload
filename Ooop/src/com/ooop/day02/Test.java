package com.ooop.day02;
/*
 * 	它们执行的先后顺序是什么?
	静态代码块,构造代码块,构造器
 */
public class Test {
	public static void main(String[] args) {
		TestDemo t = new TestDemo();
		Father f = new Father();
		f = new Son();
	}
}
