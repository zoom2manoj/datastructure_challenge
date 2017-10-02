package com.sorting;

public class MergeSort {
	
	
	/*
	
	
	Mergesort		Ω(n log(n))	 Θ(n log(n))	O(n log(n))	  O(n)


	*/

	private int lenght;
	private int[] tempArray;
	private int[] array;

	public void sort(int[] array){
		
		this.lenght = array.length;
		this.array = array;
		this.tempArray = new int[this.lenght];
		
		
		mergSorting(0, this.lenght-1);
		
	}
	
	
	private void mergSorting(int lowerIndex, int higherIndex) {
		// TODO Auto-generated method stub
		if (lowerIndex<higherIndex) {
			int middle = lowerIndex+(higherIndex-lowerIndex)/2;
			
			
			
			mergSorting(lowerIndex, middle);
			mergSorting(middle+1, higherIndex);
			margeParts(lowerIndex, middle, higherIndex);
			
					
		}
	}


	private void margeParts(int lowerIndex, int middle, int higherIndex) {
		// TODO Auto-generated method stub
		
		for (int i = lowerIndex;  i<= higherIndex; i++) {
			tempArray[i] = array[i];
		}
		
		int i= lowerIndex;
		int j= middle+1;
		int k = lowerIndex;
		
		while (i<=middle&&j<=higherIndex) {
			if (tempArray[i]<=tempArray[j]) {
				array[k] = tempArray[i];
				i++;
			}else{
				array[k] = tempArray[j];
				j++;
			}
			k++;
		}
		
		while (i<=middle) {
			array[k] =  tempArray[i];
			k++;
			i++;			
		}
	}


	public static void main(String[] arg){
		
		   int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
		   MergeSort mms = new MergeSort();
	        mms.sort(inputArr);
	        for(int i:inputArr){
	            System.out.print(i);
	            System.out.print(" ");
	        }
		
	}
}
