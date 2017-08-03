/**
 * 
 */
package com.common;

/**
 * @author lmuriyal
 *
 */
public class ExceptionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(returnValue());

	}
	
	public static int returnValue(){
		try{
			System.out.println("Executing try block value "+10);
			return 10;
		}catch(Exception ex){
			return 20;
		}finally{
			System.out.println("Executing finally block");
			return 30;
		}
	}

}
