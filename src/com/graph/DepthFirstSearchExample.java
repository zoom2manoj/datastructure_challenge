package com.graph;

import java.util.ArrayList;
import java.util.Stack;

public class DepthFirstSearchExample {
	
	//Using custom collection instance of Stack and array 
	
	
	// DFS link 
	//http://www.java2blog.com/wp-content/uploads/2015/12/Screen2BShot2B2015-12-272Bat2B11.19.482Bpm.png
	//http://opendatastructures.org/ods-java/img4539.png
	/*
	 * 
 	0	1	2	3	4	5	6	7	8	9	10	11
0	0	1	0	0	1	0	0	0	0	0	0	0
1	1	0	1	0	0	1	1	0	0	0	0	0
2	1	0	0	1	0	0	1	0	0	0	0	0
3	0	0	1	0	0	0	0	1	0	0	0	0
4	1	0	0	0	0	1	0	0	1	0	0	0
5	0	1	1	0	1	0	1	0	0	1	0	0
6	0	0	1	0	0	1	0	1	0	0	1	0
7	0	0	0	1	0	0	1	0	0	0	0	1
8	0	0	0	0	1	0	0	0	0	1	0	0
9	0	0	0	0	0	1	0	0	1	0	1	0
10	0	0	0	0	0	0	1	0	0	1	0	1
11	0	0	0	0	0	0	0	1	0	0	1	0

 A graph and its adjacency matrix.
*/
	static ArrayList nodes = new ArrayList();

	static class Node {
		int data;
		boolean visited;

		Node(int data) {
			this.data = data;

		}
	}

	// find neighbors of node using adjacency matrix
	// if adjacency_matrix[i][j]==1, then nodes at index i and index j are
	// connected
	public ArrayList findNeighbours(int adjacency_matrix[][], Node x) {
		int nodeIndex = -1;

		ArrayList neighbours = new ArrayList();
		for (int i = 0; i < nodes.size(); i++) {
			if (nodes.get(i).equals(x)) {
				nodeIndex = i;
				break;
			}
		}

		if (nodeIndex != -1) {
			for (int j = 0; j < adjacency_matrix[nodeIndex].length; j++) {
				if (adjacency_matrix[nodeIndex][j] == 1) {
					neighbours.add(nodes.get(j));
				}
			}
		}
		return neighbours;
	}

	// Recursive DFS
	public void dfs(int adjacency_matrix[][], Node node) {

		System.out.print(node.data + "t");
		ArrayList neighbours = findNeighbours(adjacency_matrix, node);
		for (int i = 0; i < neighbours.size(); i++) {
			Node n = (Node) neighbours.get(i);
			if (n != null && !n.visited) {
				dfs(adjacency_matrix, n);
				n.visited = true;

			}
		}
	}

	// Iterative DFS using stack
	public void dfsUsingStack(int adjacency_matrix[][], Node node) {
		Stack stack = new Stack();
		stack.add(node);
		node.visited = true;
		while (!stack.isEmpty()) {
			Node element = (Node) stack.pop();
			System.out.print(element.data + "t");

			ArrayList neighbours = findNeighbours(adjacency_matrix, element);
			for (int i = 0; i < neighbours.size(); i++) {
				Node n = (Node) neighbours.get(i);
				if (n != null && !n.visited) {
					stack.add(n);
					n.visited = true;

				}
			}
		}
	}

	public static void main(String arg[]) {

		Node node40 = new Node(40);
		Node node10 = new Node(10);
		Node node20 = new Node(20);
		Node node30 = new Node(30);
		Node node60 = new Node(60);
		Node node50 = new Node(50);
		Node node70 = new Node(70);

		nodes.add(node40);
		nodes.add(node10);
		nodes.add(node20);
		nodes.add(node30);
		nodes.add(node60);
		nodes.add(node50);
		nodes.add(node70);
		int adjacency_matrix[][] = { { 0, 1, 1, 0, 0, 0, 0 }, // Node 1: 40
				{ 0, 0, 0, 1, 0, 0, 0 }, // Node 2 :10
				{ 0, 1, 0, 1, 1, 1, 0 }, // Node 3: 20
				{ 0, 0, 0, 0, 1, 0, 0 }, // Node 4: 30
				{ 0, 0, 0, 0, 0, 0, 1 }, // Node 5: 60
				{ 0, 0, 0, 0, 0, 0, 1 }, // Node 6: 50
				{ 0, 0, 0, 0, 0, 0, 0 }, // Node 7: 70
		};

		DepthFirstSearchExample dfsExample = new DepthFirstSearchExample();

		System.out.println("The DFS traversal of the graph using stack ");
		dfsExample.dfsUsingStack(adjacency_matrix, node40);

		System.out.println();

		clearVisitedFlags();

		System.out.println("The DFS traversal of the graph using recursion ");
		dfsExample.dfs(adjacency_matrix, node40);

	}

	public static void clearVisitedFlags() {
		for (int i = 0; i < nodes.size(); i++) {
			Node n = (Node)nodes.get(i);
			n.visited = false;
		}
	}
}
