package com.searching;

public class MissingNumber {
	
/*	Find the Missing Number
	Example:
		I/P    [1, 2, 4, ,6, 3, 7, 8]
		O/P    5
		
	1) XOR all the array elements, let the result of XOR be X1.
2) XOR all numbers from 1 to n, let XOR be X2.
3) XOR of X1 and X2 gives the missing number.
	*/
	
	
	
	// Function to find missing number
    static int getMissingNo (int a[], int n)
    {
        int i;
        int x1 = a[0]; 
        int x2 = 1; 
         
        /* For xor of all the elements 
           in array */
        for (i = 1; i< n; i++)
            x1 = x1^a[i];
                 
        /* For xor of all the elements 
           from 1 to n+1 */        
        for ( i = 2; i <= n+1; i++)
            x2 = x2^i;         
         
        return (x1^x2);
    }
      
    /* program to test above function */
    public static void main(String args[])
    {
        int a[] = {1,2,4,5,6};
        int miss = getMissingNo(a,5);
        System.out.println(miss);
    }
}
