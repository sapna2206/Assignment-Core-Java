package com.psl.training.languageFundamentalAssignment;

import java.util.*;

public class CheckVowel {
	static boolean checkAlpha(char alph)
	{
		if(alph == 'a'|| alph == 'e'|| alph == 'i'|| alph == 'o'|| alph == 'u'||alph == 'A'|| alph == 'E'|| alph == 'I'|| alph == 'O'|| alph == 'U')
		{
			return true;
		}
		else 
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character:");
		char alph = sc.next().charAt(0);
		System.out.println("Entered character '"+alph+"' is vowel:"+CheckVowel.checkAlpha(alph));
		sc.close();
	}

}

