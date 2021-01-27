package com.psl.training.oopDesign.abcShop;

public class ProdMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoftwareProd microsoftOffice = new SoftwareProd();
		microsoftOffice.setOs("Windows");
		microsoftOffice.setProdID(100);
		microsoftOffice.setProdName("Microsoft Office");
		microsoftOffice.setMemory(1000);
		microsoftOffice.setLicenseKey(100100);
		SoftwareProd tally = new SoftwareProd();
		tally.setOs("Linux");
		tally.setProdID(101);
		tally.setProdName("Tally");
		tally.setMemory(64);
		tally.setLicenseKey(101101);
		HardwareProd computers = new HardwareProd();
		computers.setProdID(102);
		computers.setProdName("Computer");
		computers.setBrand("Dell");
		computers.setCapacity(500);
		computers.setDimension(1920*1080);
		computers.setPowerSupply(3);
		HardwareProd laptops = new HardwareProd();
		laptops.setProdID(103);
		laptops.setProdName("Laptop");
		laptops.setBrand("HP");
		laptops.setCapacity(500);
		laptops.setDimension(1440*900);
		laptops.setPowerSupply(3);
		HardwareProd carDeck = new HardwareProd();
		carDeck.setProdID(103);
		carDeck.setProdName("CarDeck");
		carDeck.setBrand("Hi-Tech");
		carDeck.setCapacity(30);
		carDeck.setDimension(50*180);
		carDeck.setPowerSupply(2);
		HardwareProd homeTheater = new HardwareProd();
		homeTheater.setProdID(103);
		homeTheater.setProdName("HomeTheater");
		homeTheater.setBrand("JBL");
		homeTheater.setCapacity(6000);
		homeTheater.setDimension(48.2*40.2*39);
		homeTheater.setPowerSupply(1000);
		Product[] prodArray = new Product[] {microsoftOffice, tally, computers, laptops, carDeck, homeTheater };
		/*for(int i =0;i<prodArray.length;i++)
		{
			if(prodArray[i] instanceOf SoftwareProd) {
				(SoftwarePro
			}
		}*/
		for(Product p: prodArray) {
			/*if(p.getClass().getName() == "Assignment2.com.training.shop.SoftwareProd") {
				p.display();
			}*/
			p.display();
		}
		
	}

}

