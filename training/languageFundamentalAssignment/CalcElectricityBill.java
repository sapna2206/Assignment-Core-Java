package com.psl.training.languageFundamentalAssignment;


import java.util.Scanner;

public class CalcElectricityBill {
	static double calElectricityBill(int conUnit,boolean domestic,boolean commercial)
	{
		double bill = 0;
		if(domestic)
		{
			if(conUnit>0 && conUnit<=100)
			{
				double billIn = 4 * conUnit;
				if(billIn>250)
				{
					bill = billIn;
				}
				else
					bill = 250;
			}
			else if(conUnit>100 && conUnit<=300)
			{
				bill = 4.50 * conUnit;
			}
			else if(conUnit>300 && conUnit<=500)
			{
				bill = 4.75 * conUnit;
			}
			else if(conUnit>500)
			{
				bill = 5 * conUnit;
			}
		}
		if(commercial)
		{
			if(conUnit>0 && conUnit<=100)
			{
				double billIn = 4.25 * conUnit;
				if(billIn>350)
				{
					bill = billIn;
				}
				else
					bill = 350;
			}
			else if(conUnit>100 && conUnit<=300)
			{
				bill = 4.75 * conUnit;
			}
			else if(conUnit>300 && conUnit<=500)
			{
				bill = 5 * conUnit;
			}
			else if(conUnit>500)
			{
				bill = 5.25 * conUnit;
			}
		}
		return bill;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean domestic = false, commercial = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Connection is Domestic: (yes/no) ");
		String dome = sc.next();
		if(dome.equals("yes"))
		{
			domestic = true;
		}
		else
		{
			System.out.println("Connection is Commercial: (yes/no) ");
			String comm = sc.next();
			if(comm.equals("yes"))
			{
				commercial = true;
			}
		}	
		System.out.println("Enter the number of consumed units:");
		int conUnit = sc.nextInt();
		System.out.println("Electricity Bill is: "+CalcElectricityBill.calElectricityBill(conUnit, domestic, commercial));
		sc.close();
	}

}

