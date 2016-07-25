package BinaryTree;

public class BinaryTree {
	/*

	���� Ž�� Ʈ��
	
	    50
	  /   \ 
	20		30
   / \
 10  15
*
*/
	Item root;
	void addNode(Item item){				//����� ����
		if(root != null){
			findAdd(root,item);
		}else{
			this.root = item;
		}
	}
	private void findAdd(Item node,Item item){
		if(node.getElement() >= item.getElement()){
			if(node.getLeft() == null){
				node.setLeft(item);
				item.setRoot(node);
				return;
			}else if(node.getRight() == null){
				node.setRight(item);
				item.setRoot(node);
				return;
			}else{
				findAdd(node.getLeft(),item);
			}
		}else{
			if(node.getRight() == null){
				node.setRight(item);
				item.setRoot(node);
				return;
			}
			else if(node.getLeft() == null){
				node.setLeft(item);
				item.setRoot(node);
				return;
			}
			else{
				findAdd(node.getRight(),item);
			}
		}
	}
	void preOrder(){			//���� Ž��
		preOrdered(root);
	}
	private void preOrdered(Item node){
		if(node != null){
		System.out.println(node.getElement());
		preOrdered(node.getLeft());
		preOrdered(node.getRight());
		}
	}
	void midOrder(){				//���� Ž��
		midOrdered(root);
	}
	private void midOrdered(Item node){
		if(node != null){
			midOrdered(node.getLeft());
			System.out.println(node.getElement());
			midOrdered(node.getRight());
		}
	}
	void aftOrder(){
		aftOrdered(root);
	}
	private void aftOrdered(Item node){
		if(node != null){
			aftOrdered(node.getLeft());
			aftOrdered(node.getRight());
			System.out.println(node.getElement());
		}
	}
	int coundNode(){				//����� ����
		if(root != null){
			return countedNode(root);
		}
		else{
			return 0;
		}
	}
	private int countedNode(Item node){
		if(node != null){
			if(node.getLeft() != null && node.getRight() != null){
				return 3+countedNode(node.getRight())+countedNode(node.getLeft());
			}else if(node.getLeft() == null || node.getRight() == null){
				return 1;
			}else{
				return 2+countedNode(node.getRight())+countedNode(node.getLeft());
			}
		}
		else{
			return 0;
		}
	}
	int oneCountNode(){		//�ܸ� ����� ����
		if(root != null){
			return oneCountedNode(root);
		}
		else{
			return 0;
		}
	}
	private int oneCountedNode(Item node){
		if(node != null){
			if(node.getLeft() == null && node.getRight() == null){
				return 1;
			}
			else if(node.getRight() != null && node.getLeft() != null){
				return 0+oneCountedNode(node.getLeft())+oneCountedNode(node.getRight());
			}else{
				return 0+oneCountedNode(node.getLeft())+oneCountedNode(node.getRight());
			}
		}
		else{
			return 0;
		}
	}
	int lengthTree(){			//Ʈ���� ����
		if(root != null){
			return lengthTreed(root);
			
		}else{
			return 0;
		}
	}
	private int lengthTreed(Item item){
		if(item  == null){
			return 0;
		}
		else{
			return 1+(lengthTreed(item.getLeft())>lengthTreed(item.getRight())?lengthTreed(item.getLeft()):lengthTreed(item.getRight()));
		}
	}
	void deleteNode(Item item){			//����� ����
		if(root == null){
			System.out.println("No node!");
		}else if(root.getElement() == item.getElement()){
			root = null;
		}
		else{
			deletedNode(root,item);
		}
	}
	private void deletedNode(Item node,Item item){
		if(node.getLeft().getElement() != item.getElement() && node.getRight().getElement() != item.getElement()){
			if(node.getElement() >= item.getElement()){
				deletedNode(node.getLeft(),item);
			}else{
				deletedNode(node.getRight(),item);
			}
		}else{
			if(node.getLeft().getElement() == item.getElement()){
				Item leftLeast  = findLeastNode(node.getLeft(),0);
				Item rightLeast = findLeastNode(node.getLeft(),1);
				Item buf;
				if(leftLeast.getElement() >= rightLeast.getElement()){
					buf =new Item(leftLeast.getElement());
					buf.getRoot().setLeft(null);
				}else{
					buf = new Item(rightLeast.getElement());
					buf.getRoot().setRight(null);
				}
				buf.setLeft(node.getLeft().getLeft());
				buf.setRight(node.getLeft().getRight());
				node.setLeft(buf);
				}else{
					Item leftLeast  = findLeastNode(node.getRight(),0);
					Item rightLeast = findLeastNode(node.getRight(),1);
					Item buf;
					if(leftLeast.getElement() >= rightLeast.getElement()){
						buf =new Item(leftLeast.getElement());
						buf.getRoot().setLeft(null);
					}else{
						buf = new Item(rightLeast.getElement());
						buf.getRoot().setRight(null);
					}
					buf.setLeft(node.getLeft().getLeft());
					buf.setRight(node.getLeft().getRight());
					node.setRight(buf);
			}
		}
	}
	private Item findLeastNode(Item node,int num){
		if(num==0){
			if(node.getLeft() == null){
				return node;
			}else{
				return findLeastNode(node.getLeft(),0);
			}
		}else{
			if(node.getRight() == null){
				return node;
			}else{
				return findLeastNode(node.getRight(),1);
			}
		}
	}
	
}
