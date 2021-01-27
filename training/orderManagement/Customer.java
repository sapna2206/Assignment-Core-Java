package com.psl.training.orderManagement;

public class Customer {
	private int id;
	private String name;
	private String homephone;
	private String workphone;
	private String cellphone;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String address;
	private String phone;
	
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void printShippingAddress () {
		System.out.println(this.address); 
	}

	public void setPrintingAddress (String street,String city,String state ,String zip) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.address = this.street+ " " + this.city + " " + this.state + " " +this.zip;
	}

	public void printPhoneNumbers() {
		System.out.println(this.phone); 
	}
	
	public void setPhoneNumbers(String cellphone, String workphone, String homephone) {
		this.cellphone = cellphone;
		this.workphone = workphone;
		this.homephone = homephone;
		this.phone = this.cellphone+ " "+this.workphone + " "+this.homephone;

	}
	
	public void print() {
		System.out.println(this.id+ " "+ this.name);
	}
	
	
}

