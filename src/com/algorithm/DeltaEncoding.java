package com.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeltaEncoding {

	static List<Integer> list = new ArrayList();
	
	static String data=  "25626 25757 24367 24267 16 100 2 7277";

	
	public static void main(String[] arg){
		
		String[] ar = data.split(" ");
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(" "+ar[i]);
		}
		
		System.out.println("");
		deltaEncoding(ar);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(" "+list.get(i));
		}
		//System.out.println("done "+list);
		
	}


	private static void deltaEncoding(String[] ar) {
		// TODO Auto-generated method stub
		
		int prev = Integer.parseInt(ar[0]);
		list.add(prev);
		for (int i = 1; i < ar.length; i++) {
			int diff = Integer.parseInt(ar[i])-prev;
			
			if(Math.abs(diff)>127){
				list.add(-128);
					
			}
			list.add(diff);
			
		}
	}

	
	
}
