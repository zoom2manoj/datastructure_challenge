package com.array.rearrangement;

public class LongestBitonicSubsequence {

	/*
	Input arr[] = {1, 11, 2, 10, 4, 5, 2, 1};
Output: 6 (A Longest Bitonic Subsequence of length 6 is 1, 2, 10, 4, 2, 1)

Input arr[] = {12, 11, 40, 5, 3, 1}
Output: 5 (A Longest Bitonic Subsequence of length 5 is 12, 11, 5, 3, 1)

Input arr[] = {80, 60, 30, 40, 20, 10}
Output: 5 (A Longest Bitonic Subsequence of length 5 is 80, 60, 30, 20, 10)



	Time Complexity: O(n^2)
Auxiliary Space: O(n)
	*/
	
	public static void main(String[] arg){

		int arr[] = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
		longestBitonicSubsequence(arr);
		//printArray(arr);
		
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+", ");
		} 		
	}

	private static void longestBitonicSubsequence(int[] arr) {
		int n = arr.length;
		int[] lis = new int[n];
		int[] lds =  new int[n];
		
		
		for (int i = 0; i < n; i++) {
			lis[i] = 1;
		}
		for (int i = 0; i < n; i++) {
			lds[i] = 1;
		}
		
		
		System.out.println("start first");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i]>arr[j]&&lis[i]<lis[j]+1) {
					lis[i] = lis[j]+1;
					System.out.println("\ni: "+i+"\n");
					printArray(lis);
				}
			}
		}
		
		for (int i = n-2; i >= 0; i--) {
			for (int j = n-1; j > i; j--) {
				if (arr[i]>arr[j]&&lds[i]<lds[j]+1) {
					lds[i] = lds[j]+1;
				}
			}
		}
		
		int max =lis[0]+lds[0]-1;
		
		for (int i = 0; i < n; i++) {			
			if (lis[i]+lds[i]-1>max) {
				max = lis[i]+lds[i]-1;
			}			
		}
		
		System.out.println("\n\nLegth of array: "+max);
	}
}
