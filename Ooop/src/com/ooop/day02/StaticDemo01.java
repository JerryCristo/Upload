package com.ooop.day02;

public class StaticDemo01 {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "����";
		p.show();
		System.out.println(Person.country);
	}
}
class Person{
	String name;
	static String country = "CN";
	public static void show() {
		/*
		 * 1.��̬�����в��ܵ��÷Ǿ�̬�ĳ�Ա����
		 * 	��Ϊ��̬����������ļ��ؾ��Ѿ�������
		 * ��Ա�������Ŷ���Ĵ��������ڣ����÷���
		 * ��ʱ��û��name
		 * 2.��̬�����в���ʹ��this�ؼ��ֻ���super�ؼ���
		 */
		System.out.println(country+" "/*+this.name*/);
	}
}