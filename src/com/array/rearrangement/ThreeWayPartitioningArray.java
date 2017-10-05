package com.array.rearrangement;

public class ThreeWayPartitioningArray {
	
	
	
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
