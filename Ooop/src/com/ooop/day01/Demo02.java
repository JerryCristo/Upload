package com.ooop.day01;
/**
 * �����������Ͳ����Ĵ���
 * @author Administrator
 *
 */
public class Demo02 {
	int x = 3;
	public static void main(String[] args) {
		Demo02 d = new Demo02();
		d.x = 9;
		show(d);
		System.out.println(d.x);
	}
	public static void show(Demo02 d) {
		d.x = 4;
	}
}
