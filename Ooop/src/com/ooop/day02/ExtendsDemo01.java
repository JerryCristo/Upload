package com.ooop.day02;

public class ExtendsDemo01 {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "����";
		s.age = 23;
		s.study();
		Worker w = new Worker();
	}
}

class Student extends People {//����
//	String name;
//	int age;

	void study() {
		System.out.println(name + "student study" + age);
	}
}

class Worker extends People {//����
//	String name;
//	int age;

	void work() {
		System.out.println(name + "worker work" + age);
	}
}

class People {//����
	String name;
	int age;

}
