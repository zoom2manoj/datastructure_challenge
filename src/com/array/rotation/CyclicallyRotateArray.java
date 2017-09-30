package com.array.rotation;

import java.util.Arrays;

public class CyclicallyRotateArray {

	
	
	
	/*
	
	Program to cyclically rotate an array by one
	
	Input:  arr[] = {1, 2, 3, 4, 5}
    Output: arr[] = {5, 1, 2, 3, 4}
    
    Time Complexity: O(n)
Auxiliary Space: O(1)
	*/
	
	static int[] array = {1, 2, 3, 4, 5, 6};
	
	public static void main(String[] arg){
		System.out.println(Arrays.toString(array));
		rotated();
		System.out.println(Arrays.toString(array));
	}
	
	public static void rotated(){
		int x =  array[array.length-1];
		
		for (int j = array.length-1; j > 0; j--) {
			array[j] = array[j-1];
			
		}
		array[0] = x;
	}

}
