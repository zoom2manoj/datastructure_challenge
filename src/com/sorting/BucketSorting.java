package com.sorting;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;

public class BucketSorting {

	
	public static void main(String[] args) {
		double arr[] = {0.897, 0.565, 0.656, 0.1234, 0.665, 0.3434}; 
		BucketSorting obj = new BucketSorting();
		obj.bucketSorting(arr, arr.length);
	}

	private void bucketSorting(double[] arr, int length) {
		// TODO Auto-generated method stub
		Hashtable<Integer, ArrayList<Double>> b  = new Hashtable<>(length);
		
		for (int i = 0; i < arr.length; i++) {
			int temp = (int) (length*arr[i]);
			ArrayList<Double> tempArray = new ArrayList<>();
			
			b.put(temp, tempArray);
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			int temp = (int) (length*arr[i]);
			ArrayList<Double> tempArray = b.get(temp);
			tempArray.add(arr[i]);
			b.put(temp, tempArray);
			
		}
		
		System.out.println("push all elements in bucket");
	}
	
}
