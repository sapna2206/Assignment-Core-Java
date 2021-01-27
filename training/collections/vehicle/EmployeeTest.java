package com.psl.training.collections.vehicle;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> vehicle = new ArrayList<>();
		vehicle.add("Audi");
		vehicle.add("Mercedes");
		vehicle.add("Maruti");
		Employee emp1 = new Employee(1, "Sapna", vehicle);
	    emp1.display();
	}

}
