package com.psl.training.assignment1txt;

import java.util.Scanner;

public class TotalVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		int countv = 0;
		for(int i = 0; i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
			{
				countv++;
			}
		}
		System.out.println("Total number of vowels in a string is: "+countv);
		sc.close();
	}

}