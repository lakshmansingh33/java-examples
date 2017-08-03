/**
 * 
 */
package com.design.patterns;

/**
 * @author lmuriyal
 *
 */
public class ButterTopping extends PizzaTopping {

	private Pizza pizza;
	
	public ButterTopping(Pizza pizza){
		this.pizza=pizza;
	}
	@Override
	public String getDescription() {
		return pizza.getDescription()+" with Butter ";
	}

	@Override
	public int getCost() {
		return pizza.getCost()+25;
	}

}
