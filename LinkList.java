package com.tgt.qa.tests.csrportal;

import java.util.Hashtable;

import com.tgt.qa.tests.csrportal.theStack.stackArrayImplementation;

public class LinkList 
{
	Node head;
	Node head2;
	
	public class Node
	{
		Node next;
		public int data;
		
		public Node (int d)
		{
			this.data = d;
			this.next = null;
		}
		
		Node (Node n, char d)
		{
			this.next = n;
			this.data = d;
		}
	}

	public static void main(String[] str)
	{
		LinkList linklist = new LinkList();
		
		
		linklist.createLinkList(linklist.new Node(1000));
		linklist.createLinkList(linklist.new Node(70));
		linklist.createLinkList(linklist.new Node(8));
		linklist.createLinkList(linklist.new Node(10));
		linklist.createLinkList(linklist.new Node(14));
		linklist.createLinkList(linklist.new Node(150));
		
//		System.out.print("isPalindrome: " + linklist.isPalindrome(linklist.head));
//		linklist.removeDupes2NonXtraBuffer((linklist.head));
		
//		linklist.createLinkList(linklist.new Node('1'));
//		linklist.createLinkList(linklist.new Node('2'));
//		linklist.createLinkList(linklist.new Node('3'));
//		linklist.createLinkList(linklist.new Node('4'));
//		linklist.createLinkList(linklist.new Node('5'));
//		linklist.createLinkList(linklist.new Node('6'));
//		linklist.createLinkList(linklist.new Node('7'));
//		linklist.createLinkList(linklist.new Node('8'));
//		linklist.reverse(linklist.head);
		
		//Create linear Link List
//		for (int i=0; i<5 ; i++)
//		{
//			linklist.createLinkList(linklist.new Node(i));
//		}
		
		//linklist.createCircularLinkList(linklist.head);
		
//		System.out.println("Is Link List Circular: " + linklist.isListCircular(linklist.head));
		
		//Create linear Link List
//		for (int i=10; i<20 ; i++)
//		{
//			linklist.createLinkList2(linklist.new Node(i));
//		}
		
//		linklist.createLinkList2(linklist.new Node(2));
//		linklist.createLinkList2(linklist.new Node(5));
//		linklist.createLinkList2(linklist.new Node(9));
//		linklist.createLinkList2(linklist.new Node(11));
//		linklist.createLinkList2(linklist.new Node(13));
//		
//		linklist.printLinkList(linklist.merge2SortedLinkList(linklist.head, linklist.head2));
		linklist.reArrangeList(linklist.head);
		
		//linklist.printLinkList(linklist.head);
//		System.out.println("Mid of the List is: " + linklist.findMidofTheList(linklist.head));
//		linklist.reverseLinkList(linklist.head);
//		linklist.printLinkList(linklist.head);
//		linklist.reverse(linklist.head);
//		linklist.printLinkList(linklist.merge2SortedLinkList(linklist.head, linklist.head2));

	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	
	public void newHead(char d)
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
	
	public void insertAfter(char d, int insertAfter)
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
	
	public void insertBefore(char d, int insertBefore)
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
	
	public Node merge2SortedLinkList(Node head1, Node head2) 
	{
		if (head1 == null && head2 == null)
			return null;
		
		if (head1 == null)
			return head2;
		
		if (head2 == null)
			return head1;
		
		Node first = head1;
		Node second= head2;
		Node dummy = new Node(0);
		Node curr = dummy;
		
		while (first != null && second != null)
		{
			if (first.data < second.data)
			{
				curr.next = first;
				first = first.next;
			}
			else
			{
				curr.next = second;
				second = second.next;
			}
			
			curr = curr.next;
		}
		
		if (first != null)
			curr.next = first;
		
		if (second != null)
			curr.next = second;
		
		return dummy.next;		
		
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
	
//	public boolean isPalindrome(Node Head)
//	{
//		if (head ==  null)
//		{
//			return false;
//		}
//		
//		//Run through the half of list to grab center.
//		Node slow = head;
//		Node fast = head.next;
//		
//		theStack stk = new theStack();
//		stackArrayImplementation stkArry = stk.new stackArrayImplementation(7);
//		
//		while (fast.next != null)
//		{
//			stkArry.push(slow.data);
//			
//			if(fast.next.next != null)
//			{
//				fast = fast.next.next;
//				slow = slow.next;
//			}
//			else
//			{
//				fast = fast.next;
//			}
//		}
//		
//		slow = slow.next;
//		stkArry.push(slow.data);
//		
//		while (slow.next != null)
//		{
//			if (slow.data != stkArry.peek())
//			{
//				return false;
//			}
//			
//			stkArry.pop();
//			slow = slow.next;
//		}
//		
//		return true;
//	}
	
//	public void removeDupes(Node n)
//	{
//		if (n == null)
//		{
//			return;
//		}
//		
//		Hashtable<Character, Boolean> h = new Hashtable<Character, Boolean>();
//		
//		Node prev = n;
//		Node curr = n;
//		
//		while (curr != null)
//		{
//			if (h.containsKey(curr.data))
//			{
//				prev.next = prev.next.next;
//			}
//			else
//			{
//				h.put(curr.data, true);
//				prev = curr;
//			}
//			
//			curr = curr.next;
//		}
//		
//		printLinkList(head);
//	}
	
	public void removeDupes2NonXtraBuffer(Node n)
	{
		if (n == null)
		{
			return;
		}
		
		Node prev = n;
		Node curr = prev.next;
		
		while (curr != null)
		{
			Node runner = head;
			
			while (runner != curr)
			{
				if (runner.data == curr.data)
				{
					Node temp = curr.next;
					prev.next = temp;
					curr = temp;
					break;
				}
				runner = runner.next;
			}
			
			if (runner == curr) 
			{ 
				 prev = curr;
				 curr = curr.next;
			}
		}
		
		printLinkList(head);
	}
	
	
//	public char nthToLast(Node n, int index)
//	{
//		if (n == null)
//			return  ' ';
//		
//		Node p1 = n;
//		Node p2 = n;
//		
//		while (index-1 > 0)
//		{
//			p2 = p2.next;
//			index--;
//		}
//		
//		while (p2.next != null)
//		{
//			p1 = p1.next;
//			p2 = p2.next;
//		}
//		
//		return p1.data;
//	}
	
	public void deleteANodeWhichisOnlyAccessible(Node n)
	{
		if (n == null || n.next == null)
		{
			return;
		}
		
		Node curr = n.next;
		n.data = curr.data;
		n.next = curr.next;
	}
	
	public void reArrangeList(Node head)
	{
		if (head == null)
		{
			return;
		}
		
		//iterative approach
		Node curr = head;
		Node p1 = curr.next;
		Node p2 = p1.next;
		
		while (p2.next != null)
		{
			
			Node temp = getTail(curr);
			temp.next = p1;
			curr.next = temp;
			curr = p1;
			
			p1 = p2;
			
			if (p2.next != null)
				p2 = p2.next;
			
//			System.out.println("Head: " + head.data);
//			
//			p1.next = getTail(curr);
//			System.out.println("p1.next: " + p1.next.data);
//			
//			p1 = p1.next;
//			System.out.println("p1: " + p1.data);
//			
//			p1.next = p2;
//			System.out.println("p1.next: " + p1.next.data);
//			
//			p1 = p2;
//			System.out.println("p1: " + p1.data);
//			
//			if (p2.next != null)
//			{
//				p2 = p2.next;
//				System.out.println("p2: " + p2.data);
//			}
//			
//			curr = p2;
//			System.out.println("Curr: " + curr.data);
		}
		printLinkList(head);
	}
	
	public Node getTail(Node n)
	{
		Node prev = null;
		while (n.next != null)
		{
			prev = n;
			n = n.next;
		}
		
		prev.next = null;
		return n;
	}
	
	public void insertionSortLinkList(Node head)
	{
		if (head == null)
			return;
		
		Node ins = head;
		Node curr = ins.next;
		
		while (curr != null || curr.next != null)
		{
			ins = head;
			while (ins.next != curr)
			{
				if (ins.data > curr.data)
				{
					int temp = curr.data;
					curr.data = ins.data;
					ins.data = temp;
				}
				else
					ins = ins.next;
			}
			
			if (curr.next != null)
				curr = curr.next;
		}
		
		printLinkList(head);
	}
}