package com.psl.training.stringAssignment;
import java.util.*;

public class CountOccurence {
	static int check(String sentence, String word)
	{
		String a[] = sentence.split(" "); 
	    int count = 0; 
	    for (int i = 0; i < a.length; i++)  
	    {  
			if (word.equals(a[i])) 
			    count++; 
	    } 
	    return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = sc.nextLine();
		System.out.println("Enter word:");
		String word = sc.next();
		System.out.println("Occurrences of that word in the sentence is: "+CountOccurence.check(sentence, word));
		sc.close();
	}

}
