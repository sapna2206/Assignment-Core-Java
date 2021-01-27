package com.psl.training.assignment1txt;

public class PatternOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
        }
         System.out.println();
        }
         //System.out.println();
        for(int i=3;i>=1;i--){
        for(int j=1;j<i+1;j++){
            System.out.print(j);
        }
          System.out.println();
        }
	}

}
