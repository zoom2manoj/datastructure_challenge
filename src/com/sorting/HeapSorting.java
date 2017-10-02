package com.sorting;

public class HeapSorting {

	/*
	
	Heapsort		Ω(n log(n))	 Θ(n log(n))	O(n log(n))	  O(1)
	
	*/
	
	
	public static void main(String[] arg){
	      int[] array ={55,2,93,1,23,10,66,12,7,54,3};
	      sort(array);
		
		
	}
	
	static int[] a ;
	static int n;
	static int left;
	static int right;
	static int largest;
	
	private static void sort(int[] array) {
		// TODO Auto-generated method stub
		a = array;
		
		buildHeap(a);
		
		for (int i = n; i>=0; i--) {
			exchange(0, i);
			n = n-1;
			maxHeap(a, 0);
		}
		
		printArray(a);
	}

	private static void printArray(int[] a2) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a2.length; i++) {
			System.out.print(a2[i]+" ");
		}
	}

	private static void buildHeap(int[] a2) {
		n = a2.length-1;
		
		for (int i = n/2; i>=0; i--) {
			maxHeap(a, i);
		}
	}

	private static void maxHeap(int[] a2, int i) {
		left = 2*i;
		right = 2*i+1;
		
		if(left<=n && a2[left]>a2[i]){
			largest = left;
		}else {
			largest = i;
		}
		
		if (right<=n && a2[right]>a2[largest]) {
			largest = right;
		}
		
		if (largest!=i) {
			exchange(i, largest);
			maxHeap(a2, largest);
		}
	}

	private static void exchange(int i, int largest2) {
		int temp = a[i];
		a[i] = a[largest2];
		a[largest2] = temp;
	}
}
