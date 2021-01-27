package com.psl.training.languageFundamentalAssignment;

import java.util.Scanner;

public class PrimeNum {
	static boolean isPrimeNumber(int num)
	{
		boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      return true;
	    else
	      return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		System.out.println("Entered number '"+num+"' is prime: "+PrimeNum.isPrimeNumber(num));
		sc.close();
	}

}
