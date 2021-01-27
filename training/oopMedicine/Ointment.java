package com.psl.training.oopMedicine;

public class Ointment extends Medicine {
	Ointment(String name, String add, String function)
	{
		this.name = name;
		this.add = add;
		this.function = function;
	}
	@Override
	void displayLabel()
	{
		String function = "For external use only";
		System.out.println("Additional information: "+function);
	}
}
