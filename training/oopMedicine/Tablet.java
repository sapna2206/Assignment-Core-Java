package com.psl.training.oopMedicine;

public class Tablet extends Medicine {
	Tablet(String name, String add, String function)
	{
		this.name = name;
		this.add = add;
		this.function = function;
	}
	@Override
	void displayLabel()
	{
		String function = "Store in a cool dry place";
		System.out.println("Additional information: "+function);
	}

}
