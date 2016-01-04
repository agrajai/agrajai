package com.tgt.qa.tests.csrportal;

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
		t.createBST(90);
		t.createBST(50);
		t.createBST(20);
		t.createBST(75);
		t.createBST(66);
		t.createBST(150);
		t.createBST(80);
		t.createBST(68);
		
		
//		System.out.println("Printing PRE ORDER TRAVERSAL");
//		t.preOrderTraversal(t.root);
//		
		System.out.print("Printing IN ORDER TRAVERSAL before deletion:");
		t.inOrderTraversal(t.root);
		
//		t.removeNode(t.root, 50);
		
	//	System.out.println("");
		//System.out.print("Printing IN ORDER TRAVERSAL after deletion :");
		//t.inOrderTraversal(t.root);
//		
//		System.out.println("Printing POST ORDER TRAVERSAL");
//		t.postOrderTraversal(t.root);
		
//		System.out.println("iS BST: " + t.isBinarySearchTree(t.root, Integer.MIN_VALUE, Integer.MAX_VALUE));
		System.out.println("\nLCA: : " + t.findLCA(t.root, 68, 80).data);
		
		System.out.println("\nMax depth: : " + t.maxDepth(t.root));
		
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
		System.out.print(", " + root.data);
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
	
	public Node findLCA(Node root, int v1, int v2)
	{
//	    if(node == null) {
//	        return -1;
//	    }
//	    if(node.data > t2 && node.data > t1) {
//	        // both targets are left
//	        return findLCA(node.left, t1, t2);
//	    } else if (node.data < t2 && node.data < t1) {
//	        // both targets are right
//	        return findLCA(node.right, t1, t2);
//	    } else {
//	        // either we are diverging or both targets are equal
//	        // in both cases so we've found the LCA
//	        // check for actual existence of targets here, if you like
//	        return node.data;
//	    }
		
		if (root==null)
            return null;
        if (root.data==v1 || root.data==v2)
        {
            return root;
        }
        
        Node left = findLCA(root.left,v1,v2);
        Node right = findLCA(root.right,v1,v2);

        if(left!=null && right!=null)
            return root;
        else if (left!=null)
             return left;
        else  return right;
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
}
