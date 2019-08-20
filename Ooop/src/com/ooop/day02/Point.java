package com.ooop.day02;

public class Point {
	public int x;
	public int y;

	public Point() {// ����

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
		System.out.println("����Ϊ" + this.x + "," + this.y);
	}

	// ���㵱ǰ�㵽ԭ�������
	public double distance() {
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}

	// ���ط�������ʾ��ǰ�㵽һ������ľ���
	public double distance(int x, int y) {

		return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
	}

	// ���ط�������ʾ��ǰ�㵽����һ����ľ���
	public double distance(Point p) {
//		return Math.sqrt((this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y));
		return this.distance(p.x, p.y);
	}
}
