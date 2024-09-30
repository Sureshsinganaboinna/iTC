package com.java.programes;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,3,4,8,7,9,10};
		int temp = 0;
		int i = 0, j= a.length-1;
	      while(i<j)
	      {
	    
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
	    	  
	      }
		System.out.println(Arrays.toString(a));
		
		
		
		
		

	}

}
