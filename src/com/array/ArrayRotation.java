package com.array;

public class ArrayRotation {
	
	/*
	 * Let us take the same example arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2
       Rotate arr[] by one 2 times
       We get [2, 3, 4, 5, 6, 7, 1] after first rotation and [ 3, 4, 5, 6, 7, 1, 2] after second rotation.
*/
	
	public void leftRotated(int[] arr, int d, int n){
	
		for (int j = 0; j < d; j++) {
			leftRotatedByOne(arr, n);
		}
	}

	private void leftRotatedByOne(int arr[], int n) {
		int j, temp;
		temp = arr[0];
		for (j = 0; j < n-1; j++) {
			arr[j] = arr[j+1];
		}
		arr[j] = temp;
	}
	
	public void printArray(int arr[]){
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] arr){
		ArrayRotation aRoot = new ArrayRotation();
		int array[] = {1, 2, 3,4 ,5 ,6 ,7, 8, 9, 10};
		aRoot.leftRotated(array, 4, 10);
		aRoot.printArray(array);
	}
}
