package list;

public class Main {
	public static void main(String[] args){
		Item buf = new Item();
		list ls = new list();
		buf.setItem(1);
		ls.add_first(buf);
		for(int i=0;i<10;i++){
			buf = new Item();
			buf.setItem(i);
			ls.add_list(buf);
		}
		ls.display();
	}
}
