package com.ooop.day01;

public class ConsDemo01 {
	public static void main(String[] args) {
		Person p = new Person();
		/*
		 * ���췽�����Ǵ�������ʱ���õķ���
		 * ����:���Ը�������г�ʼ��,ʹ����һ������������
		 * �;߱�һЩ����
		 * ����Ĵ��������뾭�����췽�����г�ʼ��
		 * ���һ������û
���ͻ���һ��Ĭ�ϵ�
		 * �޲ι�����,��������������,��ôĬ�ϵ��޲ι�����
		 * �Ͳ�������
		 */
		p.speak();
		Person p1 = new Person("ţ��",6);
		p1.speak();
	}
}

class Person {
	String name;
	int age;
	public Person() {//�޲ι�����
		name = "baby";
		age = 1;
		System.out.println("Person run");
	}
	public Person(String n,int a) {
		name = n;
		age = a ; 
	}
	public void speak() {
		System.out.println(name+":"+age);
	}
}