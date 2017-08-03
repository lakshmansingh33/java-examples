/**
 * 
 */
package com.design.patterns;

/**
 * @author lmuriyal
 * Scenario : Pizza centers (Which adds new funcationality at runtime)
 * We have considered Pizza as base abstrat class with abstract method cost
 * We have considered PizzTopping as another abstract class which extends Pizza class. This has description method as abstract
 * We have created Chicken and Mutton pizza class by extending Pizza class and overridded cost method
 * If any topping is required on order pizza we can go for Topping classes which extends PizzaTopping class and add additional top up value to total cost
 * 
 */
public class DecoratorPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pizza chknPzza = new ChickenPizza();
		Pizza mttnPzza = new MuttonPizza();
		
		Pizza tpdPizza = new CheesTopping(chknPzza);
		tpdPizza = new ButterTopping(tpdPizza);
		
		Pizza mtnTpdPizza = new CheesTopping(mttnPzza);
		mtnTpdPizza = new ButterTopping(mtnTpdPizza);
		
		System.out.println(tpdPizza.getDescription()+" "+tpdPizza.getCost());
		System.out.println(mtnTpdPizza.getDescription()+" "+mtnTpdPizza.getCost());
	}

}
