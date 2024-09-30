package com.java.programes;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 153;
		int temp = n;
		int ld, Amst = 0;
		 while(n>0)
		 {
			 ld = n%10;
			 Amst = Amst + ld*ld*ld;
			 n = n/10; 
		 }
		 if(temp == Amst)
		 {
			 System.out.println(Amst + " Given number is Amstrong number");
		 }
		 else
		 {
			 System.out.println(Amst + " Given number is not an Amstrong number");
		 }

	}

}
