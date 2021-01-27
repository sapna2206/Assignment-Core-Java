package com.psl.training.assignment1txt;

import java.util.Scanner;

public class TotalSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		int counts = 0;
		for(int i = 0; i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				counts++;
			}
		}
		System.out.println("Total number of spaces in a string is: "+counts);
		sc.close();
	}

}
