package com.chandran.july2020;

import java.util.Vector;

public class TreeSplit {
	// For checking if the graph
	// can be split into K equal
	// Connected Components
	static int flag = 0;

	// DFS Traversal
	static int DFS(Vector<Integer> adj[], int k, int i, int x) {

		// Intialise ans to 1
		int ans = 1;

		// Traverse the adjacency
		// for vertex i
		for (int it : adj[i]) {
			if (it != k) {
				ans += DFS(adj, i, it, x);
			}
		}

		// If number of nodes is
		// greater than x, then
		// the tree cannot be split
		if (ans > x) {
			flag = 1;
			return 0;
		}

		// Check for requirement
		// of nodes
		else if (ans == x) {
			ans = 0;
		}
		return ans;
	}

	// A utility function to add
	// an edge in an undirected
	// Tree
	static void addEdge(Vector<Integer> adj[], int u, int v) {
		adj[u].add(v);
		adj[v].add(u);
	}

	// Driver's Code
	public static void main(String[] args) {
		int N = 15, K = 5;

		// Adjacency List
		Vector<Integer>[] adj = new Vector[N + 1];
		for (int i = 0; i < N + 1; i++)
			adj[i] = new Vector<Integer>();

		// Adding edges to List
		addEdge(adj, 1, 2);
		addEdge(adj, 2, 3);
		addEdge(adj, 2, 4);
		addEdge(adj, 4, 5);
		addEdge(adj, 5, 6);
		addEdge(adj, 5, 7);
		addEdge(adj, 4, 8);
		addEdge(adj, 4, 9);
		addEdge(adj, 8, 11);
		addEdge(adj, 10, 11);
		addEdge(adj, 11, 14);
		addEdge(adj, 9, 12);
		addEdge(adj, 12, 15);
		addEdge(adj, 12, 13);

		// Check if tree can be split
		// into K Connected Components
		// of equal number of nodes
		if (N % K == 0) {
			// DFS call to Check
			// if tree can be split
			DFS(adj, -1, 1, N / K);
		}

		// If flag is 0, then the
		// given can be split to
		// Connected Components
		System.out.print(flag == 1 ? "NO" : "YES");
	}

}
