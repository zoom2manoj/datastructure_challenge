package com.algorithm;

import java.util.HashMap;
import java.util.Scanner;

public class SumArray {
	
	
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
