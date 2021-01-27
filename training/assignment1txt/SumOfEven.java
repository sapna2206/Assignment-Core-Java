package com.psl.training.assignment1txt;

import java.util.Scanner;

public class SumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		System.out.println("Enter Elements in array:");
		for(int i = 0;i<n;i++)
		{
			arr[i] = sc.nextInt();
			if(arr[i]%2 == 0)
			{
				sum += arr[i];
			}
		}
		System.out.println("Sum of total even numbers: "+sum);
		sc.close();
	}

}
