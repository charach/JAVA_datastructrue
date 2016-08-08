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

		ArrayList al = new ArrayList();
		
		
		al = ga.adjacent(3);
		Iterator at = al.iterator();
		while(at.hasNext()){
			System.out.println("3 adjecent : "+at.next());
		}
		
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
		gll.insertEdge(2, 2);
		gll.insertEdge(2, 3);
		gll.insertEdge(3, 0);
		gll.insertEdge(3, 2);

		al = new ArrayList();
		
		
		al = gll.adjacent(3);
		at = al.iterator();
		while(at.hasNext()){
			System.out.println("3 adjecent : "+at.next());
		}
		
		
		gll.deleteEdge(3, 0);
		
		}

}
