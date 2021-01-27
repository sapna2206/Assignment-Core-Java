package com.psl.training.stringAssignment;
import java.util.*;

public class FindPrime {
	static int[] findPrimeNum(int a, int b)
	{
		int flag;
		List<Integer> primeNum = new ArrayList<>();
		for (int i = a; i <= b; i++) 
        {
            if (i == 1 || i == 0)
                continue;
            flag = 1;
 
            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
            {	
            	primeNum.add(i);
            }
        }
		//Object[] primeNumArray = primeNum.toArray();
		//return primeNumArray;
		int[] primeNumArray = new int[primeNum.size()];
		for(int i = 0; i<primeNum.size();i++)
		{
			primeNumArray[i] = primeNum.get(i);
		}
		return primeNumArray;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.printf("Enter lower bound of the interval: ");
        a = sc.nextInt(); 
        System.out.printf("\nEnter upper bound of the interval: ");
        b = sc.nextInt();
        System.out.println("\nPrime numbers between "+a+"and "+b+"are: " +Arrays.toString(FindPrime.findPrimeNum(a, b)));
        //FindPrime.findPrimeNum(a, b).toString();
        sc.close();
        
	}

}
