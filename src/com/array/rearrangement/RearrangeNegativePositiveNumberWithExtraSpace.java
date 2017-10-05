package com.array.rearrangement;

public class RearrangeNegativePositiveNumberWithExtraSpace {

	/*
	  
	Time complexity of above solution is O(n log n), O(Log n) space for recursive calls
	Input:  [12 11 -13 -5 6 -7 5 -3 -6]
	Output: [-13 -5 -7 -3 -6 12 11 6 5]
	
	Rearrange positive and negative numbers with constant extra space
	*/
	
	public static void main(String[] arg){
		 int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		 reverseArray(arr, 0, arr.length-1);
		 printArray(arr);
	}

	private static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void reverseArray(int[] arr, int l, int r) {
		
		if(l<r){
		int mid  =  l+(r-l)/2;
		
		reverseArray(arr, 0, mid);
		reverseArray(arr, mid+1, r);
		
		merge(arr, l, mid, r);
		}
	}

	private static void merge(int[] arr, int l, int mid, int r) {
		
		int i = l;
		int j = mid+1;
		
		
		while (i<=mid && arr[i]<0) {
			i++;
		}
		
		while (j<=r && arr[j]<0) {
			j++;
		}
		
		reverse(arr, i, mid);
		reverse(arr, mid+1, j-1);
		
		reverse(arr, i, j-1);
		
	}

	private static void reverse(int[] arr, int i, int mid) {
		if (i<mid) {
			swap(arr, i, mid);
			reverse(arr, ++i, --mid);
			
		}
	}

	private static void swap(int[] arr, int i, int mid) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[mid];
		arr[mid] = temp;
	}
}
