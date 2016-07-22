package Queue;

public class Main {
	public static void main(String[] args){
		Queue qu = new Queue();
		for(int i=0;i<10;i++){
			qu.enqueue(new Item(new Integer(i)));
		}
		while(!qu.is_empty()){
			System.out.println(qu.dequeue().getElement());
		}
	}
}
