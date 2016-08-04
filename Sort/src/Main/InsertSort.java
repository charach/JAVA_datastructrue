package Main;

public class InsertSort {
	static void sort(int[] ary){
		for(int i=1;i<ary.length;i++){
			int key = ary[i];
			int j=i-1;
			for(;j>=0 && ary[j] > key;j--){
				ary[j+1] = ary[j];
			}
			ary[j+1] = key;
		}
	}
	

}
