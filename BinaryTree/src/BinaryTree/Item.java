package BinaryTree;

public class Item {
	private Item left;
	private Item right;
	private Item root;
	private int element;
	Item(int element){
		this.element = element;
	}
	public Item getLeft() {
		return left;
	}
	public void setLeft(Item left) {
		this.left = left;
	}
	public Item getRight() {
		return right;
	}
	public void setRight(Item right) {
		this.right = right;
	}
	public int getElement() {
		return element;
	}
	public void setElement(int element) {
		this.element = element;
	}
	public Item getRoot() {
		return root;
	}
	public void setRoot(Item root) {
		this.root = root;
	}
	
	
	
}
