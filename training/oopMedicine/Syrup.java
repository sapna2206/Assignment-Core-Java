package com.psl.training.oopMedicine;

public class Syrup extends Medicine {
	Syrup(String name, String add, String function)
	{
		this.name = name;
		this.add = add;
		this.function = function;
	}
	@Override
	void displayLabel()
	{
		String function = "Shake the bottle well";
		System.out.println("Additional information: "+function);
	}
}
