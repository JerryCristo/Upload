package com.ooop.day02;

public class Point {
	public int x;
	public int y;

	public Point() {// 点类

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point(int x) {
		this.x = x;
		y = x;
	}

	public void print() {
		System.out.println("坐标为" + this.x + "," + this.y);
	}

	// 计算当前点到原点的问题
	public double distance() {
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}

	// 重载方法，表示当前点到一个坐标的距离
	public double distance(int x, int y) {

		return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
	}

	// 重载方法，表示当前点到另外一个点的距离
	public double distance(Point p) {
//		return Math.sqrt((this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y));
		return this.distance(p.x, p.y);
	}
}
