package com.ooop.day01;
/**
 * 类类型(引用类型)参数的使用
 * @author Administrator
 *
 */
public class CarDemo02 {
	public static void main(String[] args) {
		Car c1 = new Car();
		show(c1);
		Car c2 = new Car();
		show(c2);
		c1.run();
		c2.run();
	}
	public static void show(Car c) {
		c.num = 4;
		c.color = "Red";
	}
}
