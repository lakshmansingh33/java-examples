/**
 * 
 */
package com.design.patterns;

/**
 * @author lmuriyal
 *
 */
public class RunRateUpdater implements Observer {

	private int updatedRunRate;
	
	@Override
	public void update(int runs, int overs, int wickets) {
		updatedRunRate = runs/overs;
		displayRunRate();
	}

	private void displayRunRate() {
		System.out.println("Updated run rate is as follows "+updatedRunRate);
		
	}

	

}
