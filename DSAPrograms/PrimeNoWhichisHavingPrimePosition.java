package com.DSAPrograms;

import java.util.Scanner;

public class PrimeNoWhichisHavingPrimePosition {

	
	static boolean getListOfthePrimeNo(int a) {
		boolean d=true;
		if(a==0 || a==1) {
			return false;
		}
	
		for(int i=2;i<a;i++) {
			if(a%i==0) {
			d=false;
			}
		}
			return d;
	}
		
		
	
	public static void main(String[] args) {
		System.out.println("enter the how much range to get prime no's  :");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int count=0;

		for(int i=1;i<=a;i++) {
		if(getListOfthePrimeNo(i)) {
			count++;
			if(getListOfthePrimeNo(count)) {
				System.out.println(i);
		}

			
			
			
		}
		
		}
	}
}
