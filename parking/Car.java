package com.tgt.qa.tests.csrportal.parking;

public class Car 
{
	public enum carType
	{
		SMALL,
		MEDIUM,
		LARGE
	}

	private String size;
	
	public void setCarSize(String size)
	{
		this.size = size;
	}
	
	public String getCarSize()
	{
		return size;
	}
}
