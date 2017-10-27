package com.array.rearrangement;

public class MaximumLengthBitonicSubarray {

	
	/*
	Simple Examples
1) A[] = {12, 4, 78, 90, 45, 23}, the maximum length bitonic subarray is {4, 78, 90, 45, 23} which is of length 5.

2) A[] = {20, 4, 1, 2, 3, 4, 2, 10}, the maximum length bitonic subarray is {1, 2, 3, 4, 2} which is of length 5.
	
	Time Complexity: O(n)
Auxiliary Space: O(n)
	*/
	
	public static void main(String[] arg){
		int arr[] = {12, 4, 78, 90, 45, 23};
		
		int length = bitonicSubArrayLenght(arr, arr.length);
		  System.out.println("Length of max length Bitnoic Subarray is: "+length);
	}

	private static int bitonicSubArrayLenght(int[] arr, int n) {
		
		int[] inc  = new int[n];
		int[] dcs = new int[n];
		
		inc[0]  = 1;
		dcs[n-1] = 1;
		int max;		
		
		for (int i = 1; i <n; i++) {
			inc[i] = (arr[i]>=arr[i-1])?inc[i-1]+1:1;
		}		
		for (int i = n-2; i >=0; i--) {
			dcs[i] = (arr[i]>=arr[i+1])?dcs[i+1]+1:1;			
		}		
		
		max = inc[0]+dcs[0]-1;
		for (int i = 0; i < n; i++) {
			if (inc[i]+dcs[i]-1>max) {
				max =  inc[i]+dcs[i]-1;
			}
		}
		
		return max;
	}
}
