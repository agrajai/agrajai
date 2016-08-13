package com.tgt.qa.tests.csrportal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.tgt.qa.tests.csrportal.theStack.stackArrayImplementation;


public class Trees 
{
	Node root;
	Node parent;
	
	public class Node
	{
		Node left;
		Node right;
		int data;
		
		public Node (int d)
		{
			this.data = d;
			this.left = null;
			this.right = null;
		}
	}
	
	public static void main(String[] s)
	{
		Trees t = new Trees();
		t.createBST(20);
		t.createBST(10);
		t.createBST(40);
		t.createBST(6);
		t.createBST(8);
		t.createBST(28);
		t.createBST(36);
		t.createBST(4);
		t.createBST(5);
		t.createBST(7);
		t.createBST(9);
		t.createBST(25);
		t.createBST(29);
		t.createBST(35);
		t.createBST(37);
		
//		System.out.println("Printing PRE ORDER TRAVERSAL");
//		t.preOrderTraversal(t.root);
//		
//		System.out.print("Printing IN ORDER TRAVERSAL before deletion:");
//		t.inOrderTraversal(t.root);
		
//		t.removeNode(t.root, 50);
		
	//	System.out.println("");
		//System.out.print("Printing IN ORDER TRAVERSAL after deletion :");
		//t.inOrderTraversal(t.root);
//		
//		System.out.println("Printing POST ORDER TRAVERSAL");
//		t.postOrderTraversal(t.root);
		
//		System.out.println("iS BST: " + t.isBinarySearchTree(t.root, Integer.MIN_VALUE, Integer.MAX_VALUE));
//		System.out.println("\nLCA: : " + t.findLCA(t.root, 68, 80).data);
//		
//		System.out.println("\nMax depth: : " + t.maxDepth(t.root));
		
//		t.BFSPrintStairs(t.root);
		t.flattenTree(t.root);
		
	}
	
	public Node insert(Node root, int d)
	{
		if (root == null)
		{
			root = new Node(d);
		}
		else if (root.data > d)
		{
			root.left = insert(root.left, d);
		}
		else
		{
			root.right = insert(root.right, d);
		}
		
		return root;
	}
	
	public void createBST(int d)
	{
		root = insert(root, d);
	}

