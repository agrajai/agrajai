package com.tgt.qa.tests.csrportal;

public class sportsBicycles extends abstractBicycle
{
	public void draw()
	{
		System.out.print("i am in child class");
	}
	
	//https://www.youtube.com/watch?v=t5a74gNYbac
	
	void haveTires() 
	{
		System.out.println("Sports bycle have 2 tyres with a big daimeter");
	}
	
	final void color() 
	{
		System.out.print("color in class");
	}
	
	@Override
	public void paddle() {
		// TODO Auto-generated method stub
		
	}
	
	public void tyres() {
		System.out.println("Sports bycle have 2 tyres with a big daimeter");
		
	}
	
	public void tyres(int n) {
		System.out.println("Sports bycle have" + n + "tyres with a big daimeter");
		
	}

	public void tyres(String type) {
		System.out.println(type + "Tyres");
		
	}
	
	public void brakes() {
		// TODO Auto-generated method stub
		
	}
	
	public void bell() {
		// TODO Auto-generated method stub
		
	}
	
	public void seat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chain() {
		// TODO Auto-generated method stub
		
	}
}