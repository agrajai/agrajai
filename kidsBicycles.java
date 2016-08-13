package com.tgt.qa.tests.csrportal;

public class kidsBicycles extends abstractBicycle 
{

	//@Override
	protected void draw() 
	{
		super.draw();
		System.out.println("Kids have 2 tyres though daimeter is small - Private in subclass");
	}
	
	@Override
	public void tyres() 
	{
		System.out.println("Kids have 2 tyres though daimeter is small");
		
	}

	@Override
	public void chain() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void brakes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bell() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void seat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void paddle() {
		// TODO Auto-generated method stub
		
	}
	

}
