package com.ooop.day02;

public class CicleTest {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.print();
		Point p1 = new Point(3, 4);
		Circle c1 = new Circle(p1, 4);
		c1.print();
		System.out.println(c1.area());
		Point p2 = new Point(66, 1);
		System.out.println(c1.judge(p2));
		System.out.println(c1.judge(3, 5));
	}
}
