package list;

public class list {
	Item firstitem;
	
	
	void add_list(Item item)// �ǳ��� ��� �߰�
	{
		Item buf = firstitem;
		
		while( buf.getNext() != null){
			buf = buf.getNext();
		
		}
		item.setPrev(buf);
		buf.setNext(item);
	}
	
	void add_first(Item item) //�Ǿտ� ����߰�
	{
		if(firstitem == null){
			this.firstitem = item;
			return;
		}
		firstitem.setPrev(item);
		item.setNext(firstitem);
		this.firstitem = item;
	}

	void add(int pos,Item item) //pos ��ġ�� ��� �߰�
	{
		Item buf = firstitem;
		for(int i=0;i<pos;i++){
			buf = buf.getNext();
		}
		buf.getPrev().setNext(item);
		item.setPrev(buf.getPrev());
		item.setNext(buf);
		buf.setPrev(item);
	}
	void delete(int pos)  // pos��ġ�� ��� ����
	{
		Item buf = firstitem;
		for(int i=0;i<pos;i++){
			buf = buf.getNext();
		}
		buf.getPrev().setNext(buf.getNext());
		buf.getNext().setPrev(buf.getPrev());
	}
	void clear()  // ����Ʈ������ ��� ����
	{
		this.firstitem = null;
	}
	void replace(int pos,Item item)  //pos��ġ�� ��Ҹ� item ���� �ٲ�
	{
		Item buf = firstitem;
		for(int i=0;i<pos;i++){
			buf = buf.getNext();
		}
		buf.setItem(item.getItem());
	}
	boolean is_in_list(Item item)   //item�� ����Ʈ�� �ִ��� �˻�
	{
		Item buf = firstitem;
		while(buf.getNext() != null){
			if(buf.getItem().equals(item.getItem())){
				return true;
			}
			buf = buf.getNext();
		}
		return false;
	}
	Item get_entry(int pos)   //pos��ġ�� ��� ��ȯ
	{
		Item buf = firstitem;
		for(int i=0;i<pos;i++){
			buf = buf.getNext();
		}
		return buf;
	}
	int get_length()   //����Ʈ ���� ��ȯ
	{
		int length = 0;
		Item buf = this.firstitem;
		while(buf.getNext() != null){
			buf = buf.getNext();
			length++;
		}
		return length;
	}
	boolean is_empty() // ����Ʈ ������� �˻�
	{
		if(firstitem == null){
			return true;
		}
		else{
			return false;
		}
	}
	void display() // ����Ʈ ��� ��� ǥ��
	{
		Item buf = this.firstitem;
		while(buf.getNext() != null){
			System.out.println(buf.getItem());
			buf = buf.getNext();
		}
	}
}
