/**
 * 
 */
package com.design.patterns;

/**
 * @author lmuriyal
 *
 */
public class BFighter extends Fighter {

	public BFighter(KickBehaviour kickBehaviour,JumpBehaviour jumpBehaviour){
		super(kickBehaviour,jumpBehaviour);
	}
	@Override
	public void display() {
		System.out.println(" Fighter B Knows ");

	}

}
