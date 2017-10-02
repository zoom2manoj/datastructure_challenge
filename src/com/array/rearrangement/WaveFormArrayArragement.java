package com.array.rearrangement;

public class WaveFormArrayArragement {
	
	/*
	
	
	sorted in wave form if arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= É..
	 Input:  arr[] = {10, 5, 6, 3, 2, 20, 100, 80}
 Output: arr[] = {10, 5, 6, 2, 20, 3, 100, 80} OR
                 {20, 5, 10, 2, 80, 6, 100, 3} OR
                 any other array that is in wave form

 Input:  arr[] = {20, 10, 8, 6, 4, 2}
 Output: arr[] = {20, 8, 10, 4, 6, 2} OR
                 {10, 8, 20, 2, 6, 4} OR
                 any other array that is in wave form

 Input:  arr[] = {2, 4, 6, 8, 10, 20}
 Output: arr[] = {4, 2, 8, 6, 20, 10} OR
                 any other array that is in wave form

 Input:  arr[] = {3, 6, 5, 10, 7, 20}
 Output: arr[] = {6, 3, 10, 5, 20, 7} OR
                 any other array that is in wave form
	
	*/
	
	public static void main(String[] arg){
		
		 int arr[] =  {10, 5, 6, 3, 2, 20, 100, 80};
		 
		 arrangeArray(arr);
		
	}

	private static void arrangeArray(int[] arr) {
		
		for (int i = 0; i < arr.length-1; i+=2) {
			
			if (i>0 && arr[i-1] > arr[i] )
                swap(arr, i-1, i);
 
            // If current even element is smaller
            // than next
            if (i<arr.length-1 && arr[i] < arr[i+1] )
                swap(arr, i, i + 1);
			
		}
		
		printArray(arr);
	}

	private static void swap(int[] arr, int a, int b) {
		// TODO Auto-generated method stub
		  int temp = arr[a];
	        arr[a] = arr[b];
	        arr[b] = temp;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
