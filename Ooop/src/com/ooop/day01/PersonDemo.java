//package com.ooop.day01;
//	
//public class PersonDemo {
//	public static void main(String[] args) {
//		Person per = new Person();
//		per.setAge((-18));
//		per.speak();
//	}
//}
///*
// * 一个.java文件中最多只能有一个public修饰的类
// * public修饰的类类名必须与.java文件的文件名一致
// */
//class Person {
//	private int age;// 私有的属性只在本来中可以使用
//
//	void speak() {
//		System.out.println(getAge());
//	}
//
//	// 对外提供一个公共的访问方法
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		if (age >= 0 && age <= 150) {
//			this.age = age;
//		}
//		else {
//			System.out.println("re");
//		}
//	}
//}
