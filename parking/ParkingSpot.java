package com.tgt.qa.tests.csrportal.parking;

public class ParkingSpot 
{
	private int parkingSpotID;
	private boolean isAvailable;
	private boolean isClosest;
	private int distanceFromEntry;
	
	private int positionX = 0;
	private int positionY = 0;
	
	private Car car;
	
	public ParkingSpot(int x, int y, int id)
	{
		setParkingSpotID(id);
		setPosition(x, y);
		setAvailable(isAvailable);
	}
	
	public void setPosition(int x, int y)
	{
		this.positionX = x;
		this.positionY = y;
	}
	
	public int getLocationX()
	{
		return positionX;
	}
	
	public int getLocationY()
	{
		return positionY;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public boolean isClosest() {
		return isClosest;
	}

	public void setClosest(boolean isClosest) {
		this.isClosest = isClosest;
	}

	public int getDistanceFromEntry() {
		return distanceFromEntry;
	}

	public void setDistanceFromEntry(int distanceFromEntry) {
		this.distanceFromEntry = distanceFromEntry;
	}

	public int getParkingSpotID() {
		return parkingSpotID;
	}

	public void setParkingSpotID(int parkingSpotID) {
		this.parkingSpotID = parkingSpotID;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	} 
}
