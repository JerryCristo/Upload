package com.ooop.day01;

public class CarDemo01 {
	public static void main(String[] args) {
//		Car c = new Car();
//		c.color = "red";
//		c.num = 4;
//		c.run();//Ҫʹ�ö��������ݣ�����ͨ������.��Ա�ķ�ʽ
		/**
		 * ��Ա:
		 * �������Ի�����Ϊ������һ���������ɲ���,
		 * ����֮Ϊ��Ա,�����ֽ�����Ա����,��Ϊ�ֽ���
		 * ��Ա����
		 * ����������ڶ������ĳ�Ա
		 */
//		Car c1 = new Car();
//		Car c2 = new Car();
//		c1.num = 5;
//		c2.color = "yellow";
//		c1.run();
		Car c1 = new Car();
		//һ��������Ա��������������
		Car c2 = c1;
		c1.num = 8;
		c2.color = "green";
		c1.run();
		c2.run();
	}
}