	//pre order traversal - ROOT > LEFT > RIGHT
	public void preOrderTraversal(Node root)
	{
		if (root == null)
			return;
		
		System.out.println(root.data);
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	
	//In order Traversal LEFT > ROOT > ROOT
	public void inOrderTraversal(Node root)
	{
		if (root == null)
		{
			return;
		}
		inOrderTraversal(root.left);
		System.out.print(root.data +", ");
		inOrderTraversal(root.right);
	}
	
	//Post Order Traversal LEFT > RIGHT > ROOT
	public void postOrderTraversal(Node root)
	{
		if (root == null)
			return;
		
		postOrderTraversal(root.right);
		postOrderTraversal(root.left);
		System.out.println(root.data);
	}
	
	//Find max of left Sub tree and find min of right sub tree and compare with root
	//if max of left sub tree is less than root and if min of right sub tree is greater than root 
	//it is a BST
	public boolean isBinarySearchTree(Node root, int min, int max)
	{
		if (root == null)
		{
			return true;
		}
		
		return (root.data > min) && 
				(root.data < max) && 
				isBinarySearchTree(root.left, min, root.data) && 
				isBinarySearchTree(root.right, root.data, max);
	}
	
	// Given a sorted (increasing order) array, write an algorithm to create a binary tree with minimal height
	public Node createBSTWithMinimalHeight(int[] arr, int start, int end)
	{
		if (start <= end)
		{
			int mid = (start + end) / 2;
			root = new Node(arr[mid]);
			
			if (start < end)
			{
				root.left = createBSTWithMinimalHeight(arr, start, mid);
				root.right = createBSTWithMinimalHeight(arr, mid + 1, end);
			}
		}
		
		return root;
	}
	
	@SuppressWarnings("null")
	public Node removeNode(Node root, int d)
	{
		Node curr = root;
		
		if (curr == null)
		{
			return null;
		}
		else if (curr.data == d)
		{
			if (curr.left == null && curr.right == null)
			{
				if (parent.left != null)
				{
					parent.left = null;
				}
				else
				{
					parent.right = null;
				}
			}
			else if (curr.right == null)
			{
				parent.left = curr.left;
			}
			else if (curr.left == null)
			{
				parent.right = curr.right;
			}
			else
			{
				Node Min = findMin(curr.right);
				curr.data = Min.data;
				
//				Node temp = curr.right;
//				Node tempParent = curr;
//				
//				while (temp.left != null)
//				{
//					tempParent = temp;
//					temp = temp.left;
//				}
//				
//				tempParent.left = temp.right; 

				parent.left = curr.right.right;
			}
		}
		else if (curr.data > d)
		{
			parent = curr;
			curr = removeNode(curr.left, d);
		}
		else if (root.data < d)
		{
			parent = curr;
			curr = removeNode(curr.right, d);
		}
		else 
		{
			System.out.print("node not found!!");
		}
		
		return root;
	}
	
	public Node findMin(Node n)
	{
		if (n == null)
			return null;
		
		
		while (n.left != null)
		{
			parent = n;
			n = n.left;
		}
		
		return n;
	}
	
	public Node findLca(Node node, int t1, int t2) 
	{
	    if(node == null) 
	    {
	        return null;
	    }
	    
	    if(node.data > t2 && node.data > t1) 
	    {
	        // both targets are left
	        return findLca(node.left, t1, t2);
	    } 
	    else if (node.data < t2 && node.data < t1) 
	    {
	        // both targets are right
	        return findLca(node.right, t1, t2);
	    }
	    else 
	    {
	        return node;
	    }
	}
	
	public Node LCABinaryTree(Node root, int x, int y)
	{
		if (root == null)
			return null;
		
		Node left = LCABinaryTree(root.left, x, y);
		Node right = LCABinaryTree(root.left, x, y);
		
		if (left != null && right != null)
			return root;
		
		return left != null ? left: right;
	}
	
	public int maxDepth(Node root)
	{
		if (root == null)
		{
			return -1;
		}
		
		int lDepth = maxDepth(root.left);
		int rDepth = maxDepth(root.right);
		
		if (lDepth > rDepth)
		{
			return lDepth + 1;
		}
		else
		{
			return rDepth + 1;
		}
	}
	
	public void BFSPrintStairs(Node root)
	{
		theQueue q = new theQueue();
		theQueue.queueArrayImplementation qArr = q.new queueArrayImplementation(40);
		
		qArr.enqueue(root);
		
		while (qArr.noofelements != 0)
		{
			int levelsize = qArr.noofelements;
 			
			while(levelsize > 0)
			{
				Node temp = (Node) qArr.dequeue();
				System.out.print(temp.data + " ");

				if (temp.left != null)
				{
					qArr.enqueue(temp.left);
				}
				
				if (temp.right != null)
				{
					qArr.enqueue(temp.right);
				}
				
				levelsize--;
			}
			
			System.out.println();
		}
	}
	
	public void preOrderIterative(Node root)
	{
		if (root == null)
			return;
		
		Stack<Node> s = new Stack<Node>();
		
		s.push(root);
		
		while (!s.isEmpty())
		{
			root = s.pop();
			System.out.println(root.data);

			if (root.right != null)
				s.push(root.right);
			
			if (root.left != null)
				s.push(root.left);
		}
	}
	
	public void inOrderIterative(Node root)
	{
		if (root == null)
			return;
		
		Stack<Node> s = new Stack<Node>();
		
		//go to the left leaf node
		while (root != null)
		{
			s.push(root);
			root = root.left;
		}
		
		while (!s.isEmpty())
		{
			root = s.pop();
			System.out.println(root.data);
			
			if (root.right != null)
			{
				root = root.right;
			}
			
			//go to the left most Node
			while (root != null)
			{
				s.push(root);
				root = root.left;
			}
		}
	}
	
	public void postOrderIteration(Node root)
	{
		if (root == null)
			return;
		
		Stack<Node> s = new Stack<Node>();
		
		while (root != null)
		{
			s.push(root);
			root = root.left;
		}
		
		while (!s.isEmpty())
		{
			root = s.pop();
			System.out.println(root.data);
			
			if (root.right != null)
				root = root.right;
			
			
		}
	}
	
	public boolean isSubTree(Node root1, Node root2)
	{
		if (root1 == null)
			return false;
		
		if (root2 == null)
			return true;
		
		if (areIdentical(root1, root2))
			return false;
		
		return isSubTree(root1.left, root2) || isSubTree(root1.right, root2);
		
	}
	
	private boolean areIdentical(Node root1, Node root2)
	{
		if (root1 == null && root2 == null)
			return true;
		
		if (root1 == null || root2 == null)
			return false;
		
		return ((root1.data == root2.data) && 
				areIdentical(root1.left, root2.left) &&
				areIdentical(root1.right, root2.right));
	}
	
	public Node flattenTree(Node root)
	{
		if (root == null)
		{
			return null;
		}
		
		Queue<Node> q = new LinkedList();
		
		Node head = root;
		Node curr = head;
		Node prev;
		
		q.add(root);
		
		while (!q.isEmpty())
		{
			Node n = q.remove();
			
			prev = curr;
			curr.right = n;
			curr = curr.right;
			curr.left = prev;
			
			if (n.left != null)
				q.add(n.left);
			
			if (n.right != null)
				q.add(n.right);
		}
		
		return head.right;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
