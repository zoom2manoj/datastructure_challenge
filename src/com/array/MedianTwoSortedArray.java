package com.array;

public class MedianTwoSortedArray {

	
	/*      
	 * 
	 
	There are 2 sorted arrays A and B of size n each. Write an algorithm to find the median of the array obtained after merging
	 the above 2 arrays(i.e. array of length 2n). The complexity should be O(log(n))	 
	 
	 Algo 
	 
	 1) Calculate the medians m1 and m2 of the input arrays ar1[] 
   and ar2[] respectively.
2) If m1 and m2 both are equal then we are done.
     return m1 (or m2)
3) If m1 is greater than m2, then median is present in one 
   of the below two subarrays.
    a)  From first element of ar1 to m1 (ar1[0...|_n/2_|])
    b)  From m2 to last element of ar2  (ar2[|_n/2_|...n-1])
4) If m2 is greater than m1, then median is present in one    
   of the below two subarrays.
   a)  From m1 to last element of ar1  (ar1[|_n/2_|...n-1])
   b)  From first element of ar2 to m2 (ar2[0...|_n/2_|])
5) Repeat the above process until size of both the subarrays 
   becomes 2.
6) If size of the two arrays is 2 then use below formula to get 
  the median.
    Median = (max(ar1[0], ar2[0]) + min(ar1[1], ar2[1]))/2
    
    
    inputs 
       ar1[] = {1, 12, 15, 26, 38}
   ar2[] = {2, 13, 17, 30, 45}

	 *  
	 *  */
	
	
	public static void main(String[] arg){
		
		
		   int ar1[] = {1, 12, 15, 26, 38};
		   int ar2[] = {2, 13, 17, 30, 45};
		   
		/*   int temp[] = new int[ar1.length-2];
		   System.arraycopy(ar1, 0, temp, 0, ar1.length-2);
		   System.out.println(temp);*/
		   
		   
		   if(ar1.length==ar2.length){
		   System.out.println(findMedianOfArray(ar1, ar2, ar1.length));
		   }else {
			System.out.println("Arrays are not same lenght ");
		}
		
	}

	private static int findMedianOfArray(int[] ar1, int[] ar2, int n) {
		// TODO Auto-generated method stub
	
		if(n<=0){
			return 0;			
		}
		
		if (n==1) {
			return (ar1[0]+ar2[0])/2;
		}
		
		if (n==2) {
			return ((Math.max(ar1[0], ar2[0])+Math.min(ar1[1], ar2[1])))/2;
		}
		
		
		int m1 = median(ar1, n);
		int m2 = median(ar2, n);
		
		if(m1==m2)
			return m1;
		
		/// if m1<m2 then
		
		if(m1<m2){
			
			
			if(n%2==0){
				
				int tempAr1[] = new int[n/2+1];
				int tempAr2[] = new int[n/2+1];
				System.arraycopy(ar1, n/2-1, tempAr1, 0, n/2+1);
				System.arraycopy(ar2, 0, tempAr2, 0, n/2+1);
				
				
				return findMedianOfArray(tempAr1, tempAr2, n/2+1); 
			}else{
				
			int tempAr1[] = new int[n/2+1];
			int tempAr2[] = new int[n/2+1];
			System.arraycopy(ar1, n/2, tempAr1, 0, n/2+1);
			System.arraycopy(ar2, 0, tempAr2, 0, n/2+1);
			
			
			return findMedianOfArray(tempAr1, tempAr2, n/2+1);
			}
		}else if(m1>m2){
				if(n%2==0){
				
				int tempAr1[] = new int[n/2+1];
				int tempAr2[] = new int[n/2+1];
				System.arraycopy(ar1, 0, tempAr1, 0, n/2+1);
				System.arraycopy(ar2, n/2-1, tempAr2, 0, n/2+1);
				
				
				return findMedianOfArray(tempAr2, tempAr1, n/2+1); 
			}else{
				
			int tempAr1[] = new int[n/2+1];
			int tempAr2[] = new int[n/2+1];
			System.arraycopy(ar1, 0, tempAr1, 0, n/2+1);
			System.arraycopy(ar2, n/2, tempAr2, 0, n/2+1);
			
			
			return findMedianOfArray(tempAr1 , tempAr2, n/2+1);
			}
			
		}
		
		
		return 0;
		
	}

	private static int median(int[] ar, int n) {
		// TODO Auto-generated method stub
		if(n%2==0){
			return (ar[n/2]+ar[n/2-1])/2;
		}else{
			return ar[n/2];
		}		
		
	}
	
	
	
}
