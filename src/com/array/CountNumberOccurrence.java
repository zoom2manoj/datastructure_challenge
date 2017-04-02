package com.array;

public class CountNumberOccurrence {

	
	public static void main(String[] arg){
		CountNumberOccurrence obj = new CountNumberOccurrence();
		
		int[] array = {1, 1, 2, 2, 2, 2, 3, 6, 6, 6, 9};
		
		int value = obj.getCount(array, 2, array.length);
		System.out.println(value);
		
	}
	
	public int getCount(int[] array, int x, int n){
		int i;
		int j;
		
		i = first(array, 0, array.length-1, x, n);
		
		if(i==-1)
			return i;
		
		j = last(array, i, array.length-1, x, n);
		
		return j-i+1;
	
	}
	
	public int first(int[] array, int low, int high, int x, int n){
		
		
		if(high>=low){
			
			int mid = (high+low)/2;
			if(mid==0||x>array[mid-1]&&x==array[mid]){
				return mid;
			}else if(x>array[mid]){
				return first(array, mid+1, high, x, n);
			}else
				return first(array, low, mid-1, x, n);
		}
		return -1;
		
	}
	
	public int last(int[] array, int low, int high, int x, int n){
		if(high>=low){
			
			int mid  = (low+high)/2;
			if(mid==n-1|| x<array[mid+1]&&x==array[mid]){
				return mid;
			}else if(x<array[mid]){
				
				return last(array, low, mid-1, x, n);
			}else{
				return last(array, mid+1, high, x, n );
				
			}
			
		}
		return -1;
	}
	
	
}
