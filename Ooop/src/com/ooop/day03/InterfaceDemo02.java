package com.ooop.day03;
/**
 * Ȯ���չ��ܻ���:��äȮ,����Ȯ,�ѱ�Ȯ,����Ȯ...
 * 
 * @author Administrator
 *
 */
public class InterfaceDemo02 {

}

abstract class Gou{
	abstract void bellow();
}

interface Guide{
	public abstract void guide();
}
class GuideDog extends Gou implements Guide{
	void bellow() {
		
	}
	public void guide() {
		
	}
}

