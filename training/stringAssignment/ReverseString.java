package com.psl.training.stringAssignment;
import java.util.*;

public class ReverseString {
	static String makeReverse(String str)
	{
		boolean isWord = false;                                                     
	    StringBuffer reversedText = new StringBuffer();
	    StringBuffer word = new StringBuffer();
	    for(int i = 0 ; i  <str.length() ; ++i) {
	      if(!isWord) {                                                    
	        if(Character.isLetter(str.charAt(i))) {                       
	          word.append(str.charAt(i));                                 
	          isWord = true;                                               
	        } else {
	          reversedText.append(str.charAt(i));
	        }
	      } else {                                                         
	        if(Character.isLetter(str.charAt(i)) || str.charAt(i) == '\'') {
	          word.append(str.charAt(i));                                 
	          continue;
	        }
	        else {                                                         
	          reversedText.append(word.reverse());                        
	          reversedText.append(str.charAt(i));                         
	          word.delete(0,word.length());                                
	          isWord = false;                                              
	        }
	      }
	    }
	    if(word.length() > 0)                                             
	      reversedText.append(word.reverse());                             
	 
	    //System.out.println(reversedText);
	    return reversedText.toString();
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence: ");
		String str = sc.nextLine();
		//String str = "To be or not to be";
		System.out.println("Reversed String is: "+ReverseString.makeReverse(str));
		sc.close();
	}

}

