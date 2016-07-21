package stack;

public class Stack {
	Item first;
	boolean isEmpty(){		//���� ����ִ��� �˻�
		return first == null? true : false;
	}
	void push(Item e){ //���� �� ������ ��� �߰�
		if(isEmpty()){
			first = e;
			
		}
		else{
			e.setNext(first);
			first = e;
		}
	}
	Item pop(){			//������ �� ���� �ִ� ��Ҹ� ����
		Item buf = first;
		first = first.getNext();
		return buf;
	}
	
	Item peek(){		//������ ������ ��Ҹ� ���� ���� �ʰ� ��ȯ
		return first;
	}
	
}
