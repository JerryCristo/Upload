package com.ooop.day02;

public class ExtendsDemo05 {
	public static void main(String[] args) {
		Son s = new Son(3);
	}
}

class Father {
	public Father() {
		System.out.println("Farther run");
	}
	public Father(int x) {
		System.out.println("Farther run"+x);
	}
}

class Son extends Father {
	public Son() {
		//�����๹������һ����һ��Ĭ�ϵ���ʽ���super()
//		super();//���ø�����޲ι�����
		/*
		 * ������û���޲ι�����,������ʹ��
		 * super���ø�����вι�����,��()ָ��
		 * ��������
		 */
//		super(3);
//		super();
		System.out.println("Son run");
	}
	public Son(int x) {
		super();
//		this();
		System.out.println("Son run"+x);
	}
}
