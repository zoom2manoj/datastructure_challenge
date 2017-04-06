package com.binary;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumLevelSum {
	

	
	/*Input :               4
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
Output :  17*/
	
	public static class Node{
		
		int data;
		Node left, right;
		public Node(int val){
			data = val;
			left = null;
			right = null;
		}
		
	}
	
	static Node root;
	
	
	public static void main(String[] arg){
		
		MaximumLevelSum obj = new MaximumLevelSum();
		
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
		
		obj.maxLevelSum();
	}


	private  void maxLevelSum() {
		// TODO Auto-generated method stub
	
		
		
		
		if (root == null) {
			System.out.println("Tree is empty");
			return;
		}
		Queue queue = new LinkedList();
		queue.offer(root);
		// level delimiter
		queue.offer(null);

		int maxSum = 0;
		int level = 0;
		// default root level
		int localLevel = 0;
		int localSum = 0;
		while (!queue.isEmpty()) {
			Node node = (Node) queue.poll();
			// Level change
			if (null == node) {
				if (!queue.isEmpty()) {
					// level delimiter
					queue.offer(null);
				}

				if (localSum > maxSum) {
					maxSum = localSum;
					level = localLevel;
				}
				// Reset the level sum for next level calculation
				localSum = 0;
				localLevel++;
			} else {
				if (node.left != null) {
					queue.offer(node.left);
				}
				if (node.right != null) {
					queue.offer(node.right);
				}
				
				System.out.println(node.data);
				localSum += node.data;
				
			}
			System.out.println(" ");
		}
		System.out.println("Max Sum = " + maxSum + " is at Level = " + level);
		
	}
	

}
