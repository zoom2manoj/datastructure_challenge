package com.sorting;

public class SelectionSorting {
	
	
	/*
	Selection Sort	Ω(n^2)		 Θ(n^2)			O(n^2)		  O(1)

	
	*/
	
	public static void main(String[] arg){
		  int[] arr1 = {10,34,2,56,7,67,88,42};

		  selectionSorting(arr1);
		  
	}

	private static void selectionSorting(int[] arr1) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < arr1.length-1; i++) {
		
			int index = i;
			for (int j = i+1; j < arr1.length; j++) {
				
				if (arr1[index]>arr1[j]) {
					index = j;
				}
			}
			int element = arr1[index];
			
			arr1[index] = arr1[i];
			arr1[i] = element ;
		}
		printArray(arr1);
	}

	private static void printArray(int[] arr1) {
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
	}

}
