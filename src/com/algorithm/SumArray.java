package com.algorithm;

import java.util.HashMap;
import java.util.Scanner;

public class SumArray {
	
	/*
	
	Identify whether there exists a pair of numbers in an array such that their sum is equal to N.

Input: The first line contains one integer N, which is the sum we are trying to find. The second line contains one integer M, which is the length of the array. This is followed by M lines each containing one element of the array.

Output: Output 1 if there exists a pair of numbers in the array such that their sum equals N. If such a pair does not exist, output 0.

Sample Input:

66
10
18
11
21
28
31
38
40
55
60
62
Sample Output:

1
	
	
	*/
	
	public static void main(String[] arg){
		
		Scanner scn = new Scanner(System.in);
		
		
		int sumValue = scn.nextInt();
		int N = scn.nextInt();
		
		int[] array = new int[N];
		
		
		
		
		for (int i = 0; i < N; i++) {
			array[i] = scn.nextInt();
		}
		
		
		printPairStatus(array, sumValue);
		
		
		
	}

	private static void printPairStatus(int[] array, int sumValue) {
		// TODO Auto-generated method stub
		boolean[] longArray = new boolean[10000];
		
		int sum;
		for (int i = 0; i < array.length; i++) {
			
			int temp = sumValue-array[i];
			
			if(temp>=0&& longArray[temp]){
				System.out.println("1");
			}
			
			
			
			
			longArray[array[i]] = true;
		}
	}

}
