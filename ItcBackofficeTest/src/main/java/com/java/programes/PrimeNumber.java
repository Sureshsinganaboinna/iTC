package com.java.programes;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int n = 7;
         // boolean flag = true;
          int count = 0;
          
          for(int i=1; i<=n; i++)
          {
        	  if(n%i==0)
        	  {
        		  count++;
        	  }
        	  
          }
          if(count == 2)
          {
        	  System.out.println(n +" is a prime number"); 
          }
          else
          {
        	  System.out.println(n +" is not a prime number"); 
          }
        /*  for(int i=2; i<n; i++)
          {
        	  if(n%i ==0 )
        	  {
        		flag = false;
        		break;
        	  } 
          }
          if(flag)
          {
        	  System.out.println(n +" is a prime number"); 
          }
          else
          {
        	  System.out.println(n +" is not a prime number"); 
          }*/
        
	}

}
