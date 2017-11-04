package com.array.rearrangement;


class ProductSubarray {
	
	
	/*
	
	Input: arr[] = {6, -3, -10, 0, 2}
Output:   180  // The subarray is {6, -3, -10}

Input: arr[] = {-1, -3, -10, 0, 60}
Output:   60  // The subarray is {60}

Input: arr[] = {-2, -3, 0, -2, -40}
Output:   80  // The subarray is {-2, -40}
	
	
	Time Complexity: O(n)
Auxiliary Space: O(1)


	
	*/

	// Utility functions to get minimum of two integers
	static int min (int x, int y) {return x < y? x : y; }

	// Utility functions to get maximum of two integers
	static int max (int x, int y) {return x > y? x : y; }

	/* Returns the product of max product subarray.
	Assumes that the given array always has a subarray
	with product more than 1 */
	static int maxSubarrayProduct(int arr[])
	{
		int n = arr.length;
		
		int maxEnd = 1;
		int minEnd = 1;
		int max_so_far =1;
		
		for (int i = 0; i < n; i++) {
		
			
			if (arr[i]>0) {
				maxEnd =  maxEnd*arr[i];
				minEnd = min(minEnd*arr[i], 1);
				
				
			}else if(arr[i] ==0){
				maxEnd = 1;
				minEnd = 1;
			}else{
				int temp = maxEnd;
				maxEnd = max(minEnd*arr[i], 1);
				minEnd = temp*arr[i];
			}
			
			
			
			if (max_so_far<maxEnd) {
				max_so_far = maxEnd;
			}
			
			
			
		}
		
		return max_so_far;
	}

	public static void main (String[] args) {

		int arr[] = {1, -2, -3, 0, 7, -8, -2};
		System.out.println("Maximum Sub array product is "+
							maxSubarrayProduct(arr));
	}
}