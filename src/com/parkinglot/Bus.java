package com.parkinglot;

public class Bus extends Vehicle{
	
	public Bus(){
		this.spotNeeded=5;
		this.size=VehicleSize.BUS;
	}

	@Override
	public boolean canVehicleFitInInTheSlot(ParkingSlot ps) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
