package com.array.rearrangement;

public class ReverseArray {
	
	
	/*
	
	Time Complexity: O(n)

Input  : arr[] = {1, 2, 3}
Output : arr[] = {3, 2, 1}

Input :  arr[] = {4, 5, 1, 2}
Output : arr[] = {2, 1, 5, 4}
	
	*/
	
	public static void main(String[] arg){
        int arr[] = {1, 2, 3, 4, 5, 6};

        printArray(arr);
        System.out.println("");
        reverseArray(arr);
        printArray(arr);
		
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			 
		}
	}

	private static void reverseArray(int[] arr) {
		
		int end = arr.length-1;
		int start = 0;
		
		
		for (int i = 0; i < arr.length; i++) {
			if (start<end) {
			
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
			}
		}
	}

}
