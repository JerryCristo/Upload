package com.ooop.day02;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(2, 3);
		p.print();
		Point p1 = new Point();
		p1.print();
		Point p2 = new Point(3);
		p2.print();
		Point p3 = new Point(3, 4);
		p3.print();
		System.out.println(p3.distance());
		System.out.println(p3.distance(-3, -4));
		Point p4 = new Point(6, 8);
		System.out.println(p3.distance(p4));
//		TestDemo t = new TestDemo();
	}
}
