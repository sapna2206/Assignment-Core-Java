package com.psl.training.languageFundamentalAssignment;

import java.util.*;

public class MaxOfThree {
	static int callMax(int x, int y, int z) {
		if(x>y && x>z)
		{
			return x;
		}
		else if(y>x && y>z)
		{
			return y;
		}
		else
			return z;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println("Max of three is: "+MaxOfThree.callMax(x, y, z));
        sc.close();
	}

}

