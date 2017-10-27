package com.array.rearrangement;

public class Segregate_0sand1s_array {

	/*
	 * 
	 * Segregate 0s and 1s in an array
	 * 
	Input array   =  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0] 
	Output array =  [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]	
	*/
	
	
	
	public static void main(String[] arg){
		 int arr[] = new int[]{ 0, 1, 0, 1, 1, 1 };
	
		 segregateArray(arr);
		 printArray(arr);
	}

	private static void printArray(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
	}

	private static void segregateArray(int[] arr) {
		
		int left = 0;
		int right  = arr.length-1;
		
		while (left<right) {
			
			while (arr[left]==0&&left<right) {
				left++;
			}
			
			while (arr[right]==1&&left<right) {
				right--;
			}
			
			if (left<right) {
				arr[left]=0;
				arr[right]=1;
				
				left++;
				right--;
			}
			
			
			
		}
	}
}
