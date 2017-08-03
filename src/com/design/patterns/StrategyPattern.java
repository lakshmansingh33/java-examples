/**
 * 
 */
package com.design.patterns;

/**
 * @author lmuriyal
 * Scenario : Street fighter (Which changes the implementation at runtime)
 * We have created fighter class which perform common actions
 * If some special action required then create separate interface for that action and implements class for that and inject into fighter
 * Create driver program for the same
 */

public class StrategyPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Few actions
		JumpBehaviour shortJump = new ShortJump();
		JumpBehaviour longJump = new LongJump();
		KickBehaviour kick = new KickB();
		
		// Crate fighter object
		Fighter fighter = new AFighter(kick,shortJump);
		fighter.display();
		
		fighter.punch();
		fighter.roll();
		fighter.jump();
		fighter.kick();
		
		fighter.setJumpBehaviour(longJump);
		fighter.jump();

	}

}
