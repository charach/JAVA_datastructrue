package Queue;

public class Item {
	private Object element;
	private Item next;
	public Item(){
		
	}
	public Item(Object element){
		this.element = element;
	}
	public Object getElement() {
		return element;
	}
	public void setElement(Object element) {
		this.element = element;
	}
	public Item getNext() {
		return next;
	}
	public void setNext(Item next) {
		this.next = next;
	}
	
	
	
}
