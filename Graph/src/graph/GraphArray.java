package graph;

import java.util.ArrayList;


public class GraphArray implements Graph{
	int array[][];
	GraphArray(){
		array = new int[10][10];
	}
	@Override
	public void insertVertex(int vertex) {
		if(vertex>= 10){
			System.out.println("error : vertex num is bigger than array size");
			return;
		}
		array[vertex][vertex] = 1;
		
	}

	@Override
	public void insertEdge(int edges, int edgef) {
		if(array[edges][edges] == 0 || array[edgef][edgef] == 0){
			System.out.println("Graph don't have vertex");
			return;
		}
		array[edges][edgef] = 1;
		array[edgef][edges] = 1;
	}

	@Override
	public void deleteVertex(int vertex) {
		// TODO Auto-generated method stub
		array[vertex][vertex] = 0;
		for(int i=0;i<array[vertex].length;){
			array[vertex][i] = 0;
			array[i][vertex] = 0;
		}
	}

	@Override
	public void deleteEdge(int edges, int edgef) {
		array[edges][edgef] = 0;
		array[edgef][edges] = 0;
	}

	@Override
	public boolean isEmpty() {
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				if(array[i][j] == 1){
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public ArrayList adjacent(int vertex) {
		ArrayList ls = new ArrayList();
		
		for(int i=0;i<array.length;i++){
			if(array[vertex][i]==1 && i!= vertex){
				ls.add(i);
			}
		}
		return ls;
	}

	@Override
	public void destroyGraph() {
		array = new int[10][10];
	}
	
}
