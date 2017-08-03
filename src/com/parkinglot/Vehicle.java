package com.parkinglot;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
	protected List<ParkingSlot> slots = new ArrayList<ParkingSlot>();
	protected String vehicleNumber;
	protected int spotNeeded;
	protected VehicleSize size;

	public int getSpotNeeded() {
		return spotNeeded;
	}

	public VehicleSize getSize() {
		return size;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	// Logic related to adding the vehicle to parking slot goes here
	public void parkVechicle(ParkingSlot ps) {
		slots.add(ps);

	}

	public void clearSpot() {
		// Logic related to removing vehicle goes here.
	}

	public abstract boolean canVehicleFitInInTheSlot(ParkingSlot ps);
}
