package com.java.programes;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 151;
		int temp= n;
		int Rev = 0, ld;
		
		while(n>0)
		{
		ld = n%10;
		Rev = Rev*10+ld;
		n = n/10;
		}
		if(temp == Rev)
		{
			System.out.println(Rev + "  Given number is Reverse number");
		}
		else
		{
			System.out.println(Rev + "  Given number is not a reverse number");
		}
		
		

	}

}
