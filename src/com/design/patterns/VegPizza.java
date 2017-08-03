/**
 * 
 */
package com.design.patterns;

/**
 * @author lmuriyal
 *
 */
public class VegPizza extends Pizza {

	public VegPizza(){
		description = "Veggie";
	}
	@Override
	public int getCost() {
		return 80;
	}

}
