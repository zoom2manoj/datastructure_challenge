package com.binary;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class RootToLeafLenghtInBinary {

	
	
	/*Input : Root of below tree
                   10
                  /   \
                8      2
              /  \    /  \
            3     5  2    4
Output : 4 paths are of length 3.

Input : Root of below tree 
                  10
                 /   \
               8      2
             /  \    /  \
            3    5  2    4
           /               \
          9                 1
Output : 2 paths are of length 3
         2 paths are of length 4
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

	public static void main(String[] arg) {
		RootToLeafLenghtInBinary obj = new RootToLeafLenghtInBinary();

		Node root = new Node(8);
		root.left = new Node(5);
		root.right = new Node(4);
		root.left.left = new Node(9);
		root.left.right = new Node(7);
		root.right.right = new Node(11);
		root.right.right.left = new Node(3);

		obj.calculatePath(root);

	}

	private void calculatePath(Node root) {

		Hashtable<Integer, Integer> m = new Hashtable<Integer, Integer>();

		pathCounts(root, m, 1);
		
		
		Set<Integer> keys = (Set<Integer>) m.keySet();
		
		Iterator<Integer> iterator  = keys.iterator();
		while (iterator.hasNext()) {
			int type = (Integer) iterator.next();
			System.out.println(type +" root length is "+ m.get(type)+ " times");
			
			
		}

	}

	private void pathCounts(Node root, Hashtable<Integer, Integer> m, int i) {
		// TODO Auto-generated method stub
		
		if(root==null){
			return;
		}
		
		if(root.left==null&&root.right==null){
			if(m.containsKey(i)){
				int value = m.get(i);
				m.put(i, value+1);
			}else{
				m.put(i, 1);	
			}
			
		}
		
		
		pathCounts(root.left, m, i+1);
		pathCounts(root.right, m, i+1);

	}
}
