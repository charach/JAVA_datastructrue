package Heap_connectedlist;

public class Item{
	private Object element;
	private int priority;
	private Item prev;
	private Item next;
	Item(){
		
	}
	Item(Object element,int priority){
		this.element = element;
		this.priority = priority;
	}
	public Object getElement() {
		return element;
	}
	public void setElement(Object element) {
		this.element = element;
	}
	public Item getPrev() {
		return prev;
	}
	public void setPrev(Item prev) {
		this.prev = prev;
	}
	public Item getNext() {
		return next;
	}
	public void setNext(Item next) {
		this.next = next;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	 
}
