package graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class GraphLinkedList implements Graph {
	LinkedList linkedlist[];

	GraphLinkedList() {
		linkedlist = new LinkedList[10];
	}

	@Override
	public void insertVertex(int vertex) {
		// TODO Auto-generated method stub
		linkedlist[vertex] = new LinkedList();
	}

	@Override
	public void insertEdge(int edges, int edgef) {
		// TODO Auto-generated method stub
		if (linkedlist[edges] == null || linkedlist[edgef] == null) {
			System.out.println("Graph don't have vertex");
			return;
		}
		if (!linkedlist[edges].contains(edgef)) {
			linkedlist[edges].add(edgef);
			linkedlist[edgef].add(edges);
		}

	}

	@Override
	public void deleteVertex(int vertex) {
		// TODO Auto-generated method stub
		Iterator ia = linkedlist[vertex].iterator();
		while (ia.hasNext()) {
			linkedlist[(int) ia.next()].remove(new Integer(vertex));
		}
		linkedlist[vertex] = null;

	}

	@Override
	public void deleteEdge(int edges, int edgef) {
		// TODO Auto-generated method stub
		linkedlist[edges].remove(new Integer(edgef));
		linkedlist[edgef].remove(new Integer(edges));

	}

	@Override
	public boolean isEmpty() {
		for (int i = 0; i < linkedlist.length; i++) {
			if (linkedlist[i].size() > 0) {
				return false;
			}

		}
		return true;
	}

	@Override
	public ArrayList adjacent(int vertex) {
		ArrayList al = new ArrayList();
		if(linkedlist[vertex] == null){
			System.out.println("No vertex");
			return null;
		}
		for (int i = 0; i < linkedlist[vertex].size(); i++) {
			al.add(linkedlist[vertex].get(i));
		}
		return al;
	}

	@Override
	public void destroyGraph() {
		// TODO Auto-generated method stub
		linkedlist = new LinkedList[10];
	}

}
