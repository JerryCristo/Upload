package com.ooop.day03;

import java.util.Scanner;

public class PaperDemo {
	public static void main(String[] args) {
		String str1 = new String("abc");
		Questions[] paper = new Questions[2];
		paper[0] = new SingleQuestions(1, "1+1=?", new String[] {"A.1","B.2","C.3","D.4"}, 'B');
		paper[1] = new MultiQuesitons(2, "1+1>?",new String[] {"A.1","B.2","C.0","D.-1"}, new char[]
		{'C','D'});
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<paper.length;i++) {
			paper[i].print();
			System.out.println("�������");
			String answers = sc.next().toUpperCase();
			char[] ans = answers.toCharArray();
			if(paper[i].check(ans)) {
				System.out.println("��ȷ");
			}
			else {
				System.out.println("����");
			}
		}
	}
}
