package Main;

public class ShellSort {
	static void sort(int[] ary){
		int k;
		for(int gap=(ary.length/2);gap>0;gap/=2){
			if(gap%2==0)gap++;
			for(int i=0;i<gap;i++){
				for(int j=i+gap;j<ary.length;j +=gap){
					//insertSort
					int key=ary[j];
					for(k=j-gap;k>=0 && ary[k]>key;k-=gap){
						ary[k+gap] = ary[k];
					}
					ary[k+gap] = key;
				}
			}
		}
	}
}
