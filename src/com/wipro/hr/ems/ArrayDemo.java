package com.wipro.hr.ems;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int[] nums = new int [3];
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i < nums.length ; i++)
		{
			System.out.println(" Please enter a number");
			nums[i]= sc.nextInt();
		}
		while (true)
		{
			System.out.println(" Please enter a number to search or -1 to quit ");
			int searchNum= sc.nextInt();
			
			if (searchNum == -1)
			{
				System.out.println("Existing application");
				break;
			}
			
			boolean found = false;
			for( int i=0 ; i < nums.length ; i++)
			{
				//System.out.println(nums[i]);
			
				if ( nums[i] == searchNum )
				{
					//System.out.println(searchNum + "found");
					found = true;
					break;
				}	
					
			if (found)
			{
				System.out.println(" searchNum "+ "found ");
			}
			else
			{
				System.out.println("sorry"+ searchNum+ "not found");
			}
		}
		sc.close();
	  }
	}
}