package Main;

public class BucketSort {
	static void sort(int[] ary){
		int[] sortlist = new int[100];
		int j=0;
		for(int i:ary){
			sortlist[i]++;
		}
		
		for(int i=0;i<sortlist.length;i++){
			while(sortlist[i]-->0){
				ary[j++] = i;				
			}
		}
	}
}
