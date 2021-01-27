package com.psl.training.languageFundamentalAssignment;

import java.util.*;

public class CalcTax {
	static double calTax(int gp)
	{
		//double dollar = 73.30;
		//double gpIndian = gp*dollar;
		int rate = 0;
		if(gp>0 && gp<=240)
		{
			rate = 0;
		}
		else if(gp>240 && gp<=480)
		{
			rate = 15;
		}
		else if(gp>480)
		{
			rate = 28;
		}
		double tax = (gp * rate)/100;
		return tax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Gross Pay in Dollar:");
		int gp = sc.nextInt();
		System.out.println("Tax owned: "+CalcTax.calTax(gp));
		sc.close();
	}

}

