package com.binary;

public class MaximumSumFromRootToLeaf {
	
	/*
	 *              1
                  /   \
                2      3
              /  \       \
            4     5       6
           /  \     \
          7    8     9
            
            Maximum sum leaf to root path : 17
            Path : 1 2 5 9
            
            
            *
            */
	
	
	public static class Node{
		int data;
		Node left, right;
		
		public Node(int value){
			data = value;
			left = null;
			right = null;
		}
	}
	
	
	public static void main(String[] arg){
		
		Node root = new Node(1);
		root.left = new Node (2);
		root.right = new Node (3);
		root.left.left = new Node (4);
		root.left.right = new Node (5);
		root.right.left = new Node (6);
		root.right.left.left = new Node (8);
		
		
		MaximumSumFromRootToLeaf obj = new MaximumSumFromRootToLeaf();
		obj.maxSum(root, 0);
		System.out.println("Max sum : "+maxSum);
		obj.path(root, maxLeaf);
		
		
		
	}


	private boolean path(Node root, Node maxLeaf2) {
		// TODO Auto-generated method stub
		if(root==null) return false;
		
		
		if(root == maxLeaf2||path(root.left, maxLeaf2)||path(root.right, maxLeaf2)){
			System.out.println(" "+root.data);
			return true;
		}
		
		return false;
	}


	static int maxSum;
	int currentSum;
	static Node maxLeaf;
	
	private void maxSum(Node root, int sum) {
		// TODO Auto-generated method stub
		if (root==null) {
			return;
		}
		
		
		sum = sum + root.data;
		
		if(maxSum<sum&&root.left==null 	&& root.right==null){
			maxSum = sum;
			maxLeaf = root;
		}
		
		maxSum(root.left, sum);
		maxSum(root.right, sum);
		
	}
	
	

}
