package com.array.rearrangement;

import java.util.Hashtable;

public class LargestSubArray {
	
	/*
	
	Input: arr[] = {1, 0, 1, 1, 1, 0, 0}
Output: 1 to 6 (Starting and Ending indexes of output subarray)

Input: arr[] = {1, 1, 1, 1}
Output: No such subarray

Input: arr[] = {0, 0, 1, 1, 0}
Output: 0 to 3 Or 1 to 4
	
	
	Time Complexity: O(n)
Auxiliary Space: O(n)

if two loops then check conding in second loop as maxsize<j-i+1; and startinindex =i;
	
	*/

	 public static void main(String[] arg){
		 int arr[] = {1, 0, 0, 1, 0, 1, 1};
	      subArray(arr, arr.length); 
	 }

	private static void subArray(int[] arr, int n) {
		int sum = 0;
		int maxsize =-1;
		int startindex = 0;
		int endindex =0;
	
		Hashtable<Integer, Integer> data = new Hashtable<Integer, Integer>();
		 for (int i = 0; i < n; i++) {
			arr[i] =  (arr[i]==0?-1:1);
		}
		 
		 for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			
			if (sum==0) {
				maxsize = i+1;
				endindex =i;
			}
			
			
			if (data.containsKey(sum)) {
				
				if (maxsize<i-data.get(sum+n)) {
					maxsize = i-data.get(sum+n);
					endindex = i;
				} 
			}else{
				data.put(sum+n, i);
			}
		}
		 
		 for (int i = 0; i < arr.length; i++) {
			arr[i] = (arr[i]==-1)?0:1;
		}
		 
		 startindex =  endindex-maxsize+1;
		 System.out.println(startindex+" to "+endindex);
		 
		 
	
	}
}
