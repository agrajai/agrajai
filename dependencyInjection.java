package com.tgt.qa.tests.csrportal;

public class dependencyInjection 
{
	private abstractBicycle absBicycle;
	
	public void setBycycleType(abstractBicycle absBike)
	{
		this.absBicycle = absBike;
	}

	public void tyreType()
	{
		this.absBicycle.tyres();
	}
}