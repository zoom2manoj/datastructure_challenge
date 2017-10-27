package com.array.rearrangement;

public class SegregateEvenandOddnumbers {

	/*
	Segregate Even and Odd numbers
	
	Input  = {12, 34, 45, 9, 8, 90, 3}
Output = {12, 34, 8, 90, 45, 9, 3} 
	
	*/
	public static void main(String[] arg){
		

	    int arr[] = {12, 34, 45, 9, 8, 90, 3};
	    printArray(arr);
	    segregateEvenOdd(arr);
	    System.out.println("");
	    printArray(arr);
	}
	
	private static void segregateEvenOdd(int[] arr) {
			
		int left = 0;
		int right = arr.length-1;
		
		while (left<right) {
			
			while (arr[left]%2==0&&left<right) {
				left++;
			}
			
			while (arr[right]%2==1&&left<right) {
				right--;				
			}
			
			if (left<right) {
				int temp  = arr[left];
				arr[left] = arr[right];
				arr[right] =temp;
				left++;
				right--;
			}
			
		}
		
		
		
	}

	private static void printArray(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
	}

}
