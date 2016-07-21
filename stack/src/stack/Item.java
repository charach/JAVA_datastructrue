package stack;

public class Item {
	private Item next;
	private Object element;
	public Item(){
		
	}
	public Item(Object element){
		this.element = element;
	}
	public Item getNext() {
		return next;
	}
	public void setNext(Item next) {
		this.next = next;
	}
	public Object getElement() {
		return element;
	}
	public void setElement(Object element) {
		this.element = element;
	}
	
}
