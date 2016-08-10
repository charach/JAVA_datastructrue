package graph;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Bfs {
	boolean check[] = new boolean[10];
	boolean checkstack[] = new boolean[10];
	Graph graph;

	Bfs(Graph graph) {
		this.graph = graph;
	}

	void changegraph(Graph graph) {
		this.graph = graph;
		check = new boolean[10];
		checkstack = new boolean[10];
	}

	void search(int vertex) {
		List list = graph.adjacent(vertex);
		Iterator iterator = list.iterator();
		Stack stack = new Stack();
		int nextnum;
		if (!check[vertex]) {
			System.out.println("vertex : " + vertex);
		}
		check[vertex] = true;
		checkstack[vertex] = true;
		while (iterator.hasNext()) {
			nextnum = (int) iterator.next();
			if (!check[nextnum]) {
				check[nextnum] = true;
				
				System.out.println("vertex : " + vertex);
			}
			if (!checkstack[nextnum]) {
				stack.push(nextnum);
			}

		}
		while (!stack.isEmpty()) {
			search((int) stack.pop());
		}

	}
}
