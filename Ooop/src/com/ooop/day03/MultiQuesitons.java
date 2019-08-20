package com.ooop.day03;

import java.util.Arrays;

public class MultiQuesitons extends Questions {
	char answers[];
	
	public MultiQuesitons(int id,String text,String[] option,char[] answers) {
		this.id = id;
		this.text = text;
		this.options = option;
		this.answers = answers;
	}
	
	@Override
	public boolean check(char[] answers) {
		if(answers.length>1&&answers.length<=4) {
			Arrays.sort(answers);
			return Arrays.equals(answers, this.answers);
		}
		return false;
	}
}
