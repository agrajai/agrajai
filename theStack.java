package com.tgt.qa.tests.csrportal;

public class theStack 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		theStack stack = new theStack();
		stackArrayImplementation newStackofArray = stack.new stackArrayImplementation(6);
		newStackofArray.pop();
		newStackofArray.push('1');
		newStackofArray.push('2');
		newStackofArray.push('3');
		newStackofArray.push('4');
		newStackofArray.push('5');
		newStackofArray.push('6');
		newStackofArray.pop();
//		newStackofArray.push("Jai6");
	}
	
	
	public class stackArrayImplementation
	{
		public char[] cArray;
		public int topofStack = -1;
		public int count = 0;
		
		public stackArrayImplementation(int d)
		{
			this.cArray = new char[d];
		}
		
		public void push(char s)
		{
			if (s == ' ')
				return;
			
			if (topofStack + 1 < cArray.length)
			{
				topofStack++;
				cArray[topofStack] = s;
				count++;
				System.out.println(String.format("Value %s is added to the stack", s));
				displayStackElements();
			}
			else
			{
				System.out.print("Stack is Full");
			}
		}
		
		public void pop()
		{
			if (topofStack >= 0)
			{
				System.out.print(String.format("Value %s is popped from the stack", cArray[topofStack]));
				cArray[topofStack--] = ' ';
				count--;
				displayStackElements();
			}
			else
			{
				System.out.println("Stack is empty");
			}
		}
		
		public char peek()
		{
			if (topofStack >= 0)
			{
				return cArray[topofStack];
			}
			else
			{
				System.out.print("Stack is empty");
			}
			
			return ' ';
		}
		
		public void displayStackElements()
		{
			System.out.println();
			for (int i = 0; i < cArray.length; i++) 
			{
				System.out.println(" " + cArray[i]);
			}
		}
		
		public boolean isEmpty()
		{
			return count == 0;
		}
	}
}
