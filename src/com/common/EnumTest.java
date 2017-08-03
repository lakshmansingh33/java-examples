/**
 * 
 */
package com.common;

/**
 * @author lmuriyal
 *
 */
public class EnumTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Enums en = Enums.A;
		System.out.println(en);
		System.out.println(en+" and values is "+en.getI()+" string values is "+en.getStr());

		
		Enums en1 = Enums.C;
		System.out.println(en1+" and values is "+en1.getI()+" string values is "+en1.getStr());
		
		Enums en2 = Enums.D;
		System.out.println(en2+" and values is "+en2.getI()+" string values is "+en2.getStr());


	}

}
