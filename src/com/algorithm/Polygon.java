package com.algorithm;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Polygon{
	
	static final int S =1;
	static final int R =2;
	static final int O =3;
	
	
	/*
	 * 
	Input : 
	
	36 30 36 30
15 15 15 15
46 96 90 100
86 86 86 86
100 200 100 200
-100 200 -100 200

	Sample Output: 
	2 2 2
	*/
	
	
	public static void main(String[] args){
		
		Scanner scn = new Scanner(System.in);
		
		int counter = scn.nextInt();
		List<int[]> list = new ArrayList<int[]>();
		for (int i = 0; i < counter; i++) {
			int[] array =  new int[4];
			
			array[0] = scn.nextInt();
			array[1] = scn.nextInt();
			array[2] = scn.nextInt();
			array[3] = scn.nextInt();
			list.add(array);
			
		}
		
		
	 countPolygone(list);
	}

	private static void countPolygone(List list) {
		// TODO Auto-generated method stub
		
		int square =0;
		int rectangle =0;
		int other =0;
		
		
		
		
		for (int i = 0; i < list.size(); i++) {
			int[] data = (int[]) list.get(i);
			
			int getData = checkPolygon(data[0], data[1], data[2], data[3]);
			if (getData==S) {
				square++;
			}else if(getData==R){
				rectangle++;
			}else{
				other++;
			}
			
			
		}
		System.out.println(square+" "+rectangle+" "+other);
	}

	private static int checkPolygon(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		if(0>=(Math.min(Math.min(i, j), Math.min(k, l)))){
			return O;
		}else if(i==j&&j==k&&k==l){
			return S;
		}else if(i==k&&j==l){
			return R;
		}else{
			return O;
		}
	}
	
}