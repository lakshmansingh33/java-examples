/**
 * 
 */
package com.search;

import java.util.Date;

import com.common.SystemInputs;

/**
 * @author lmuriyal
 *
 */
public class VComputer {
	
	public static final long minumunTime = 1000*60*15;

	private SystemInputs lastStatus;
	private Date startDateTime;
	private String motionId;
	private String modtionStatus;
	private boolean isVpavailable;
	public SystemInputs getLastStatus() {
		return lastStatus;
	}
	public void setLastStatus(SystemInputs lastStatus) {
		this.lastStatus = lastStatus;
	}
	public Date getStartDateTime() {
		return startDateTime;
	}
	public void setStartDateTime(Date startDateTime) {
		this.startDateTime = startDateTime;
	}
	public String getMotionId() {
		return motionId;
	}
	public void setMotionId(String motionId) {
		this.motionId = motionId;
	}
	public String getModtionStatus() {
		return modtionStatus;
	}
	public void setModtionStatus(String modtionStatus) {
		this.modtionStatus = modtionStatus;
	}
	public boolean isVpavailable() {
		return isVpavailable;
	}
	public void setVpavailable(boolean isVpavailable) {
		this.isVpavailable = isVpavailable;
	}
	
	
	
	public void processData(String input){
		System.out.println("Provided input ==>>"+input);
		
		boolean isCandidateId = checkWhetherInputIsCandidateId(input.split("-")[0]);
		if(input.equals(SystemInputs.VOTING_START.getInput())){
			if(input == getLastStatus().getInput()){
				System.out.println("Voting system already started");
				return ;
			}
			setLastStatus(SystemInputs.VOTING_START);
			setStartDateTime(new Date());
			System.out.println("Please start voting");
		}else if(input.equals(SystemInputs.VOTING_STOP.getInput())){
			if(null == startDateTime){
				System.out.println("Voting not started yet");
				return;
			}
			long timeElapsed = new Date().getTime() - getStartDateTime().getTime();
			if(minumunTime<timeElapsed){
				System.out.println("Voting can be stoped only after 15 min elapsed");
				return;
			}
			//PrintStatus
			//stopVoting
		}else if(input.equals(SystemInputs.VOTING_EXIT.getInput())){
			System.out.println("Exitted successfully");
		}
		
	}
	private boolean checkWhetherInputIsCandidateId(String string) {
		/*if(){
			
		}*/
		return false;
	}
}
