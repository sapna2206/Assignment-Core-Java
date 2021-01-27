package com.psl.training.languageFundamentalAssignment;

import java.util.Scanner;

public class CalcProfit {
	static float calculateProfit(int numAttendees)
	{
		float theaterCost = (0.5f * numAttendees) + 20;
		float profit = (5 * numAttendees) - theaterCost;
		return profit;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of attendees for a show:");
		int numAttendees = sc.nextInt();
		System.out.println("Profit is: "+CalcProfit.calculateProfit(numAttendees));
		sc.close();
	}

}
