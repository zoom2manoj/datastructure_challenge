package com.array.rotation;

public class FindElementQuick_MultipleRotationArray {
	
	
	/*
	
	
	Input : arr[] = {1, 3, 5, 7, 9}
        k1 = 1
        k2 = 3
        k3 = 4
        k4 = 6
Output : 3 5 7 9 1
         7 9 1 3 5
         9 1 3 5 7
         3 5 7 9 1

Input : arr[] = {1, 3, 5, 7, 9}
        k1 = 14 
Output : 9 1 3 5 7

O(n) time and O(1) extra space.
	
	*/
	
	public static void main(String[] arg){
		int arr[] = {1, 3, 5, 7, 9};
		int n = arr.length;
		
		int[] temp = new int[2*n];
		preprocess(arr, n, temp);
		
		
		int k = 2;
		
		leftRotation(arr, n, k, temp);
		
	}

	private static void leftRotation(int[] arr, int n, int k, int[] temp) {
		// TODO Auto-generated method stub
	
		
		int start  = k%n;
		
		for (int i = start; i < start+n; i++) {
			System.out.print(temp[i]+" ");
		}
		
		System.out.println("\n");
		
		
	}

	private static void preprocess(int[] arr, int n, int[] temp) {
	
		for (int i = 0; i < arr.length; i++) {
			temp[i] = temp[i+n] = arr[i];
		}
		
	}

}
