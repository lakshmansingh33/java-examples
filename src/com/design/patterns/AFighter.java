/**
 * 
 */
package com.design.patterns;

/**
 * @author lmuriyal
 *
 */
public class AFighter extends Fighter {

	public AFighter(KickBehaviour kickBehaviour,JumpBehaviour jumpBehaviour){
		super(kickBehaviour,jumpBehaviour);
	}
	@Override
	public void display() {
		System.out.println("Fighter A knows ");

	}

}
