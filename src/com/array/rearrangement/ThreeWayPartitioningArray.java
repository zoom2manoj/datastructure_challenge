package com.array.rearrangement;

public class ThreeWayPartitioningArray {
	
	
	/*
	
	
	Input: arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32}  
        lowVal = 14, highVal = 20
Output: arr[] = {1, 5, 4, 2, 1, 3, 14, 20, 20, 98, 87, 32, 54}

Input: arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32}  
       lowVal = 20, highVal = 20       
Output: arr[] = {1, 14, 5, 4, 2, 1, 3, 20, 20, 98, 87, 32, 54} 
	
	*/
	
	
	public static void main(String[] arg){
	
	    int arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
	    threeWayPartitions(arr, 10, 20);
		
	    printArray(arr);
	}


	private static void threeWayPartitions(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		
		int start =0, end = arr.length-1;
		
		for (int x = 0; x < end; x++) {
			
			if (arr[x]<i) {
				int temp = arr[start];
				arr[start] = arr[x];
				arr[x] = temp;
				start++;
				
			}else if(arr[x]>j){
				int temp = arr[end];
				arr[end] = arr[x];
				arr[x] = temp;
				end--;
				x--;
			}
		}
	}
	
	private static void printArray(int[] arr) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
	}

}
