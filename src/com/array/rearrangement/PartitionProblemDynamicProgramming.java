package com.array.rearrangement;

//A dynamic programming based Java program for partition problem
import java.io.*;

public class PartitionProblemDynamicProgramming {

	
	
	/*
	
	
	arr[] = {1, 5, 11, 5}
Output: true 
The array can be partitioned as {1, 5, 5} and {11}

arr[] = {1, 5, 3}
Output: false 
The array cannot be partitioned into equal sum sets.
	
	
	Time Complexity: O(sum*n)
Auxiliary Space: O(sum*n)
	*/
	
 // Returns true if arr[] can be partitioned in two subsets of
 // equal sum, otherwise false
 static boolean findPartition (int arr[], int n)
 {
	 int sum =0;
	 
	 for (int i = 0; i < n; i++) {
		sum+=arr[i];
	}
	 
	 boolean[][]  data = new boolean[sum/2+1][n+1];
	 
	 for (int i = 0; i <=n; i++) {
		data[0][i] = true;
	}
	 
	 for (int j = 1; j <=sum/2; j++) {
		data[j][0] = false;
	}
	 
	 
	 for (int i = 1; i <=sum/2; i++) {
		for (int j = i; j <= n; j++) {
			data[i][j] = data[i][j-1];
			
			if (i>= arr[j-1]) {
				data[i][j] = data[i][j]||data[i-arr[j-1]][j-1];
			}
		}
	}
	 
	 
	 return data[sum/2][n];
 }

 /*Driver function to check for above function*/
 public static void main (String[] args)
 {
     int arr[] = {3, 1, 1, 2, 2,1};
     int n = arr.length;
     if (findPartition(arr, n) == true)
         System.out.println("Can be divided into two subsets of equal sum");
     else
         System.out.println("Can not be divided into two subsets of equal sum");

 }
}