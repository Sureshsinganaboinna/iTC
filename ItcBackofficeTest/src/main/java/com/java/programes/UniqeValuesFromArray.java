package com.java.programes;

public class UniqeValuesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,2,2,6,5,4,4,7,7,8,8,8};
		int n = 12;
		for(int i=0; i<n; i++)
		{
			int count = 0;
			for(int j=0; j<n; j++)
			{
				if(arr[j]==arr[i])
				{
					count++;
				}
			}
				if(count==1)
				{
					System.out.println(arr[i]);
				}
			
		}

	}

}
