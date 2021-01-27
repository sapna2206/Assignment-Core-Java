package com.psl.training.orderManagement;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer(111, "Sapna");
		Customer c2 = new Customer(115, "Shruti");
		Customer c3 = new Customer(117, "Shalini");
		c1.print();
		c1.setPrintingAddress("Street A","Kolkata","BL", "700091");
		c1.setPhoneNumbers("9100012345", "9110012345","9120012345");
		c1.printPhoneNumbers();
		c1.printShippingAddress();
		c2.print();
		c2.setPrintingAddress("Street B","Kolkata","CK", "700091");
		c2.setPhoneNumbers("9300012345", "9310012345","9320012345");
		c2.printPhoneNumbers();
		c2.printShippingAddress();
		c3.print();
		c3.setPrintingAddress("Street C","Kolkata","BJ", "700091");
		c3.setPhoneNumbers("9700012345", "9710012345","9720012345");
		c3.printPhoneNumbers();
		c3.printShippingAddress();
	}

}
