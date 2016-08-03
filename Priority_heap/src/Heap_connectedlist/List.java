package Heap_connectedlist;

public class List {
	Item first;

	List() {

	}

	List(Item first) {
		this.first = first;
	}

	boolean is_empty() { // check Heap == empty
		return first == null ? true : false;
	}

	void insert(Item item) { // insert to Heap
		if (first == null) {
			first = item;

		} else if (first.getPriority() < item.getPriority()) {
			item.setNext(first);
			first.setPrev(item);
			this.first = item;
			
		} else {
			Item buf = first;
			while(true){
				if(buf.getPriority() < item.getPriority()){
					item.setPrev(buf.getPrev());
					item.setNext(buf);
					
					buf.getPrev().setNext(item);
					
					buf.setPrev(item);
					return;
				}
				else if(buf.getNext() == null){
					buf.setNext(item);
					item.setPrev(buf);
					return;
				}
				buf = buf.getNext();
			}
		
		}

	}

	Item delete() { // delete heap that has highest priority
		Item buf = first;
		this.first = first.getNext();
		return buf;
	}

	Item find() { // return heap that has highest priority
		return first;
	}
}
