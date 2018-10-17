package com.sorting;

public class BubbleSorting {

	/*
	
Bubble Sort		Ω(n)		 Θ(n^2)			O(n^2)		  O(1)
	
	*/
	
	public static void main(String[] arg){
	
		int[] input = {4, 2, 9, 6, 23, 12, 34, 0, 1};
        bubbleSorting(input);
        
	}

	private static void bubbleSorting(int[] input) {
		// TODO Auto-generated method stub

		for (int i = 0; i < input.length-1; i++) {
			for (int j = 0; j < input.length-i-1; j++) {
						
				if (input[j]>input[j+1]) {
					swapElement(j, j+1, input);
				}
			}
		
		
		}
		printArray(input);
	}

	private static void printArray(int[] input) {
		// TODO Auto-generated method stub
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]+" ");
		}
	}

	private static void swapElement(int j, int i, int[] input) {
		// TODO Auto-generated method stub
		int element = input[j];
		input[j] = input[i];
		input[i] = element;
	}
	
}
