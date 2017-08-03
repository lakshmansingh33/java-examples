/**
 * 
 */
package com.design.patterns;

/**
 * @author lmuriyal
 *
 */
public class MuttonPizza extends Pizza {

	public MuttonPizza() {
		description = "Mutton Pizza";
	}

	@Override
	public int getCost() {
		return 150;
	}

}
