/**
 * 
 */
package com.common;

/**
 * @author lmuriyal
 *
 */
public enum SystemInputs {

	VOTING_START("start", "User input to start system "),
	VOTING_STOP("stop", "User input to stop system "),
	VOTING_STATUS("status", "User input to know status "),
	VOTING_EXIT("exit", "User input to exit "),
	MIN_CANDIDATE_ID("1","Minimum candidate id"),
	MAX_CANDIDATE_ID("101","Maximum candiate id"),
	CANDIDATE_IDS("1-101","Id range"),
	VP_ID("102","VP input Id"),
	VP_AVAILABLE("VP_AVAILABLE","VP Available for voting"),
	MOTION_ONE("motion1","BUDGET_SCHEME"),
	MOTION_TWO("motion2","EMPLOYMENT_SCHEME");
	
	private String input;
	private String message;

	private SystemInputs(String input, String message) {
		this.input = input;
		this.message = message;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
