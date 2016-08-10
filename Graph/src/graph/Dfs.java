package graph;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Dfs {
	Graph graph;
	boolean check[] = new boolean[10];
	

	Dfs(Graph graph) {
		this.graph = graph;
	}

	void changegraph(Graph graph) {
		this.graph = graph;
	}

	void search(int vertex) {
		List<Integer> list = graph.adjacent(vertex);;
		Iterator iterator  = list.iterator();;
		int nextVertex;
		check[vertex] = true;
		System.out.println("vertex : "  + vertex);
		
		while (iterator.hasNext()) {
			
			nextVertex = (int) iterator.next();
			if (!check[nextVertex]) {
				search(nextVertex);
			}
		}
	}
}
