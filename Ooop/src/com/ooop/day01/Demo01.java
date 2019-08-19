package com.ooop.day01;
/**
 * 基本数据类型参数的传递
 * @author Administrator
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		int x = 3;
		show(x);
		System.out.println(x);
	}
	public static void show(int x) {
		x = 4;
	}
}
