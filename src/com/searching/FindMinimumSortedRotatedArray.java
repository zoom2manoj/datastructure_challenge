package com.searching;

public class FindMinimumSortedRotatedArray {
	
	
/*	Find the minimum element in a sorted and rotated array
 * Input: {5, 6, 1, 2, 3, 4}
	Output: 1

	Input: {1, 2, 3, 4}
	Output: 1

	Input: {2, 1}
	Output: 1
	*/
	
	public static void main(String[] arg){

		
		  int arr[] = {4, 5, 6, 7, 8, 9, 1, 2, 3};
	        int n = arr.length;
	        int i = search(arr, 0, n-1);
	        if (i != -1) 
	            System.out.println("Index: " + i);
	        else
	            System.out.println("Key not found");
	        
	}

	private static int search(int[] arr, int l, int h) {
		// TODO Auto-generated method stub
		
		
		if(h<l) {
			return arr[0];
		}
		
		int mid = l+(h-l)/2;

		if (mid<h&& arr[mid]>arr[mid+1]) {
			return arr[mid+1];
		}
		
		if (mid>l && arr[mid]<arr[mid-1]) {
			return arr[mid];
		}
		
		
		
		if (arr[mid]<arr[h]) {
			search(arr, l, mid-1);
		}
		return search(arr, mid+1, h );
	}

}
