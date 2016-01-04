package com.tgt.qa.tests.csrportal;

public class LinkList 
{
	Node head;
	Node head2;
	
	public class Node
	{
		Node next;
		int data;
		
		Node (int d)
		{
			this.data = d;
			this.next = null;
		}
		
		Node (Node n, int d)
		{
			this.next = n;
			this.data = d;
		}
	}

	public static void main(String[] str)
	{
		LinkList linklist = new LinkList();
		
		//Create linear Link List
		/*for (int i=0; i<5 ; i++)
		{
			linklist.createLinkList(linklist.new Node(i));
		}*/
		
		linklist.createLinkList(linklist.new Node(1));
		linklist.createLinkList(linklist.new Node(3));
		linklist.createLinkList(linklist.new Node(4));
		linklist.createLinkList(linklist.new Node(48));
		linklist.createLinkList(linklist.new Node(500));
		
		//linklist.createCircularLinkList(linklist.head);
		
//		System.out.println("Is Link List Circular: " + linklist.isListCircular(linklist.head));
		
		//Create linear Link List
//		for (int i=10; i<20 ; i++)
//		{
//			linklist.createLinkList2(linklist.new Node(i));
//		}
		
		linklist.createLinkList2(linklist.new Node(2));
		linklist.createLinkList2(linklist.new Node(5));
		linklist.createLinkList2(linklist.new Node(6));
		linklist.createLinkList2(linklist.new Node(8));
		linklist.createLinkList2(linklist.new Node(10));
		linklist.createLinkList2(linklist.new Node(11));
		linklist.createLinkList2(linklist.new Node(12));
		linklist.createLinkList2(linklist.new Node(13));
		linklist.createLinkList2(linklist.new Node(14));
		
//		linklist.printLinkList(linklist.merge2SortedLinkList(linklist.head, linklist.head2));
		
		//linklist.printLinkList(linklist.head);
//		System.out.println("Mid of the List is: " + linklist.findMidofTheList(linklist.head));
//		linklist.reverseLinkList(linklist.head);
//		linklist.printLinkList(linklist.head);
		linklist.reverse(linklist.head);
//		linklist.printLinkList(linklist.merge2SortedLinkList(linklist.head, linklist.head2));

	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	
	public void newHead(int d)
	{
		Node n = new Node(d);
		if (!isEmpty())
		{
			n.next = head;
		}
		else
		{
			head = n; 
		}
	}
	
	public void insertAfter(int d, int insertAfter)
	{
		Node n = new Node(d);
		Node curr = head;
		
		while (curr != null)
		{
			if (curr.data > insertAfter)
			{
				curr = curr.next;
			}
		}
		
		n.next = curr.next;
		curr.next = n;
	}
	
	public void insertBefore(int d, int insertBefore)
	{
		Node n = new Node(d);
		Node curr = head;
		
		while (curr != null)
		{
			if (curr.data < insertBefore)
			{
				curr = curr.next;
			}
		}
		
		n.next = curr.next;
		curr.next = n;
	}
	
	public void createLinkList(Node n)
	{
		Node curr;
		
		if (isEmpty())
		{
			head = n;
		}
		else
		{
			curr = head;
			
			while (curr.next != null)
			{
				curr = curr.next;
			}
			
			curr.next = n;
		}
	}
	
	public void createLinkList2(Node n)
	{
		Node curr;
		
		if (head2 == null)
		{
			head2 = n;
		}
		else
		{
			curr = head2;
			
			while (curr.next != null)
			{
				curr = curr.next;
			}
			
			curr.next = n;
		}
	}
	
	public void createCircularLinkList(Node head)
	{
		Node curr = head;
		while (curr.next!=null)
			curr = curr.next;
			
		curr.next = head;
	}
	
	public void printLinkList(Node head)
	{
		Node curr = head;
		while (curr != null)
		{
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
	
	public void reverseLinkList(Node head)
	{
		if (isEmpty() || head.next == null)
		{
			return;
		}
		else
		{
			Node p1;
			Node p2;
			
			p1 = head.next;
			p2 = p1.next;
			
			p1.next = head;
			head.next = null;

			if(p2 == null)
				return;
			
			Node curr = p2;
			Node prev = p1;
			
			while (curr != null)
			{
				Node nextNode = curr.next;
				curr.next = prev;
				
				prev = curr;
				curr = nextNode;
			}
			
			head = prev;
			printLinkList(head);
		}
	}
	
	public int findMidofTheList(Node head)
	{
		if (isEmpty())
			return 0;
		
		Node slow = head;
		Node fast = head;
		
		while (fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow.data;
	}
	
	public boolean isListCircular(Node head)
	{
		Node slow = head;
		Node fast = head.next;
		
		while (true)
		{
			if (slow == null || fast == null)
			{
				return false;
			}
			
			if (slow != fast)
			{
				slow = slow.next;
				if (fast.next != null)
					fast = fast.next.next;
			}

			if (slow == fast)
				return true;
		}
	}
	
	public Node merge2SortedLinkList(Node list1, Node list2) 
	{
		  if (list1 == null) return list2;
		  if (list2 == null) return list1;

		  Node head;
		  
		  if (list1.data < list2.data) 
		  {
		    head = list1;
		  } 
		  else 
		  {
		    head = list2;
		    list2 = list1;
		    list1 = head;
		  }
		  
		  while(list1.next != null && list2 != null) 
		  {
		    if (list1.next.data > list2.data) 
		    {
		      Node tmp = list1.next;
		      list1.next = list2;
		      list2 = tmp;
		    }
		    
		    list1 = list1.next;
		  } 
		  
		  if (list1.next == null) list1.next = list2;
		  return head;
	}
	
	public void reverse(Node n)
	{
		Node curr = head;
		
		Node p1 = curr.next;
		Node p2 = curr.next.next;
		
		while (curr.next != null)
		{
			p1.next = head;
			head = p1;
			
			curr.next = p2;
			
			p1 = curr.next;
			
			if (curr.next != null)
				p2 = p2.next;
		}
		
		printLinkList(head);
	}
}
