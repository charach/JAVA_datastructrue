package Main;

public class Main {
	
	public static void main(String[] args) {
		int ary[] = new int[10];
		
		initary(ary);
		SelectSort.sort(ary);
		System.out.println("Select Sort : "+checkary(ary));
		
		initary(ary);
		InsertSort.sort(ary);
		System.out.println("Insert Sort : "+checkary(ary));
		
		
		initary(ary);
		BubbleSort.sort(ary);
		System.out.println("Bubble Sort : "+checkary(ary));
		
		initary(ary);
		
		ShellSort.sort(ary);
		System.out.println("Shell Sort : "+checkary(ary));;
		
		initary(ary);
		new MergeSort(ary);
		System.out.println("Merge Sort : "+checkary(ary));
		
		
		initary(ary);
		
	}

	
	public static void initary(int[] ary){
		for(int i=0;i<ary.length;i++){
			ary[i] = (int)(Math.random()*100+1);
		}
	}
	public static boolean checkary(int[] ary){
		for(int i=1;i<ary.length;i++){
			if(ary[i] < ary[i-1]){
				return false;
			}
		}
		return true;
	}
}
