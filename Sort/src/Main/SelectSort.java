package Main;

public class SelectSort {
	static void  sort(int[] ary){
		int least,buf;
		for(int i=0;i<ary.length;i++){
			least = i;
			for(int j=i;j<ary.length;j++){
				if(ary[least] > ary[j]){
					least = j;
				}
			}
			if(!(least == i)){
				buf =ary[least];
				ary[i] = ary[least];
				ary[least] = buf;
			}
		}
	}
}
