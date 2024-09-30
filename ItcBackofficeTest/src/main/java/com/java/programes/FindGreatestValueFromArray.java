package com.java.programes;

public class FindGreatestValueFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {2,5,8,9,77,88,99,100,555};
	    int max = 0;
	    for(int i=0; i<a.length; i++)
	    {
	    	if(max<a[i])
	    	{
	    		max = a[i];
	    	}
	    }
	    System.out.println(max);
	    

	}

}
