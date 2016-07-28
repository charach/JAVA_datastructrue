package Heap_array;

public class Heap {
	int[] element;
	int HeapSize;
	Heap(){
		element = new int[100];
		element[0] = 0;
		HeapSize= 0;
	}
	boolean is_empty() 				//examine Priority Queue empty
	{
		if(HeapSize == 0){
			return true;
		}
		else{
			return false;
		}
		
	}
	boolean is_full() 					//examine Priority Queue full
	{
		if(HeapSize == 100){
			return true;
		}
		else{
			return false;
		}
	}
	void insert(int item) 		//insert item to Priority Queue
	{
		if(HeapSize == 0){
			element[1] = item;
			HeapSize++;
			return;
		}
		int pos = HeapSize+1;
		int buf;
		element[pos] = item;
		while(element[pos/2] < element[pos] && pos>1){
			buf = element[pos/2];
			element[pos/2] = element[pos];
			element[pos] = buf;
			pos /=2;
		}
	
		HeapSize++;
	}
	int delete()					//delete item that has highest priority in Queue
	{
		int highPriorityItem = element[1];
		
		if(HeapSize == 1){
			element[1] = 0;
			
		}
		else{
			int pos;
			
			if(element[2] > element[3]){
				pos = 2;
				element[1] = element[2];
				element[2] = 0;
			}else{
				pos = 3;
				element[1] = element[3];
				element[3] = 0;
			}

			while(element[pos*2] >element[pos] || element[pos*2+1] > element[pos]){
				if(element[pos*2] > element[pos*2+1]){
					element[pos] = element[pos*2];
					element[pos*2] = 0;
					pos = pos*2;
				}else{
					element[pos] = element[pos*2+1];
					element[pos*2+1]=0;
					pos = pos *2+1;
				}
			}
			
		}			
		HeapSize--;
		return highPriorityItem;
	}
	int find()						//find and return item that has highest priority in Queue
	{
		return element[1];
	}
}

