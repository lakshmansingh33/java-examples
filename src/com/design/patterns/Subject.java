package com.design.patterns;

public interface Subject {
	
	public void registerSubscriber(Observer observer);
	public void unSubscriber(Observer observer);
	public void broadCastUpdate();

}
