package com.psl.training.stringAssignment;

import java.util.*;

public class SearchNumber {
	static int findPosition(int num, int[] nos)
	{
		int i,flag=0;
		for(i = 0; i < nos.length; i++)
        {
            if(nos[i] == num)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            return (i + 1);
        }
        else
        {
            System.out.println("Element not found");
        	return 0;
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = sc.nextInt();
        int nos[] = new int[n];
        System.out.println("Enter all the elements:");
        for(i = 0; i < n; i++)
        {
            nos[i] = sc.nextInt();
        }
        System.out.print("Enter the element you want to find:");
        int num = sc.nextInt();
        System.out.println("Element found at position:"+SearchNumber.findPosition(num, nos));
        sc.close();
	}

}

