package com.psl.training.stringAssignment;
import java.util.*;

public class FindSubstring {
	static boolean function_SerchKey(String[] productArray, String key, int n)
    {

        boolean flag = false;
        char[] tempKey = key.toCharArray();
        int count;

        for (int k = 0; k < n; k++)
        {
            char[] temproductArray = productArray[k].toCharArray();
          
            count = 0;
            for (int i = 0; i < tempKey.length; i++)
            {
               
                for (int j = 0; j < temproductArray.length; j++)
                {
                    if (tempKey[i] == temproductArray[j])
                    {
                       count = count + 1;

                    }
                    if (count >= tempKey.length)
                        return true;
                   
                }
            }

           
        }
        return flag;
    }  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Product Do You Want To Enter:");
        int noOFProduct = sc.nextInt();

        String[] productArray = new String[noOFProduct];
        String[] keyArray = new String[noOFProduct];

        for (int i = 0; i < noOFProduct; i++)
        {
        	System.out.println("Enter Product Name:");
            productArray[i] = sc.nextLine();

            System.out.println("Enter key For Product:");
            keyArray[i] = sc.nextLine();
        }

        System.out.println("Enter Product Key Which You Want To Search:");
        String key = sc.nextLine();

        boolean index = function_SerchKey(productArray, key, noOFProduct);

        if (index)
        	System.out.println("Yes Keyword is Present in Product Name");
        else
        	System.out.println("No.... Keyword is not Present in Product Name");

       sc.close();

    }


}
