package Queue;

public class Queue {
	Item first;
	//ť�� �ʱ�ȭ �Ѵ�
	public Queue(){		
		first = new Item();
	}
	//ť�� ����ִ��� �˻�
	boolean is_empty(){
		return first.getNext() == null? true : false; 
	}
	//ť�� �ڿ� ��Ҹ� �߰�
	void enqueue(Item item){
		Item buf = first;
		while(buf.getNext() != null){
			buf = buf.getNext();
		}
		buf.setNext(item);
	}
	//ť�� �տ� �ִ� ��Ҹ� ��ȯ�� ���� ����
	Item dequeue(){
		Item buf = first.getNext();
		first.setNext(buf.getNext());
		return buf;
	}
	//ť�� ���� ���� �ʰ� �տ� �ִ� ��Ҹ� ��ȯ
	Item peek(){
		return first.getNext();
	}
}
