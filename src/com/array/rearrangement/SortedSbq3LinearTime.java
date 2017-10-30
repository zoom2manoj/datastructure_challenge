package com.array.rearrangement;

public class SortedSbq3LinearTime {

	/*
	Find a sorted subsequence of size 3 in linear time
Input:  arr[] = {12, 11, 10, 5, 6, 2, 30}
Output: 5, 6, 30

Input:  arr[] = {1, 2, 3, 4}
Output: 1, 2, 3 OR 1, 2, 4 OR 2, 3, 4

Input:  arr[] = {4, 3, 2, 1}
Output: No such triplet
	
	
	Time Complexity: O(n)
Auxliary Space: O(n)
	*/
	public static void main(String[] arg){
		
		 int arr[] = {12, 11, 10, 5, 6, 2, 30};
		 sortSub3Linear(arr);
		
	}

	private static void sortSub3Linear(int[] arr) {
		int n = arr.length;
		int max = n-1;
		int min = 0;
		
		int[] smaller = new int[n];
		smaller[0] = -1;
		
		for (int j = 0; j < n; j++) {
			if (arr[j]<=arr[min]) {
				min = j;
				smaller[j] = -1;
			}else{
				smaller[j] = min;
			}
		}
		
		printArray(smaller);
		
		int[] greater = new int[n];
		greater[n-1] = -1;
		
		for (int j = n-2; j >=0; j--) {
			if (arr[j]>=arr[max]) {
				max =j;
				greater[j] = -1;
			}else{
				greater[j] = max;
			}
		}
		
		printArray(greater);
		
		for (int j = 0; j < greater.length; j++) {
			if (smaller[j]!=-1&& greater[j]!=-1) {
				System.out.println(arr[smaller[j]]+", "+arr[j]+", "+arr[greater[j]]);
				return;
			}
		}
		
	}

	private static void printArray(int[] smaller) {
		System.out.println("\n\n");
		
		for (int i = 0; i < smaller.length; i++) {
			System.out.print(smaller[i]+", ");
		}
		
		System.out.println("\n\n");
	}
}
