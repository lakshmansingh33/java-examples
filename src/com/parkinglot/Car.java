package com.parkinglot;

public class Car extends Vehicle {
	
	public Car(){
		this.spotNeeded=1;
		this.size=VehicleSize.CAR;
	}

	@Override
	public boolean canVehicleFitInInTheSlot(ParkingSlot ps) {
		// TODO Auto-generated method stub
		return false;
	}

}
