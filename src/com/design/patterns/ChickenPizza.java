/**
 * 
 */
package com.design.patterns;

/**
 * @author lmuriyal
 *
 */
public class ChickenPizza extends Pizza {

	public ChickenPizza(){
		description="Chicken Pizza";
	}
	@Override
	public int getCost() {
		return 100;
	}

}
