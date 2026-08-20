package com.DSAPrograms;

import java.util.Scanner;

public class GivenNo_Factorial {
	static int getFactorial(int fact) {
		int defaultfact=1;
		for(int i=fact;i>0;i--) {
			defaultfact=defaultfact*i;
			
		}
		
		
		return defaultfact;
	}
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the  no for checking the factorial of it : ");
int fact=s.nextInt();
int factorial=getFactorial(fact);
System.out.println("The no of the factorial : "+factorial);
	}

}
