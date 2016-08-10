package graph;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphArray ga = new GraphArray();
		GraphLinkedList gll = new GraphLinkedList();
		
		ga.insertVertex(0);
		ga.insertVertex(1);
		ga.insertVertex(2);
		ga.insertVertex(3);
		ga.insertEdge(0, 1);
		ga.insertEdge(0, 2);
		ga.insertEdge(0, 3);
		ga.insertEdge(1, 0);
		ga.insertEdge(1, 2);
		ga.insertEdge(2, 0);
		ga.insertEdge(2, 1);
		ga.insertEdge(2, 2);
		ga.insertEdge(2, 3);
		ga.insertEdge(3, 0);
		ga.insertEdge(3, 2);

		
		
		gll.insertVertex(0);
		gll.insertVertex(1);
		gll.insertVertex(2);
		gll.insertVertex(3);
		gll.insertEdge(0, 1);
		gll.insertEdge(0, 2);
		gll.insertEdge(0, 3);
		gll.insertEdge(1, 0);
		gll.insertEdge(1, 2);
		gll.insertEdge(2, 0);
		gll.insertEdge(2, 1);
		gll.insertEdge(2, 3);
		gll.insertEdge(3, 0);
		gll.insertEdge(3, 2);

		Dfs dfs = new Dfs(gll);
		
		dfs = new Dfs(ga);
	
		
		Bfs bfs = new Bfs(gll);
		bfs.search(2);
		
		bfs.changegraph(ga);
		bfs.search(1);
	}

}
