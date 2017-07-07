package com.searching;

public class SearchElementSortRotatedArray {
	
	
/*	Search an element in a sorted and rotated array
	
	Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
key = 3
Output : Found at index 8

Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
key = 30
Output : Not found

Input : arr[] = {30, 40, 50, 10, 20}
key = 10   
Output : Found at index 3

Time Complexity O(logn). */
	
	
	
	public static void main(String[] arg){
		
		  int arr[] = {4, 5, 6, 7, 8, 9, 1, 2, 3};
	        int n = arr.length;
	        int key = 6;
	        int i = search(arr, 0, n-1, key);
	        if (i != -1) 
	            System.out.println("Index: " + i);
	        else
	            System.out.println("Key not found");
	}

	private static int search(int[] arr, int l, int h, int key) {
		// TODO Auto-generated method stub
		
		
		if (l>h) {
			return -1;
		}
		
		
		int mid = (l+h)/2;
		
		if (arr[mid]==key) {
			return mid;
		}
		
		if (arr[mid]>=arr[l]) {
			
			if (key<=arr[mid]&& key>=arr[l]) {
				return search(arr, l, mid-1, key);
				
			}else{
				return search(arr, mid+1, h, key);
			}
		}
		
		
		if(key>=arr[mid]&& key<=arr[h]){
			return search(arr, mid+1, h, key);
		}
		
		
		return search(arr, l, mid-1, key);
	}

}
