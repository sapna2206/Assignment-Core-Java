package com.psl.training.oopDesign.abcShop;

public abstract class Product {
	private long prodID;
	private String prodName;
	public long getProdID() {
		return prodID;
	}
	public void setProdID(long prodID) {
		this.prodID = prodID;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public abstract void display();
}