package com.sorting;

public class InsertionSorting {

	
	/*

	Insertion Sort	Ω(n)		 Θ(n^2)			O(n^2)		  O(1)

	*/
	
	public static void main(String[] arg){
		int[] arr = {10,34,2,56,7,67,88,42};
		insertiongSorting(arr);
	}

	private static void insertiongSorting(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 1; i < arr.length; i++) {
			
			for (int j = i; j >0; j--) {
				
				if (arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
