package com.array.rotation;

public class SearchElementFromSortedAndPivotArray {


	/*
	
	Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
         key = 3
Output : Found at index 8

Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
         key = 30
Output : Not found

Input : arr[] = {30, 40, 50, 10, 20}
        key = 10   
Output : Found at index 3

Tiem complexity : O(logn)
	
	
	*/
	
	
	static int[] array = {4, 5, 6, 7, 8, 9, 1, 2, 3};
	public static void main(String[] arg){
		
		
		int index = search(array, 0, array.length-1, 1);
		System.out.println(index);
	}
	
	private static int search(int[] array2, int l, int h, int key) {
		
		if (h<l) return -1;
		
		int mid = (h+l)/2;
		if (array2[mid] == key)return mid;
		
		if (array2[l]<= array2[mid]) {
			
			if (key>=array2[l]&&key<=array2[mid]) 
				return search(array2, l, mid-1, key);
			
			return search(array2, mid+1, h, key);
		}
		
		if (key>=array2[mid]&& key<=array2[h]) return search(array2, mid+1, h, key);
		
		return search(array2, l, mid-1, key);
		
		
	}

    
	
	
}
