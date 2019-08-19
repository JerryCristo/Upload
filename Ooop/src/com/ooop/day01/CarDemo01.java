package com.ooop.day01;

public class CarDemo01 {
	public static void main(String[] args) {
//		Car c = new Car();
//		c.color = "red";
//		c.num = 4;
//		c.run();//要使用对象中内容，可以通过对象.成员的方式
		/**
		 * 成员:
		 * 不管属性还是行为都是这一类事物的组成部分,
		 * 都称之为成员,属性又叫做成员变量,行为又叫做
		 * 成员方法
		 * 定义类就是在定义该类的成员
		 */
//		Car c1 = new Car();
//		Car c2 = new Car();
//		c1.num = 5;
//		c2.color = "yellow";
//		c1.run();
		Car c1 = new Car();
		//一个对象可以被多个变量所引用
		Car c2 = c1;
		c1.num = 8;
		c2.color = "green";
		c1.run();
		c2.run();
	}
}
