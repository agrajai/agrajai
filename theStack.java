package com.tgt.qa.tests.csrportal;

import java.util.Stack;

public class theStack 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		theStack stack = new theStack();
//		stackArrayImplementation newStackofArray = stack.new stackArrayImplementation(6);
//		newStackofArray.pop();
//		newStackofArray.push('1');
//		newStackofArray.push('2');
//		newStackofArray.push('3');
//		newStackofArray.push('4');
//		newStackofArray.push('5');
//		newStackofArray.push('6');
//		newStackofArray.pop();
//		newStackofArray.push("Jai6");
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(3);
		s.push(2);
		s.push(1);
		s.push(200);
		s.push(100);
		s.push(3);
		//sortStackAsc(s);
//		sortStackAscPartition(s);
		sortStackInPlace(s);
	    for( int i = 0; i < s.size(); i++ )
	    {
	        System.out.println(s.elementAt( i ) );
	    }
	}
	
	
	public class stackArrayImplementation
	{
		public Object[] cArray;
		public int topofStack = -1;
		public int count = 0;
		
		public stackArrayImplementation(int d)
		{
			this.cArray = new Object[d];
		}
		
		public void push(Object s)
		{
			if (s == null)
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
		
		public Object peek()
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
	
	public static void sortStackAsc(Stack<Integer> s)
	{
		if (s.isEmpty())
			return;
		
		Stack<Integer> tempStack = new Stack<Integer>();
		
		while (!s.isEmpty())
		{
			int temp = s.pop();
			
			while (!tempStack.isEmpty() && (tempStack.peek() > temp))
			{
				s.push(tempStack.pop());
			}
			
			tempStack.push(temp);
		}
		
	    // Print the entire sorted stack from temp stack
	    for( int i = 0; i < tempStack.size(); i++ )
	    {
	        System.out.println(tempStack.elementAt( i ) );
	    }
	}
	
	public static void sortStackAscPartition(Stack<Integer> s)
	{
		if (s.isEmpty())
			return;
		
		int pivot = s.pop();
		Stack<Integer> left = new Stack<Integer>();
		Stack<Integer> right = new Stack<Integer>();
		
		while (!s.isEmpty())
		{
			int val = s.pop();
			if (pivot > val)
			{
				left.push(val);
			}
			else
			{
				right.push(val);
			}
		}
		
		Stack<Integer> tmp = new Stack<Integer>();
		
		while (!right.isEmpty())
			tmp.push(right.pop());
		
		tmp.push(pivot);
		
		while (!left.isEmpty())
			tmp.push(left.pop());
		
		while (!tmp.isEmpty())
			s.push(tmp.pop());
		
	    // Print the entire sorted stack from s stack
	    for( int i = 0; i < s.size(); i++ )
	    {
	        System.out.println(s.elementAt(i));
	    }
	}
	
	
	public static void sortStackInPlace(Stack<Integer> s)
	{
		if (s.isEmpty())
			return;
		
		int x = s.pop();
		
		sortStackInPlace(s);
		
		insert(s, x);
	}
	
	public static void insert(Stack<Integer> S, int X)
	{
	    if(S.isEmpty())
	    {
	    	S.push(X);
	    	return;
	    }
	          
		if(X < S.peek())
		{
			int t = S.pop();
		    insert(S, X);
		    S.push(t);
		}
		else
		{
			S.push(X);
		    return;
		}
	}
}
