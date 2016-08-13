package com.tgt.qa.tests.csrportal.parking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompactParking implements Parking 
{
	private static final int NO_OF_SPACES = 4;
	private List<ParkingSpot> occupiedCompactParkingSpaces = new ArrayList<ParkingSpot>();
	private List<ParkingSpot> vacantCompactParkingSpaces = new ArrayList<ParkingSpot>();
	
	private boolean areCompactParkingSpacesFull;
	
	public CompactParking()
	{
		populateParking();
	}
	
	public void setCompactParkingSpacesFull()
	{
		if (occupiedCompactParkingSpaces.size() == NO_OF_SPACES)
		{
			this.areCompactParkingSpacesFull = true;
		}
		else
		{
			this.areCompactParkingSpacesFull = false;
		}
	}
	
	public boolean isCompactParkingSpacesFull()
	{
		return areCompactParkingSpacesFull;
	}

	public void park(Car c) 
	{
		if (!areCompactParkingSpacesFull)
		{
			Iterator<ParkingSpot> itr = vacantCompactParkingSpaces.iterator();
			
			while (itr.hasNext())
			{
				ParkingSpot parkingSpot = itr.next();
				
				if (parkingSpot != null)
				{
					parkingSpot.setCar(c);
					vacantCompactParkingSpaces.remove(parkingSpot);
					occupiedCompactParkingSpaces.add(parkingSpot);
					parkingSpot.setAvailable(false);
					
					setCompactParkingSpacesFull();
					
					break;
				}			
				else
				{
					System.out.println("Compact parking is full");
				}
			}
		}
	}

	public void unpark(Car c) 
	{
		if (!areCompactParkingSpacesFull)
		{
			Iterator<ParkingSpot> itr = occupiedCompactParkingSpaces.iterator();
			
			while (itr.hasNext())
			{
				ParkingSpot parkingSpot = itr.next();
				if (parkingSpot.getCar() == c)
				{
					occupiedCompactParkingSpaces.remove(parkingSpot);
					vacantCompactParkingSpaces.add(parkingSpot);
				}
				
				if (vacantCompactParkingSpaces.size() == NO_OF_SPACES)
				{
					areCompactParkingSpacesFull = false;
				}
				
				break;
			}
		}
	}
	
	private void populateParking()
	{
		for (int i = 1; i < NO_OF_SPACES; i++)
		{
			vacantCompactParkingSpaces.add(new ParkingSpot(i, i, i));
		}
	}
	
	public List<ParkingSpot> getOccupiedParkingSpots()
	{
		return occupiedCompactParkingSpaces;
	}
	
	public List<ParkingSpot> getVacantParkingSpots()
	{
		return vacantCompactParkingSpaces;
	}
}
