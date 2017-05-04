package com.algorithm;

import java.util.Scanner;

public class Anagram {
	
	
	public static void main(String[] arg){
		
		
		/*
		 * input
		 *  pear  
amleth
dormitory
tinsel
dirty room
hamlet
listen
silnet
... the output would be:

amleth,hamlet
dirty room,dormitory
listen,silnet,tinsel
pear*/
		
		Scanner scn = new Scanner(System.in);
		
		int size = scn.nextInt();
		String[] array = new String[size];		
		//scn.next();
		for (int j = 0; j < size; j++) {
			array[j]  = scn.nextLine();
		}
		
			
		
		
		
		
		System.out.println("");
		
		for (int i = 0; i < array.length; i++) {
			String value = array[i];
			String output =value;
			for (int j = 0; j < array.length; j++) {
				
				
				
				if(isAnagram(value.replaceAll(" " , ""), array[j].replaceAll(" ", ""))&&(i!=j)){
					value = value+", "+array[j];
				}
			}
			System.out.println(value);
		}
		
		
		//System.out.println(isAnagram(s1, s2));
				
	}

	private static boolean isAnagram(String s1, String s2) {
		// TODO Auto-generated method stub
		int charLength = 256;
		int[] count1 = new int[charLength];
		int[] count2 = new int[charLength];
		int i;
		
		
		if(s1.length()!=s2.length())
			return false;
		
		for(i=0; i<s1.length(); i++){
			count1[s1.charAt(i)]++;
			count2[s2.charAt(i)]++;
			
		}
		
	
		for (int j = 0; j < charLength; j++) {
			if(count1[j]!=count2[j]){
				return false;
			}
		}
		
		return true;
		
		
	}

}
