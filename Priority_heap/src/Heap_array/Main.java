package Heap_array;

public class Main {
	public static void main(String[] args){
		Heap heap = new Heap();
		for(int i=1;i<10;i++){
			heap.insert(i);
		}
		for(int i=1;i<10;i++){
		 System.out.println(heap.delete());
		}
	}
}
