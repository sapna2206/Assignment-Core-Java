package com.psl.training.stringAssignment;

import java.util.Scanner;

public class TotalCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		int count = 0;
		for(int i = 0; i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("Total number of characters in a string is: "+count);
		sc.close();
	}

}
