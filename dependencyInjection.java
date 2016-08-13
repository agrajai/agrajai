package com.tgt.qa.tests.csrportal;

public class dependencyInjection 
{
	private features absBicycle;
	
	public void setBycycleType(features absBike)
	{
		this.absBicycle = absBike;
	}

	public void tyreType()
	{
		this.absBicycle.tyres();
	}
}