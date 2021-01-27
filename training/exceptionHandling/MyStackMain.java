package com.psl.training.exceptionHandling;

public class MyStackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		Contact c1 = new Contact();
		c1.setFirst_name("Sapna");
		c1.setEmail("sapna@gmail.com");
		Contact c2 = new Contact();
		c2.setFirst_name("Shalini");
		c2.setEmail("shalini@gmail.com");
		Contact c3 = new Contact();
		c3.setFirst_name("Setu");
		MyStack ms = new MyStack(10);
		try {
			ms.push(c1);
			ms.push(c2);
			ms.pop();
			ms.push(c3);
			//ms.pop();
			//ms.pop();
			//ms.pop();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		ms.printStack();
		
	}

}
