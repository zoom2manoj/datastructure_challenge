package com.array.rearrangement;

import java.util.Arrays;

public class SortedSbq4LinearTime {

	/*
	Find a sorted subsequence of size 3 in linear time
Input:  arr[] = {Input:   12 11 10 5  6  2  9  30}
Output: 5, 6, 9, 30

	Time Complexity: O(n)
Auxliary Space: O(n)
	*/
	public static void main(String[] arg){
		
		 //int arr[] = {12, 11, 10, 5, 6, 2, 30};
		int[] arr = {12,11,10, 5, 6, 2, 9,30};
		 sortSub3Linear(arr);
		
	}

	private static void sortSub3Linear(int[] arr) {
		int n = arr.length;
		int max = n-1;
		int min = 0;
		int second =-1;
		
		int[] smaller = new int[n];
		 int[] betweenSmallerAndCurrent = new int[n];
		smaller[0] = -1;
		betweenSmallerAndCurrent[0] = -1;
		
		for (int i = 0; i < n; i++) {
			if (arr[i]<=arr[min]) {
				min = i;
				smaller[i] = -1;
				betweenSmallerAndCurrent[i] = -1;
			}else{
				smaller[i] = min;
				
				if(second!=-1 && arr[second]<arr[i])
					betweenSmallerAndCurrent[i] = second;
				else
					betweenSmallerAndCurrent[i] = -1;
				
				if (second==-1||arr[i]<arr[second]) 
					second = i;
			}
		}
		
		
		int[] greater = new int[n];
		greater[n-1] = -1;
		
		for (int i = n-2; i >=0; i--) {
			if (arr[i]>=arr[max]) {
				max =i;
				greater[i] = -1;
			}else{
				greater[i] = max;
			}
		}

		   System.out.println(Arrays.toString(smaller));
		   System.out.println(Arrays.toString(betweenSmallerAndCurrent));
		   System.out.println(Arrays.toString(greater));

		
		
		
		
		 for (int i = 0; i < n; i++)
		   {
		       if (betweenSmallerAndCurrent[i] != -1 && smaller[betweenSmallerAndCurrent[i]] != -1 && greater[i] != -1)
		       {
		          System.out.printf("%d %d %d %d\n",
		                            arr[smaller[betweenSmallerAndCurrent[i]]],
		                            arr[betweenSmallerAndCurrent[i]],
		                            arr[i],
		                            arr[greater[i]]);
		          return;
		       }
		   }

		   // If we reach number, then there are no such 3 numbers
		   System.out.println("No such quarter found");
	}

	
}
