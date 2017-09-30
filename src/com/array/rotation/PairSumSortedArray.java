package com.array.rotation;

public class PairSumSortedArray {
	
	
	/*
		Time Complexity: O(NlogN)
		Space Complexity: O(1)


Input: arr[] = {11, 15, 6, 8, 9, 10}, x = 16
Output: true
There is a pair (6, 10) with sum 16

Input: arr[] = {11, 15, 26, 38, 9, 10}, x = 35
Output: true
There is a pair (26, 9) with sum 35

Input: arr[] = {11, 15, 26, 38, 9, 10}, x = 45
Output: false
There is no pair with sum 45.

	*/
	public static void main(String[] arg){
	
		int[] array = {-30, -8, -4, -1, 5, 7, 12, 16};
		int sum = 17;
		findPair(array, sum);
		
		
		
	}

	private static void findPair(int[] array, int sum) {
			
		int p1 =0;
		int p2 = array.length-1;
		for (int i = 0; i <= p2; i++) {
			if(array[p1]+array[p2]<sum){
				p1++;
			}else if(array[p1]+array[p2]>sum){
				p2--;
			}else{
				System.out.println("pair is ("+array[p1]+", "+array[p2]+")");
				break;
			}
		}
	}
	
	

}
