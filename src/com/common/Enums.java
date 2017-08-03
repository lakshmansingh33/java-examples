/**
 * 
 */
package com.common;

/**
 * @author lmuriyal
 *
 */
public enum Enums {
	A,B,C(10),D("Hello",30);
	
	int i;
	String str;
	private Enums(int i) {
		this.i=i;
	}
	private Enums(){
		
	}
	private Enums(String str,int i){
		this.str=str;
		this.i=i;
	}
	public int getI() {
		return i;
	}
	public String getStr() {
		return str;
	}
	
	
}
