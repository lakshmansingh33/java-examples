package com.parkinglot;

public class Bike extends Vehicle{
	
	public Bike(){
		this.spotNeeded=1;
		this.size=VehicleSize.BIKE;
	}

	@Override
	public boolean canVehicleFitInInTheSlot(ParkingSlot ps) {
		// TODO Auto-generated method stub
		return false;
	}

}
