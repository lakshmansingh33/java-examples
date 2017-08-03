/**
 * 
 */
package com.design.patterns;

/**
 * @author lmuriyal
 *
 */
public class ScoreUpdater implements Observer {

	private int updatedScore;
	
	@Override
	public void update(int runs, int overs, int wickets) {
		updatedScore = runs;
		displayRuns();
	}

	private void displayRuns() {
		System.out.println(" Updated score as follows "+updatedScore);
	}
	

	

}
