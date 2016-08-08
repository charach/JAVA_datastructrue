package graph;

import java.util.ArrayList;


public interface Graph {				
	void insertVertex(int vertex);
	void insertEdge(int edges,int edgef);		
	void deleteVertex(int vertex);
	void deleteEdge(int edges,int edgef);
	boolean isEmpty();
	ArrayList adjacent(int vertex);
	void destroyGraph();
}
