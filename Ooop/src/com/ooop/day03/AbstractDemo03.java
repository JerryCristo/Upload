package com.ooop.day03;
/**
 * ��Աʵ��:
 * 	����:��˾�г���Ա������,����,нˮ,��������
 * 	��Ŀ����������,����,нˮ,��������,����
 * 	�Ը�����Ҫ��������ݽ�ģ
 * 	����:
 * 	����Ա:
 * 		����:����,����,нˮ
 * 			
 * 		��Ϊ:����
 * 	��Ŀ����:
 * 		����:����,����,нˮ,����
 * 
 * 		��Ϊ:����
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












