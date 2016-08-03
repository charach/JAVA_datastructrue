package Main;

public class BubbleSort {
	static void sort(int[] ary){
		for(int i=ary.length,temp;i>0;i--){
			for(int j=0;j<i-1;j++){
				if(ary[j+1] < ary[j]){
					temp = ary[j];
					ary[j] = ary[j+1];
					ary[j+1] = temp;
				}
			}
		}
	}
}
