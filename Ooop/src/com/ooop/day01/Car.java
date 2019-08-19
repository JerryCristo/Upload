package com.ooop.day01;
/**
 * 描述小汽车:
 * 1.属性
 * 	颜色
 * 	轮胎数
 * 2.行为
 * 	运行
 * @author Administrator
 *
 */
public class Car {
	String color;
	int num  /*= 4*/;//显示初始化，默认初始化(int num = 0)仍然存在
	void run() {
//		int num = 10; //输出10,
		System.out.println(num+"："+color);
	}
}
