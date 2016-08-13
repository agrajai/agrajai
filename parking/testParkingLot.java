package com.tgt.qa.tests.csrportal.parking;

import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class testParkingLot
{
	public ParkingLotDI parkinglot = new ParkingLotDI();
	CompactParking compactParking =  null;
	
	@Before
	public void setup()
	{
		new ParkingLotDI();
		
	}

	@Test
	public void testCompactPark()
	{
		Car car = new Car();
		car.setCarSize("COMPACT");
		compactParking = new CompactParking();
		parkinglot.setParking(compactParking);
		parkinglot.park(car);
		
		Iterator<ParkingSpot> itr = compactParking.getOccupiedParkingSpots().iterator();
		boolean carParked = false;
		
		while (itr.hasNext())
		{
			if (itr.next().getCar() == car)
				carParked = true;
		}
		
		assertThat("The car is not parked:", carParked);
	}
	
	@Test
	public void testCompactUnPark()
	{
		Car car = new Car();
		car.setCarSize("COMPACT");
		compactParking = new CompactParking();
		parkinglot.setParking(compactParking);
		parkinglot.park(car);
		
		Iterator<ParkingSpot> itr = compactParking.getOccupiedParkingSpots().iterator();
		boolean carParked = false;
		
		while (itr.hasNext())
		{
			if (itr.next().getCar() == car)
				carParked = true;
		}
		
		assertThat("The car is not parked:", carParked);
		
		parkinglot.unpark(car);
		
		Iterator<ParkingSpot> itr1 = compactParking.getVacantParkingSpots().iterator();
		
		boolean carUnParked = false;
		while (itr1.hasNext())
		{
			if (itr1.next().getCar() == car)
				carUnParked = true;
		}
		
		assertThat("The car is not parked:", carUnParked);
		
	}
}
