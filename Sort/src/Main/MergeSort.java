package Main;

public class MergeSort {
	static int arybuf[];
	
	MergeSort(int[] ary){
		arybuf = new int[ary.length];
		sort(ary,0,ary.length-1);
		ary = arybuf.clone();
		
		
	}
	
	
	
	
	void sort(int[] ary,int left,int right){
		if(left<right){
			int mid = (left+right)/2;
			sort(ary,left,mid);
			sort(ary,mid+1,right);
			
			mergesort(ary,left,mid,right);
			
			
		}
	}
	
	void mergesort(int[] ary,int left,int mid,int right){
		int leftpos=left;
		int rightpos=mid+1;
		int i=left;
		while(leftpos <= mid && rightpos<=right){
			if(ary[leftpos] < ary[rightpos]){
				arybuf[i] = ary[leftpos++];
			}else{
				arybuf[i] = ary[rightpos++];
			}
			i++;
		}
		
		
			while(rightpos <= right){
				arybuf[i++] = ary[rightpos++];
	
			}
		
			while(leftpos <= mid){
				arybuf[i++] = ary[leftpos++];

			
		}
		for(int pp=left;pp<=right;pp++){
			ary[pp] = arybuf[pp];
		}
	}
}
