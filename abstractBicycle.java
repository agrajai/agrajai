package com.tgt.qa.tests.csrportal;

public abstract class abstractBicycle implements features
{
	//abstract void haveTires();
	
	final void cadence()
	{
		System.out.print("cadence");
	}
	
	protected void draw()
	{
		System.out.print("i am in abstract base class - Private in Super class");
	}

	@Override
	public void tyres() {
		System.out.print("i am in abstract base class in tyres method");
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