package com.ooop.day02;

public class Circle {// Բ��
	Point center = new Point(0, 0);
	double r;

	// ����޲ι�����
	public Circle() {

	}

	// �вι�����
	public Circle(Point center, double r) {
		this.center = center;
		this.r = r;
	}

	public void print() {
		this.center.print();
		System.out.println("�뾶Ϊ" + this.r);
	}

	// ��ǰԲ����� Math.Pi
	public double area() {
		return (Math.PI * r * r);
	}

	// �жϵ��Ƿ���Բ��
	public boolean judge(Point p) {
//		if(p.distance(this.center)<=r) {
//			return true;
//		}
//		return false;
		return p.distance(center) <= r;
	}

	// ���ط������ж�һ�������Ƿ���Բ��
	public boolean judge(int x, int y) {
//		Point p = new Point(x,y);
//		if(p.distance(this.center)<=r) {
//			return true;
//		}
//		return false;
		return center.distance(x, y) <= r;
	}
}
