package com.tgt.qa.tests.csrportal;

public class theQueue {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		theQueue queue = new theQueue();
		queueArrayImplementation newQueueofArray = queue.new queueArrayImplementation(3);
		
		newQueueofArray.enqueue("10");
		newQueueofArray.dequeue();
		newQueueofArray.enqueue("20");
		newQueueofArray.enqueue("30");
		
		
		newQueueofArray.dequeue();
		newQueueofArray.dequeue();
		newQueueofArray.dequeue();

	}
	
	public class queueArrayImplementation
	{
		public String[] strArray;
		public int front,  noofelements,size = 0;
		public int rear = -1;
		
		public queueArrayImplementation(int d)
		{
			this.strArray = new String[d];
			size = d;
		}
		
		public void enqueue(String s)
		{
			if (s.isEmpty())
				return;
			
			if (rear < size)
			{
				rear++;
				strArray[rear] = s;
				noofelements++;
				displayQueueElements();
			}
			else
			{
				System.out.println("Queue is Full");
			}
		}
		
		public void dequeue()
		{
			if (noofelements > 0)
			{
				strArray[front++] = "";
				noofelements--;
				displayQueueElements();
			}
			else
			{
				System.out.println("Queue is Empty!!");
			}
		}
		
		public String peek()
		{
			if (noofelements > 0)
			{
				return strArray[front];
			}
			else
			{
				System.out.println("Queue is Empty!!");
			}
			
			return "";
		}
		
		public void displayQueueElements()
		{
			System.out.println();
			for (int i = 0; i < strArray.length; i++) 
			{
				System.out.println(" " + strArray[i]);
			}
		}
	}

}
