package com.ooop.day03;

public class Questions {
	int id ;
	String text;
	String[] options;
	
	//检查用户答案是否正确
	public boolean check(char[] answers) {
		return false;
	}
	
	//打印一个题目到控制台
	public void print() {
		System.out.println(id+"."+text);
		for(int i =0;i<=options.length-1;i++) {
			System.out.println(options[i]);
		}
	}
	
}

