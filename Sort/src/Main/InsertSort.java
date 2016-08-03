package Main;

public class InsertSort {
	static void sort(int[] ary){
		for(int i=1;i<ary.length-1;i++){
			int j=i-1;
			for(;j>=0 && ary[j] >ary[i];j--){
				ary[j+1] = ary[j];
			}
			ary[j+1] = ary[i];
		}
	}
	

}
