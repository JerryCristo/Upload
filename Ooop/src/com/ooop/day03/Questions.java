package com.ooop.day03;

public class Questions {
	int id ;
	String text;
	String[] options;
	
	//����û����Ƿ���ȷ
	public boolean check(char[] answers) {
		return false;
	}
	
	//��ӡһ����Ŀ������̨
	public void print() {
		System.out.println(id+"."+text);
		for(int i =0;i<=options.length-1;i++) {
			System.out.println(options[i]);
		}
	}
	
}

