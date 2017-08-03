package com.parkinglot;

public class ParkingSlot {
	private Vehicle vehicle;
	private VehicleSize vehicleSize;
	private Level level;
	private int rowNumber;
	private int spotNumber;
	
	public ParkingSlot(Vehicle v,VehicleSize size,Level level,int rn,int sptNo){
		// Initilization goes here
	}

	public int getRowNumber() {
		return rowNumber;
	}

	public int getSpotNumber() {
		return spotNumber;
	}
	
	public boolean isAvailable(){
		return vehicle == null;
	}
	
	public void parkVehicle(Vehicle v){
		// Parking on specified spot
	}
	
	public void removeVehicle(){
		//remove vehicle goes here
	}
}
