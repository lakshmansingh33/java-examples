package com.parkinglot;

public class Level {
	private int floor;
	private ParkingSlot[] slots;
	private int availableSpots;
	private static final int NUM_OF_SLOTS_PER_ROW = 10;
	
	public Level(int floor,int noOfSpots){
		// Initilize the values here
	}
	
	public int getAvailableSpots(){
		return availableSpots;
	}
	
	public void parkVehicle(Vehicle vehicle){
		//Logic for parking the vehicle goes here
	}
	
	public boolean checkForSpotAvailability(Vehicle vehicle){
		// Check the spot availability on the floor for passed vehicle
		return true;
	}
	
	public boolean parkVehicleAtSpecifiedSpot(Vehicle vehicle,int spot){
		// park vehicle at specified location
		return true;
	}
	
	public void freeTheSlot(){
		availableSpots++;
	}
}
