package com.binary;

import java.util.logging.Level;

import com.binary.MaximumLevelSum.Node;

public class CustomMaximumLevelSum {

	

	/*
Input :               4
                    /   \
                   2    -5
                  / \    /\
                -1   3 -2  6
Output: 6
Explanation :
Sum of all nodes of 0'th level is 4
Sum of all nodes of 1'th level is -3
Sum of all nodes of 0'th level is 6
Hence maximum sum is 6

Input :          1
               /   \
             2      3
           /  \      \
          4    5      8
                    /   \
                   6     7  
Output :  17
*/
	
	public static class Node {

		int data;
		Node left, right;

		public Node(int val) {
			data = val;
			left = null;
			right = null;
		}

	}

	static Node root;

	public static void main(String[] arg) {
		new CustomMaximumLevelSum();

		Node A = new Node(55);
		// Level 1
		Node B = new Node(50);
		Node C = new Node(40);
		// Level 2
		Node D = new Node(25);
		Node E = new Node(80);
		Node F = new Node(45);
		Node G = new Node(90);
		// Level 3
		Node H = new Node(10);
		Node I = new Node(35);
		Node J = new Node(65);
		Node K = new Node(75);

		// connect Level 0 and 1
		A.left = B;
		A.right = C;
		// connect level 1 and level 2
		B.left = D;
		B.right = E;
		C.left = F;
		C.right = G;
		// connect level 2 and level 3
		F.left = H;
		F.right = I;
		G.left = J;
		G.right = K;

		root = A;
		
		
		  long first = System.currentTimeMillis();
		  
		maximumLevelSum(root, level);
		  long second = System.currentTimeMillis();
			
			System.out.println("==== "+(second-first));
		System.out.println("");
		
		for (int k2 = 0; k2 < array.length; k2++) {
			int value = array[k2];
			if (maxSum<value) {
				maxSum = value;
				maxSumLevel = k2;
			}
			
			if (k2>maxLevel) {
				break;
			}
		}
		System.out.println("level is "+maxSumLevel+" and value is : "+maxSum);

	}

	static int maxSum =0;
	static int level =0 ;
	static int maxLevel = 0;
	static int maxSumLevel =0;
	static int[] array = new int[100];
	private static void maximumLevelSum(Node node, int nodeLevel) {
		// TODO Auto-generated method stub
		if (node== null) {
			return;
		}
		
		if (maxLevel<nodeLevel) {
			maxLevel = nodeLevel;
		}
		int data  = node.data;
		int value = array[nodeLevel];
		array[nodeLevel] = data+value;
		System.out.println(nodeLevel+ " : "+data);
		
		if (node.left!= null) {
			maximumLevelSum(node.left, nodeLevel+1);
		}
		if (node.right!= null) {
			maximumLevelSum(node.right, nodeLevel+1);
		}

		
		
	}

}
