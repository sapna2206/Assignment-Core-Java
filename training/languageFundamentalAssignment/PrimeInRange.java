package com.psl.training.languageFundamentalAssignment;

import java.util.Scanner;

public class PrimeInRange {
	static void printPrime(int maxVal)
	{
		int i,j,flag;
		for (i = 2; i <= maxVal; i++) {
            flag = 1;
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
            	System.out.print(i+" ");
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PrimeInRange obj = new PrimeInRange();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the max value for calculating prime number between 2 to max value:");
		int maxVal = sc.nextInt();
		System.out.println("Prime numbers between 2 to max value is: ");
		PrimeInRange.printPrime(maxVal); 
		//obj.printPrime(maxVal);
		sc.close();
	}

}
