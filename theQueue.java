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
		public Object[] strArray;
		public int front,  noofelements, size = 0;
		public int rear = -1;
		
		public queueArrayImplementation(int d)
		{
			this.strArray = new Object[d];
			size = d;
		}
		
		public void enqueue(Object s)
		{
			if (s.toString().isEmpty())
				return;
			
			if (rear < size)
			{
				rear++;
				strArray[rear] = s;
				noofelements++;
				//displayQueueElements();
			}
			else
			{
				System.out.println("Queue is Full");
			}
		}
		
		public Object dequeue()
		{
			Object temp = null;
			
			if (noofelements > 0)
			{
				temp = strArray[front];
				strArray[front++] = "";
				noofelements--;
				//displayQueueElements();
			}
			else
			{
				System.out.println("Queue is Empty!!");
			}
			
			return temp;
		}
		
		public Object peek()
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
	
	public class CircularQueue
	{
		private int MAX_SIZE;
		private int front = 0;
		private int rear = 0;
		private int[] arr;
		private int size;
		
		public CircularQueue(int size)
		{
			this.MAX_SIZE = size;
			this.arr = new int[this.MAX_SIZE];
		}
		
		public void enqueue(int n)
		{
			if (size != MAX_SIZE)
			{
				size++;
				rear = (rear + 1) % MAX_SIZE;
				arr[rear] = n;
			}
			else
			{
				System.out.println("Q is full");
			}
		}
		
		public Integer dequeue()
		{
			if (size != 0)
			{
				size--;
				front = (front + 1) % MAX_SIZE;
				return arr[front];
			}
			else
			{
				return null;
			}
		}
	}

}
