/**
 * 
 */
package com.design.patterns;

/**
 * @author lmuriyal
 *
 */
public abstract class  Fighter {
	
	private KickBehaviour kickBehaviour;
	private JumpBehaviour jumpBehaviour;
	
	public  abstract void display();
	
	public Fighter(KickBehaviour kickBehaviour,JumpBehaviour jumpBehaviour){
		this.kickBehaviour=kickBehaviour;
		this.jumpBehaviour=jumpBehaviour;
	}

	public KickBehaviour getKickBehaviour() {
		return kickBehaviour;
	}

	public void setKickBehaviour(KickBehaviour kickBehaviour) {
		this.kickBehaviour = kickBehaviour;
	}

	public JumpBehaviour getJumpBehaviour() {
		return jumpBehaviour;
	}

	public void setJumpBehaviour(JumpBehaviour jumpBehaviour) {
		this.jumpBehaviour = jumpBehaviour;
	}
	
	public void punch(){
		System.out.println("Default punch");
	}
	
	public void roll(){
		System.out.println("Default roll");
	}
	
	public void jump(){
		jumpBehaviour.jump();
	}
	
	public void kick(){
		kickBehaviour.kick();
	}
	

}
