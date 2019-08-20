package com.ooop.day03;

public class SingleQuestions extends Questions {
	char answer;
	
	public SingleQuestions(int id,String text,String[] option,char answer) {
		this.id = id;
		this.text = text;
		this.options = option;
		this.answer = answer;
	}
	
	@Override
	public boolean check(char[] answers) {
		if(answers==null||answers.length!=1) {
			return false;
		}
		return answers[0]==answer;
	}
	
	
}
