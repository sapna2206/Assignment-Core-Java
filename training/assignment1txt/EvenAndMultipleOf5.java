package com.psl.training.assignment1txt;

import java.util.*;

public class EvenAndMultipleOf5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		List<Integer> arrayContainer = new ArrayList<>();
		System.out.println("Enter Elements in array:");
		for(int i = 0;i<n;i++)
		{
			arr[i] = sc.nextInt();
			if(arr[i]%2 == 0 && arr[i]%5 == 0)
			{
				arrayContainer.add(arr[i]);
			}
		}
		for(int i = 0;i<arrayContainer.size();i++)
		{
			System.out.print(arrayContainer.get(i)+" ");
		}
		sc.close();
	}

}

