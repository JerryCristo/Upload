package com.ooop.day02;

public class StaticCodeDemo {
	public static void main(String[] args) {
		new StaticCode().show();
		new StaticCode().show();
	}
}
class StaticCode{
	static int num = 10;
	static {//��̬�����,������ļ��ض�ִ��,����ִֻ��һ��
		System.out.println("HW");
		num = 10*num+10;
	}
	void show() {
		System.out.println("show run");
	}
}