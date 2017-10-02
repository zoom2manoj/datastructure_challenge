package com.exam.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chaining {
	
	
	/*
	 * The input is a list of names in random order. We need a function that chains elements of the list in such a way that the last character of an name is the same as the first one of the next name. For instance:

Input: ["Raymond", "Nora", "Daniel", "Louie", "Peter", "Esteban"]

Output: ["Peter", "Raymond", "Daniel", "Louie", "Esteban", "Nora"]

Hint: There should be only one solution, so the first element is unique.

	 * */
	
	 private static String[] chainNames(String[] array) {
	        for (String s : array) {
	            for (int i = 0; i < array.length; i++) {
	                if (!s.contains(array[i]) && s.toUpperCase().charAt(s.length() - 1) == array[i].charAt(0)) {
	                    s = s + " " + array[i];
	                    if (s.split(" ").length == array.length) {
	                        // We have used all the names. Return result.
	                        return s.split(" ");
	                    }
	 
	                    i = -1;
	                }
	            }
	        }
	 
	        return array;
	    }
	 
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	 
	        int counter = in.nextInt();
	        
	        String[] names = new String[counter];
	        for (int i = 0; i < counter; i++) {
			    String name = in.next();
	            names[i] = name;
	        }
	 	 
	        String[] ans = chainNames(names);
	        for (String name : ans) {
	            System.out.print(name + " ");
	        }
	 
	    }
}
