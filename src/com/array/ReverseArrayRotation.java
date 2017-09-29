package com.array;

public class ReverseArrayRotation {

	/*
	 input : {1,2,3,4,5,6,7,8,9,10}
	 
	 
     output : {3,4,5,6,7,8,9,10,1,2}
	
	*/
	public static void main(String[] arg){
			ReverseArrayRotation rar = new ReverseArrayRotation();
			int[] arr = {1,2,3,4,5,6,7,8,9,10};
			rar.rotatedArray(arr, 2, 10);
			rar.printArray(arr);
	}	
	public void rotatedArray(int[] arr, int d, int n){		
		reverse(arr, 0, d-1);
		reverse(arr, d, n-1);
		reverse(arr, 0, n-1);
	}
	private void reverse(int[] arr, int start, int end) {	
		int temp;
		while (start<end) {			
			temp = arr[start];
			arr[start] =  arr[end];
			arr[end] = temp;
			start++;
			end--;			
		}		
	}	
	public void printArray(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}	
}
