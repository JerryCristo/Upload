package com.ooop.day02;

public class ExtendsDemo04 {
	public static void main(String[] args) {

	}
}

class Phone {
	void show() {
		System.out.println("number");
	}
}

class Iphone extends Phone {
	void show() {
		/*
		 * ����һ��������������չ,������Ҫ��������
		 * �Ĺ�������,����Ҫ���������иù��ܵ���������
		 * ʱ,��ʹ�ø���(��д)���������
		 */
		System.out.println("number");
		System.out.println("name");
		System.out.println("photo");
	}
}