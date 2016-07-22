package Queue;

public class Queue {
	Item first;
	//큐를 초기화 한다
	public Queue(){		
		first = new Item();
	}
	//큐가 비어있는지 검사
	boolean is_empty(){
		return first.getNext() == null? true : false; 
	}
	//큐의 뒤에 요소를 추가
	void enqueue(Item item){
		Item buf = first;
		while(buf.getNext() != null){
			buf = buf.getNext();
		}
		buf.setNext(item);
	}
	//큐의 앞에 있는 요소를 반환한 다음 삭제
	Item dequeue(){
		Item buf = first.getNext();
		first.setNext(buf.getNext());
		return buf;
	}
	//큐를 삭제 하지 않고 앞에 있는 요소를 반환
	Item peek(){
		return first.getNext();
	}
}
