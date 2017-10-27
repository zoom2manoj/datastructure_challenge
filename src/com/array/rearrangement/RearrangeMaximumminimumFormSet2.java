package com.array.rearrangement;

public class RearrangeMaximumminimumFormSet2 {

	
	/*
	 * Input  : arr[] = {1, 2, 3, 4, 5, 6, 7} 
Output : arr[] = {7, 1, 6, 2, 5, 3, 4}

Input  : arr[] = {1, 2, 3, 4, 5, 6} 
Output : arr[] = {6, 1, 5, 2, 4, 3}
	 */
	
	public static void main(String[] arg){
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		printArray(arr);
		reArrangeArray(arr, arr.length);
		System.out.println("\n\nfinal result\n");
		printArray(arr);
		
	}

	private static void reArrangeArray(int[] arr, int n) {
		int max_id = n-1;
		int min_id = 0;
		int max_elem = arr[max_id]+1;
		
		for (int i = 0; i < n; i++) {
			
			if (i%2==0) {
				arr[i] += (arr[max_id]%max_elem)*max_elem;
				max_id--;
				System.out.println("\neven\ni: "+i);
				printArray(arr);
			}else{
				arr[i] += (arr[min_id]%max_elem)*max_elem;
				min_id++;
				System.out.println("\nodd\ni: "+i);
				printArray(arr);
			}
		}
		
		for (int i = 0; i < n; i++) {
			arr[i] =  arr[i]/max_elem;
		}
		
	}

	private static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
	}
	
}
