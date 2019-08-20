package com.ooop.day03;
/**
 * È®°´ÕÕ¹¦ÄÜ»»·Ö:µ¼Ã¤È®,¼©¶¾È®,ËÑ±¬È®,ÄÁÑòÈ®...
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

