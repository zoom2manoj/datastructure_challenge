package com.array.rearrangement;

public class ReverseArray {
	
	
	public static void main(String[] arg){
        int arr[] = {1, 2, 3, 4, 5, 6};

        printArray(arr);
        System.out.println("");
        reverseArray(arr);
        printArray(arr);
		
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			 
		}
	}

	private static void reverseArray(int[] arr) {
		
		int end = arr.length-1;
		int start = 0;
		
		
		for (int i = 0; i < arr.length; i++) {
			if (start<end) {
			
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
			}
		}
	}

}
