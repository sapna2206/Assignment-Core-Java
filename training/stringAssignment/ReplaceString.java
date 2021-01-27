package com.psl.training.stringAssignment;

import java.util.Scanner;

public class ReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String str = sc.nextLine();
		System.out.println("Enter a word to search in the sentence:");
		String word = sc.next();
		System.out.println("Enter a word to replace in the sentence:");
		String replace = sc.next();
		String replaceString = str.replace(word, replace);
		System.out.println("New Sentence is: "+replaceString);
		sc.close();
	}

}