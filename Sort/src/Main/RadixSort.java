package Main;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.SynchronousQueue;

public class RadixSort {
	static void sort(int[] ary){
		LinkedList radix[] = new LinkedList[10]; 
		LinkedList radix2[] = new LinkedList[10];
		int num;
		int i;
		Iterator iterator;
		for(i=0;i<radix.length;i++){
			radix[i] = new LinkedList();
			radix2[i] = new LinkedList();
		}
		for(i=0;i<ary.length;i++){
			radix[ary[i]%10].offer(ary[i]);
		}
		for(i=0;i<radix.length;i++){
			iterator = radix[i].iterator();
			while(iterator.hasNext()){
				num = Integer.parseInt(iterator.next().toString());
				radix2[num/10].offer(num);
			}
		}
		i=0;
		for(int j=0;j<radix2.length;j++){
				iterator = radix2[j].iterator();
				while(iterator.hasNext()){
					ary[i++]=(int) radix2[j].poll();
				}
			}
		}
	
}
