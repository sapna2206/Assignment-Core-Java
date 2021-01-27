package com.psl.training.oopDesign.abcShop;

public class SoftwareProd extends Product {
	@Override
	public String toString() {
		return "SoftwareProd [os=" + os + ", memory=" + memory + ", licenseKey=" + licenseKey + "]";
	}

	private String os;
	private int memory;
	private long licenseKey;

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	

	public long getLicenseKey() {
		return licenseKey;
	}

	public void setLicenseKey(long licenseKey) {
		this.licenseKey = licenseKey;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Product id is: "+super.getProdID()+" Product name is: "+super.getProdName()+" having os: "+os+" license key: "+licenseKey+" with memory capacity: "+memory);
	}

	

}

