package com.psl.training.oopDesign.Department;;

public class Faculty extends Person implements Salary, Temporary{
	public double getPaymentAmount()
	{
		double basicSal = 15000.00;
		return basicSal;
	}

	@Override
	public boolean tempFaculty() {
		// TODO Auto-generated method stub
		return false;
	}
	
}