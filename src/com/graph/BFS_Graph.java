package com.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS_Graph {

	private int V;
	private LinkedList<Integer> adj[];
	
	
	
	/*===== Answer 
	 * 
	 *   http://www.geeksforgeeks.org/wp-content/uploads/BFS.jpg
	 *   
	 * 
	Following is Breadth First Traversal (starting from vertex 2)
	2 0 3 1
	*/
	public BFS_Graph(int v) {
		// TODO Auto-generated constructor stub
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i) {
			adj[i] = new LinkedList<>();
		}

	}

	private void addEdge(int v, int w) {
		// TODO Auto-generated method stub
		adj[v].add(w);
	}

	private void BFS(int s) {
		// TODO Auto-generated method stub

		boolean visited[] = new boolean[V];
		LinkedList<Integer> queue = new LinkedList<>();
		visited[s] = true;
		queue.add(s);
		System.out.println(s);
		while (queue.size() != 0) {
			s = queue.poll();
			Iterator<Integer> iter = adj[s].listIterator();

			while (iter.hasNext()) {
				int n = iter.next();

				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
					System.out.println(n);
				}

			}
		}
		
		
		Iterator<Integer> value = queue.listIterator();
		while (value.hasNext()) {
			System.out.println(value.next());
			
		}

	}

	public static void main(String arg[]) {
		BFS_Graph g = new BFS_Graph(4);
		  
	        g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(1, 2);
	        g.addEdge(2, 0);
	        g.addEdge(2, 3);
	        g.addEdge(3, 3);
	 
	        System.out.println("Following is Breadth First Traversal "+
	                           "(starting from vertex 2)");
	 
	        g.BFS(2);
	}
}
