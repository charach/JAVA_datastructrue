package Main;



public class QuickSort {
	
	
	static void sort(int[] ary,int left,int right){
		if(left<right){

			int pivot = quicksort(ary,left,right);
			
			sort(ary,left,pivot-1);
			sort(ary,pivot,right);
		}
	}
	static int quicksort(int[] ary,int left,int right){
		
		int pivotvalue = ary[ (left+right)/2];
		int buf;
		int low = left;
		int high= right;
		while(low<=high){
			
			while(ary[low] < pivotvalue){
				low++;
			}
			while(ary[high] > pivotvalue){
				high--;
			}
			if(low<=high){
				buf = ary[low];
				ary[low] =ary[high];
				ary[high] = buf;
				low++;
				high--;
			}
		}
		return low;
	}
	
	
	 
	
}
