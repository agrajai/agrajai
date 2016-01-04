package com.tgt.qa.tests.csrportal;

public class basics 
{
	public static void main(String[] arg)
	{
		probs.fib(5000);
	}
	
	public static class probs
	{
		//Fib series
		public static void fib(int n)
		{
			if (n < 0)
				return;
			
			int a = 0;
			int b = 1;
			int c = 0;
			
			System.out.print("fib series:  ");
			System.out.print(a);
			System.out.print(" "+ b);
			while (a+b < n)
			{
				c = a + b;
				System.out.print(" "  + c);
				
				a = b;
				b = c;
			}
		}
		
	}

}
