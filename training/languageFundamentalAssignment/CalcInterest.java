package com.psl.training.languageFundamentalAssignment;

import java.util.*;

public class CalcInterest {
	static double callInterest(int amt) {
		double rate = 0;
		if(amt>0 && amt<=1000)
		{
			rate = 0.04;
		}
		else if(amt>1000 && amt<=5000)
		{
			rate = 0.045;
		}
		else if(amt>5000)
		{
			rate = 0.05;
		}
		double simInterest = amt * rate;
		return simInterest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the deposit amount:");
		int amt = sc.nextInt();
		System.out.println("Interest for one year is: "+CalcInterest.callInterest(amt));
		sc.close();
	}

}
