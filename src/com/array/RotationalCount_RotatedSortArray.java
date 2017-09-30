package com.array;

public class RotationalCount_RotatedSortArray {

	
	/*
	
	Input : arr[] = {15, 18, 2, 3, 6, 12}
Output: 2
Explanation : Initial array must be {2, 3,
6, 12, 15. 18}. We get the given array after 
rotating the initial array twice.

Input : arr[] = {7, 9, 11, 12, 5}
Output: 4

Input: arr[] = {7, 9, 11, 12, 15};
Output: 0


Time Complexity : O(Log n)
Auxiliary Space : O(1) 
	
	*/
	
	public static void main(String[] arg){

		int arr[] = {15, 18, 2, 3, 6, 12};
		
		
		System.out.println(rorationCount(arr, 0, arr.length-1));
	}

	private static int rorationCount(int[] arr, int low, int high) {
		
		if(high<low) return 0;
		
		if(high==low) return low;
		
		int mid = low +(high-low)/2;
		
		if (high>mid && arr[mid]> arr[mid+1]) {
			return mid+1;
		}
		
		if(high>mid && arr[mid]<arr[mid-1]) return mid;
		
		if(arr[high]> arr[mid]) return rorationCount(arr, low, mid-1);
		else rorationCount(arr, mid+1, high);
		return 0;
	}
	
	
		
}
