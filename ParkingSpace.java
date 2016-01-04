package com.tgt.qa.tests.csrportal;

import java.util.Iterator;
import java.util.List;

public class ParkingSpace 
{
	private enum parkingType
	{
		COMPACT,
		REGULAR,
		HANDICAP,
		VALET
	}
	
	public parkingType parkType;
	
	public Car car;
	
	private boolean isParkingFull;
	private boolean isParkingEmpty;
	
	public static int TOTAL_PARKING_SPACE = 2;
	
	public List<ParkingSpace> openParkingSpaces = null;
	public List<ParkingSpace> occupiedParkingSpaces = null;
	
	@SuppressWarnings("static-access")
	public ParkingSpace findParking(parkingType p)
	{
		Iterator<ParkingSpace> itr = openParkingSpaces.iterator();
		
		while (itr.hasNext())
		{
			ParkingSpace pSpace = itr.next();
			
			if (pSpace.parkType == p)
			{
				return pSpace;
			}
			else if (p.COMPACT.equals(pSpace.parkType.COMPACT))
			{
				if (pSpace.parkType.REGULAR == parkingType.REGULAR || pSpace.parkType.VALET == parkingType.VALET)
					return pSpace;
			}
		}
		
		return null;
	}
	
	public void park (parkingType pT, Car c)
	{
		ParkingSpace pS = findParking(pT);
		
		if (pS != null)
		{
			if (!isParkingFull)
			{
				occupiedParkingSpaces.add(pS);
				openParkingSpaces.remove(pS);
				
				if (occupiedParkingSpaces.size() == TOTAL_PARKING_SPACE)
				{
					isParkingFull = true;
				}
				
				if (occupiedParkingSpaces.size() == 0)
					isParkingEmpty = true;
				
				pS.car = c;
			}
		}
	}
	
	public void unPark(Car c)
	{
		Iterator<ParkingSpace> itr = occupiedParkingSpaces.iterator();
		
		while (itr.hasNext())
		{
			ParkingSpace pSpace = itr.next();
			
			if (pSpace != null && pSpace.car.equals(c))
			{
				if (!isParkingEmpty)
				{
					occupiedParkingSpaces.remove(pSpace);
					openParkingSpaces.add(pSpace);
					isParkingFull = false;
				}
				
				if (occupiedParkingSpaces.size() == 0)
					isParkingEmpty = true;
			}
		}
	}
}