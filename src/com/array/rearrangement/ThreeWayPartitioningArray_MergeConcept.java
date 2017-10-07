package com.array.rearrangement;

import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;

public class ThreeWayPartitioningArray_MergeConcept {
	
	
	/*
	 

Input: arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32}  
        lowVal = 14, highVal = 20
Output: arr[] = {1, 5, 4, 2, 1, 3, 14, 20, 20, 98, 87, 32, 54}

Input: arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32}  
       lowVal = 20, highVal = 20       
Output: arr[] = {1, 14, 5, 4, 2, 1, 3, 20, 20, 98, 87, 32, 54} 

	 */
	
	
	public static void main(String[] arg){
	
	    int arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
	    threeWayPartitions(arr, 10, 20);
		
	    printArray(arr);
	}

	
	static int lenght =0;
	static int[] tempArray;
	static int[] array;

	private static void threeWayPartitions(int[] arr, int lowerValue, int highValuee) {
		
		lenght = arr.length;
		tempArray = new int[lenght];
		array = arr;
		highValue = highValuee;
		lowValue = lowerValue;
		mergeSorting(0, lenght-1);
	}
	
	private static void mergeSorting(int lowerIndex, int higherIndex) {
		
		if (lowerIndex < higherIndex) {
			
			int mid = lowerIndex + (higherIndex - lowerIndex)/2;
			
			mergeSorting(lowerIndex, mid);
			mergeSorting(mid+1, higherIndex);

			mergeParts(lowerIndex, mid, higherIndex);
			
		}
		
	}

	static int countFirstValueIndex=0;
	static int countSecondValueIndex=0;
	static int highValue ;
	static int lowValue;
	
	private static void mergeParts(int lowerIndex, int middle, int higherIndex) {
		// TODO Auto-generated method stub
		
		for (int i = lowerIndex; i < higherIndex; i++) {
			int value = array[i];
			if(value<lowValue){
				// replace lower value 
				
			}else if(lowValue<value && value<highValue){
				// replace mid items
				
			}else if(value>highValue){
				// replace higher value
				
			}else if(value== lowValue){
				// place same lower value
				
			}else if( value== highValue){
				// place same high value
				
			}
				
		}
		
		
	}

	private static void printArray(int[] arr) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
	}

}
