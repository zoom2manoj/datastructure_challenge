package com.array.rearrangement;

public class RearrangeNegativePositiveNumber {
	
	
	/*
	
	For example, if the input array is [-1, 2, -3, 4, 5, 6, -7, 8, 9], then the output should be [9, -7, 8, -3, 5, -1, 2, 4, 6]

	Quick Sorting
	*/
	
	public static void main(String[] arg){
		int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
		printArray(arr);
		System.out.println("");
        rearrangeArray(arr);
        printArray(arr);
	}

	private static void rearrangeArray(int[] arr) {
		// TODO Auto-generated method stub
		
		int m = -1;
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]<0) {
				m++;
				
				int temp = arr[m];
				arr[m] = arr[i];
				arr[i] = temp;
			}
			
			
		}
		
		
		int pos  = m+1;
		int neg =  0;
		
		while(pos<arr.length && neg<pos && arr[neg]<0){
		
			int temp = arr[neg];
			arr[neg] = arr[pos];
			arr[pos] = temp;
			neg += 2;
			pos++;
			
		}
		
		
		
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
