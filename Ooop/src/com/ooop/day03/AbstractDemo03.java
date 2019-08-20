package com.ooop.day03;
/**
 * 雇员实例:
 * 	需求:公司中程序员有姓名,工号,薪水,工作内容
 * 	项目经理有姓名,工号,薪水,工作内容,奖金
 * 	对给出的要求进行数据建模
 * 	分析:
 * 	程序员:
 * 		属性:姓名,工号,薪水
 * 			
 * 		行为:工作
 * 	项目经理:
 * 		属性:姓名,工号,薪水,奖金
 * 
 * 		行为:工作
 * @author Administrator
 *
 */
public class AbstractDemo03 {

}

abstract class Employee {
	private String name;
	private String id;
	private double pay;

	public Employee(String name, String id, double pay) {
		this.name = name;
		this.id = id;
		this.pay = pay;
	}

	public abstract void work();
}

//
class Programmer extends Employee {

	public Programmer(String name, String id, double pay) {
		super(name, id, pay);
	}

	public void work() {
		System.out.println("Code");
	}

}

class Manager extends Employee {
	private int bonus;

	public Manager(String name, String id, double pay, int bonus) {
		super(name, id, pay);
		this.bonus = bonus;
	}

	public void work() {
		System.out.println("manage");
	}
}












