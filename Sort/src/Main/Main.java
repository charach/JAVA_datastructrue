package Main;

public class Main {
	
	public static void main(String[] args) {
		int ary[] = new int[10000];
		
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
		QuickSort.sort(ary, 0, ary.length-1);
		System.out.println("Quick Sort : "+checkary(ary));
		
		initary(ary);
		RadixSort.sort(ary);
		System.out.println("RadixSort : "+checkary(ary));
		
		initary(ary);
		BucketSort.sort(ary);
		System.out.println("BucketSort : "+checkary(ary));
		
	}

	
	public static void initary(int[] ary){
		for(int i=0;i<ary.length;i++){
			ary[i] = (int)(Math.random()*100);
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
