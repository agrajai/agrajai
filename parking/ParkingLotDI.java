package com.tgt.qa.tests.csrportal.parking;

public class ParkingLotDI
{
	private Parking p;
	
	public void setParking(Parking p)
	{
		this.p = p;
	}
	
	public void park(Car c)
	{
		p.park(c);
	}
	
	public void unpark(Car c)
	{
		p.unpark(c);
	}
}
