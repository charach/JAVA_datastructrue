package list;

public class list {
	Item firstitem;
	
	
	void add_list(Item item)// 맨끝에 요소 추가
	{
		Item buf = firstitem;
		
		while( buf.getNext() != null){
			buf = buf.getNext();
		
		}
		item.setPrev(buf);
		buf.setNext(item);
	}
	
	void add_first(Item item) //맨앞에 요소추가
	{
		if(firstitem == null){
			this.firstitem = item;
			return;
		}
		firstitem.setPrev(item);
		item.setNext(firstitem);
		this.firstitem = item;
	}

	void add(int pos,Item item) //pos 위치에 요소 추가
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
	void delete(int pos)  // pos위치에 요소 제거
	{
		Item buf = firstitem;
		for(int i=0;i<pos;i++){
			buf = buf.getNext();
		}
		buf.getPrev().setNext(buf.getNext());
		buf.getNext().setPrev(buf.getPrev());
	}
	void clear()  // 리스트아이템 모두 제거
	{
		this.firstitem = null;
	}
	void replace(int pos,Item item)  //pos위치에 요소를 item 으로 바꿈
	{
		Item buf = firstitem;
		for(int i=0;i<pos;i++){
			buf = buf.getNext();
		}
		buf.setItem(item.getItem());
	}
	boolean is_in_list(Item item)   //item이 리스트에 있는지 검사
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
	Item get_entry(int pos)   //pos위치에 요소 반환
	{
		Item buf = firstitem;
		for(int i=0;i<pos;i++){
			buf = buf.getNext();
		}
		return buf;
	}
	int get_length()   //리스트 길이 반환
	{
		int length = 0;
		Item buf = this.firstitem;
		while(buf.getNext() != null){
			buf = buf.getNext();
			length++;
		}
		return length;
	}
	boolean is_empty() // 리스트 비었는지 검사
	{
		if(firstitem == null){
			return true;
		}
		else{
			return false;
		}
	}
	void display() // 리스트 모든 요소 표시
	{
		Item buf = this.firstitem;
		while(buf.getNext() != null){
			System.out.println(buf.getItem());
			buf = buf.getNext();
		}
	}
}
