/**
 * 
 */
package com.design.patterns;

/**
 * @author lmuriyal
 *
 */
public abstract class Pizza {
	
	public String description ="Unknow as of now";
	
	public String getDescription(){
		return description;
	}
	public abstract int getCost();
	

}
