/**
 * 
 */
package com.design.patterns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author lmuriyal
 *
 */
public class CricketData implements Subject {

	private int runs;
	private int overs;
	private int wickets;
	private List<Observer> observerList;

	
	public CricketData() {
		observerList = new ArrayList<Observer>();
	}

	public CricketData(int runs, int overs, int wickets, List<Observer> observerList) {
		super();
		this.runs = runs;
		this.overs = overs;
		this.wickets = wickets;
		this.observerList = observerList;
	}

	public int getRuns() {
		return 90;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getOvers() {
		return 9;
	}

	public void setOvers(int overs) {
		this.overs = overs;
	}

	public int getWickets() {
		return 3;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public List<Observer> getObserverList() {
		return observerList;
	}

	public void setObserverList(List<Observer> observerList) {
		this.observerList = observerList;
	}

	@Override
	public void registerSubscriber(Observer observer) {
		observerList.add(observer);
	}

	@Override
	public void unSubscriber(Observer observer) {
		observerList.remove(observer);
	}

	@Override
	public void broadCastUpdate() {
		Iterator<Observer> it = observerList.iterator();
		while(it.hasNext()){
			Observer observer = it.next();
			observer.update(runs,overs,wickets);
		}
 	}
	
	public void dataChanged(){
		runs = getRuns();
		overs = getOvers();
		wickets = getWickets();
		broadCastUpdate();
	}

}
