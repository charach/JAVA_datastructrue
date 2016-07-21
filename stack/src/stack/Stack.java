package stack;

public class Stack {
	Item first;
	boolean isEmpty(){		//스택 비어있는지 검사
		return first == null? true : false;
	}
	void push(Item e){ //스택 의 맨위에 요소 추가
		if(isEmpty()){
			first = e;
			
		}
		else{
			e.setNext(first);
			first = e;
		}
	}
	Item pop(){			//스택의 맨 위에 있는 요소를 삭제
		Item buf = first;
		first = first.getNext();
		return buf;
	}
	
	Item peek(){		//스택의 맨위에 요소를 삭제 하지 않고 반환
		return first;
	}
	
}
