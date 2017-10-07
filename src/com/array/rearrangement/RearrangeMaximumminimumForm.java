package com.array.rearrangement;

public class RearrangeMaximumminimumForm {
	
	public static void main(String[] arg){
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		maximumMinimumForm(arr);
		
		System.out.println("========");
		printArray(arr);
	}


	private static void maximumMinimumForm(int[] arr) {
		int[] temp = new int[arr.length];
		
		boolean flage = true;
		int start =0;
		int end =arr.length-1;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (flage) {
				temp[i] = arr[end--];
			}else{
				temp[i] = arr[start++];
			}
			
			flage = !flage;
			
		}
		
		System.out.println("\n=======");
		
		printArray(temp);
		
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
