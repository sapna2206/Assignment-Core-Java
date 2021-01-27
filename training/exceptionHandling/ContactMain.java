package com.psl.training.exceptionHandling;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ContactMain {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		String first_name = sc.nextLine();
		System.out.println("Enter last name");
		String last_name = sc.nextLine();
		System.out.println("Enter Date of birth");
		String dobstr = sc.nextLine();
		Date dob = new SimpleDateFormat("dd/MM/yyyy").parse(dobstr);
		System.out.println("Enter email address");
		String email = sc.nextLine();
		System.out.println("Enter mobile no");
		String mobile_no = sc.nextLine();
		//Contact c = new Contact(first_name,last_name,mobile_no,email);
		Contact c = new Contact();
		try {
			c.validate(email,first_name,last_name,mobile_no,dob);
		}
		catch(InvalidInputException e) {
			System.out.println(" Something wrong happened "+ e);
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch(InvalidEmailException e) {
			System.out.println(" Something wrong happened "+ e);
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch(InvalidMobNoException e) {
			System.out.println(" Something wrong happened "+ e);
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		sc.close();
	}

}

