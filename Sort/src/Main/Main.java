package Main;

public class Main {
	
	public static void main(String[] args) {
		int ary[] = new int[100];
		initary(ary);
		SelectSort.sort(ary);
		System.out.println("Select Sort : "+checkary(ary));;
		
		InsertSort.sort(ary);
		System.out.println("Insert Sort : "+checkary(ary));;
		
		BubbleSort.sort(ary);
		System.out.println("Bubble Sort : "+checkary(ary));;
	}

	
	public static void initary(int[] ary){
		for(int i=0;i<100;i++){
			ary[i] = (int)(Math.random()*100+1);
		}
	}
	public static boolean checkary(int[] ary){
		for(int i=1;i<100;i++){
			if(ary[i] < ary[i-1]){
				return false;
			}
		}
		return true;
	}
}
