package com.array;

public class MaximumSum_IndexMultiple_OnlyRotationArray {
	
	/*
	
	
	Input: arr[] = {1, 20, 2, 10}
	Output: 72
	We can 72 by rotating array twice.
	{2, 10, 1, 20}
	20*3 + 1*2 + 10*1 + 2*0 = 72

	Input: arr[] = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	Output: 330
	We can 330 by rotating array 9 times.
	{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	0*1 + 1*2 + 2*3 ... 9*10 = 330
	
	Time Complexity: O(n)
Auxiliary Space: O(1)
	
	*/
	
	public static void main(String[] arg){
		 int arr[] = new int[]{10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		 int sumValue = sum(arr);
		 System.out.println(sumValue);
	}

	private static int sum(int[] array) {
		// TODO Auto-generated method stub
		
		
		int arrSum = 0;
		int currVal = 0;
		
		for (int i = 0; i < array.length; i++) {
			arrSum = arrSum+array[i];
			currVal = currVal +i*array[i];
		}
		
		int maxVal = currVal;
		
		for (int i = 1; i < array.length; i++) {
		
			currVal= currVal+arrSum- array.length*array[array.length-i];
			if (maxVal<currVal) {
				maxVal =  currVal;
			}
		}
		
		
		return maxVal;
	}

}
