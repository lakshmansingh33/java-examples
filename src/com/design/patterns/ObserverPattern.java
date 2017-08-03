/**
 * 
 */
package com.design.patterns;

/**
 * @author lmuriyal
 *
 */
/* Scenario : We have cricket data which we need to update to different UI components
 * Interface used Observer and Subject
 * Classes which implements Observer interface acts as receiving components
 * Class which implements Subject acts as data updater
 */
public class ObserverPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RunRateUpdater rru = new RunRateUpdater();
		ScoreUpdater sru = new ScoreUpdater();
		
		CricketData cd = new CricketData();
		cd.registerSubscriber(rru);
		cd.registerSubscriber(sru);
		
		cd.dataChanged();

	}

}
