package Heap_connectedlist;

public class Main {
	public static void main(String[] args){
		List heap = new List();
		for(int i=0;i<10;i++){
			heap.insert(new Item(new Integer(i),(int)(Math.random()*10)+1));
			
		}
		while(!heap.is_empty()){
			Item it = heap.delete();
			System.out.println(it.getElement() + "   |||||  "+ it.getPriority() );
		}
	}
}
