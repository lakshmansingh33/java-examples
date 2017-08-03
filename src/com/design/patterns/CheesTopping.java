/**
 * 
 */
package com.design.patterns;

/**
 * @author lmuriyal
 *
 */
public class CheesTopping extends PizzaTopping {

	private Pizza pizza;

	public CheesTopping(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + " with Chees";
	}

	@Override
	public int getCost() {
		return pizza.getCost()+35;
	}

}
