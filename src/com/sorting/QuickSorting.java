package com.sorting;

public class QuickSorting {
	
	/*
	Quicksort	 	Ω(n log(n))	 Θ(n log(n))	O(n^2)	      O(log(n))

	
	*/

	
	static int[] input = {24,2,45,20,56,75,2,56,99,53,12};

	public static void main(String[] arg){
		
		quickSorting(0, input.length-1);
		printArray(input);
	}

	private static void printArray(int[] input) {
		// TODO Auto-generated method stub
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]+" ");
		}
	}

	private static void quickSorting( int lower, int high) {
		
		int i = lower;
		int j = high;
		int pivot = input[lower-(high=lower)/2];
		
		while(i<=j){
			
			while (input[i]<pivot) {
				i++;
			}
			
			while (input[j]>pivot) {
				j--;
			}
			
			if(i<=j){
				
					int temp = input[i];
					input[i] = input[j];
					input[j] = temp;
					i++;
					j--;		
			}
			
			if (lower<j) {
				quickSorting( lower, j);
			}
			
			if (high>i) {
				quickSorting( i, high);
			}
			
		}
		
		
	}
}
