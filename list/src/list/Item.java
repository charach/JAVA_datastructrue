package list;

public class Item {
	private Item prev = null;
	private Item next = null;
	private Object item;
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
	public Object getItem() {
		return item;
	}
	public void setItem(Object item) {
		this.item = item;
	}

	
}
