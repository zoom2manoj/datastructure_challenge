package com.array.rotation;

public class LowerElementSortedAndRotatedArray {
	
	/*
	
	Input: {5, 6, 1, 2, 3, 4}
Output: 1

Input: {1, 2, 3, 4}
Output: 1

Input: {2, 1}
Output: 1

Binary search concept
	
	
	*/
	
	
	public static void main(String[] arg){
		int[] array = {5, 6, 1, 2, 3, 4};
		
		int value = find(array, 0, array.length-1);
		System.out.println(value);
	}

	private static int find(int[] array, int low, int high) {
		
		if (high<low) {
			return array[0];
		}
		
		if (high==low) {
			return array[low];
		}
		
		int mid = low+(high-low)/2;
		
		if (high>mid && array[mid]>array[mid+1]) {
			return array[mid+1];
		}
		
		if (high>mid && array[mid]<array[mid-1]) {
			return array[mid];
		}
		
		if (high>mid && array[mid]<array[mid+1]) {
			return find(array, low, mid-1);
					
		}else{
			return find(array, mid+1, high);
		}
		
	}
	
	
	
	
	
	

}
