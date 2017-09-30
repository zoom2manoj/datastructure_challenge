package com.array.rotation;

public class MaximumSum_IndexMultiple_OnlyAllRotationArray {

	/*
	
	Input : arr[] = {8, 3, 1, 2}
Output : 29
Explanation : Let us see all rotations
{8, 3, 1, 2} = 8*0 + 3*1 + 1*2 + 2*3 = 11
{3, 1, 2, 8} = 3*0 + 1*1 + 2*2 + 8*3 = 29
{1, 2, 8, 3} = 1*0 + 2*1 + 8*2 + 3*3 = 27
{2, 8, 3, 1} = 2*0 + 8*1 + 3*2 + 1*1 = 17

Input : arr[] = {3, 2, 1}
Output : 8

Time Complexity : O(n)
Auxiliary Space : O(1)	
	*/
	
	
	
	public static void main(String[] arg){
		int arr[] = {8, 3, 1, 2};
		
		System.out.println(maxSum(arr, arr.length));
	}

	private static int maxSum(int[] arr, int length) {
		// TODO Auto-generated method stub
		
		int cur_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			cur_sum = cur_sum+arr[i];
		}
		
		int cur_val = 0;
		
		for (int i = 0; i < arr.length; i++) {
			cur_val = cur_val + arr[i]*i;
		}
		
		int res = cur_val;
		
		for (int i = 1; i < arr.length; i++) {
			
			int next_val = cur_val-(cur_sum- arr[i-1])+arr[i-1]*(arr.length-1);
			cur_val = next_val;
			res = Math.max(cur_val, res);
			
		}
		
		
		return res;
	}
}
