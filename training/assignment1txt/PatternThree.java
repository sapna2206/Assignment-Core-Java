package com.psl.training.assignment1txt;

import java.util.Scanner;
//import java.lang.*;

public class PatternThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String word = sc.nextLine();
		String[] str = word.split("\\s+");
		for(i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		//System.out.println(Arrays.toString(str));
		sc.close();
	}

}
