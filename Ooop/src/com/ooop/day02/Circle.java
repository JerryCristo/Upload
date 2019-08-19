package com.ooop.day02;

public class Circle {// 圆类
	Point center = new Point(0, 0);
	double r;

	// 添加无参构造器
	public Circle() {

	}

	// 有参构造器
	public Circle(Point center, double r) {
		this.center = center;
		this.r = r;
	}

	public void print() {
		this.center.print();
		System.out.println("半径为" + this.r);
	}

	// 求当前圆的面积 Math.Pi
	public double area() {
		return (Math.PI * r * r);
	}

	// 判断点是否在圆内
	public boolean judge(Point p) {
//		if(p.distance(this.center)<=r) {
//			return true;
//		}
//		return false;
		return p.distance(center) <= r;
	}

	// 重载方法，判断一个坐标是否在圆内
	public boolean judge(int x, int y) {
//		Point p = new Point(x,y);
//		if(p.distance(this.center)<=r) {
//			return true;
//		}
//		return false;
		return center.distance(x, y) <= r;
	}
}
