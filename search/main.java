package com.smu.ex;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ary[] = new int[10000000];
		LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<Integer,Integer>();
		
		for(int i=0;i<1000;i+=1000000){
			hm.put(i, i);
		}
		
		for(int i=0;i<ary.length;ary[i] = i++);
		
		long time =  System.currentTimeMillis();
		System.out.println(search(ary,500000));
		long timeaf =  System.currentTimeMillis();
		System.out.println(timeaf-time);
		
		
		System.out.println(searchinedx(ary,hm,500000));
	}
	
	static int searchinedx(int[] ary,LinkedHashMap<Integer, Integer> hm,int num){
		int i=0;
		for(;num < hm.get(i);i+=1000000);
		if(num == hm.get(i)){
			return i;
		}
		if(i>ary.length) return -1;
		int j=i;
		i+=1000000;
		for(;j<(i)&& ary[j] != num;j++);
		return j;
	}
	static int search(int[] ary,int num){
		int low = 0;
		int high = ary.length;
		int middle = (low+high)/2;
		while(low<=high){
			if(ary[middle] > num){
				high = middle-1;
				middle = (low + high)/2;
			}else if(ary[middle] < num){
				low = middle+1;
				middle = (low+high)/2;
			}else{
				return middle;
			}
		}
		return -1;
		
		
		
	
	}
	
	

}
