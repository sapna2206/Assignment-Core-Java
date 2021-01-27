package com.psl.training.oopMedicine;

import java.util.Random;

public class TestMedicine {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medicine[] arr = new Medicine[10];
		Random rand = new Random();
		for(int i = 0; i<arr.length; i++)
		{
			int rand_int = rand.nextInt(3)+1;
			if(rand_int == 1)
			{
				arr[i]=new Tablet("TabletShop","Nagpur","Store in a cool dry place");
			}
			else if(rand_int == 2)
			{
				arr[i]=new Syrup("SyrupShop","Nagpur","Shake the bottle well");
			}
			else if(rand_int == 3)
			{
				arr[i]=new Ointment("OintmentShop","Nagpur","For external use only");
			}
		}
		for(int i = 0; i<arr.length;i++)
		{
			System.out.println("------------------------------------------");
			arr[i].displayLabel();
		}
	}
}
