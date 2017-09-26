package com.array;

public class ArrayRotation {
	
	/*
	 * Let us take the same example arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2
       Rotate arr[] by one 2 times
       We get [2, 3, 4, 5, 6, 7, 1] after first rotation and [ 3, 4, 5, 6, 7, 1, 2] after second rotation.
*/
	
	public void leftRotated(int[] arr, int d, int n){
	
		int i, j, k, temp;
		for (i = 0; i < gcd(d, n); i++) {
			temp = arr[i];
			j = i;
			while (1!=0) {
				k =j+d;
				if (k>=n) {
					k = k-n;
				}
				
				if (k==i) {
					break;
				}
				arr[j] = arr[k];
				
				j=k;
			}
			arr[j] = temp;
		}	
	}	
	
	public void printArray(int arr[]){
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public int gcd(int a, int b){
		return (b==0)?a : gcd(b, a%b);		
	}

	public static void main(String[] arr){
		ArrayRotation aRoot = new ArrayRotation();
		int array[] = {1, 2, 3,4 ,5 ,6 ,7, 8, 9, 10};
		aRoot.leftRotated(array, 4, 10);
		aRoot.printArray(array);
	}
}
