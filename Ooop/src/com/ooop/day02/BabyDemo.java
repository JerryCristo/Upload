package com.ooop.day02;

public class BabyDemo {
	public static void main(String[] args) {
		Baby b = new Baby();
		b.speak();
		Baby b1 = new Baby("����");
		b1.speak();
	}
}
class Baby{
	{//��������,���ڸ�ȫ�������г�ʼ��
		cry();
	}
	private String name;
	public Baby() {
		this.name = "baby";
//		cry();
	}
	public Baby(String name) {
		this.name = name;
//		cry();
	}
	public void speak() {
		System.out.println(this.name);
	}
	public void cry() {
		System.out.println("Cry");
	}
}