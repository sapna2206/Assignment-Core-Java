package com.psl.training.oopDesign.abcShop;

public class HardwareProd extends Product {
	@Override
	public String toString() {
		return "HardwareProd [dimension=" + dimension + ", capacity=" + capacity + ", brand=" + brand + ", powerSupply="
				+ powerSupply + "]";
	}


	private double dimension;
	private double capacity;
	private String brand;
	private int powerSupply;
	
	public double getDimension() {
		return dimension;
	}


	public void setDimension(double dimension) {
		this.dimension = dimension;
	}


	public double getCapacity() {
		return capacity;
	}


	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getPowerSupply() {
		return powerSupply;
	}


	public void setPowerSupply(int powerSupply) {
		this.powerSupply = powerSupply;
	}
	

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Product id is: "+super.getProdID()+" Product name: "+super.getProdName()+" brand: "+brand+" dimensions: "+dimension+" Capacity: "+capacity);
	}



}

