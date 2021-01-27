package com.psl.training.exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderCheck {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File Fileobject = new File("C:\\Program Files (x86)\\eclipse\\JavaProg\\src\\com\\practice\\oop\\exceptionhandling\\contact\\Movies.txt");
		Scanner fileReader = new Scanner(Fileobject);
		while(fileReader.hasNext())
		{
			String line = fileReader.nextLine();
		    String[] splitText = line.split("-");
		    if (splitText.length < 2) {
		        try {
					throw new InvalidInputException("Check for number of fields provided");
				} catch (InvalidInputException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		    try {
		        Integer.parseInt(splitText[1]);
		    }
		    catch(Exception e) {
		    	System.out.println("Check for valid movie ids. Must be Integers "+ e);
				e.printStackTrace();
				System.out.println(e.getMessage());
		    }
		}
		fileReader.close();
	}

}
