package com.psl.training.assignment1txt;

import java.util.Scanner;

public class PatternTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String W = sc.next();
		for(i=0;i<W.length();i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(W.charAt(j));
			}
			System.out.println();
		}
		sc.close();
	}

}