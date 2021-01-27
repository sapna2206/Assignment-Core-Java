package com.psl.training.collections.vehicle;

import java.util.*;

public class Employee {
	private int empId;
	private String empName;
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public Employee(int empId, String empName, List<String> vehicle) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.vehicle = vehicle;
	}

	public List<String> getVehicle() {
		return vehicle;
	}

	public void setVehicle(List<String> vehicle) {
		this.vehicle = vehicle;
	}

	private List<String> vehicle = new ArrayList<>();
	
	public void display()
	{
		System.out.println("id: "+empId+ " name: "+empName);
		for(String l:vehicle)
		{
			System.out.println("Vehicle list: "+l);
		}
	}

}

