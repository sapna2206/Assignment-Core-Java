package com.psl.training.languageFundamentalAssignment;

import java.util.Scanner;

public class CalcPayBack {
	static double calPayBack(int chargedAmount)
	{
		double payBack = 0;
		if(chargedAmount<500)
		{
			payBack = (0.25 * chargedAmount)/100; 
		}
		else if(chargedAmount>500 && chargedAmount<=1500)
		{
			payBack = (((chargedAmount-500)* 0.50)/100) + 1.25;
		}
		else if(chargedAmount>1500 && chargedAmount<=2500)
		{
			payBack = (((chargedAmount-1500)* 0.75)/100) + 6.25;
		}
		else if(chargedAmount>2500)
		{
			payBack = ((chargedAmount-2500)/100) + 13.75;
		}
		return payBack;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the charged amount:");
		int chargedAmount = sc.nextInt();
		System.out.println("Pay back is: "+CalcPayBack.calPayBack(chargedAmount));
		sc.close();
	}

}

