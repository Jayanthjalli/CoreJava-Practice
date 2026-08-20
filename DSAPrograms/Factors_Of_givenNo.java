package com.DSAPrograms;

import java.util.Scanner;

public class Factors_Of_givenNo {
static void getFactors(int num) {
	for(int i=1;i<=num;i++) {
		if(num%i==0) {
			System.out.print (i+" ");
		}
		
	}
	
}	
public static void main(String[] args) {
Scanner z=new Scanner(System.in);
System.out.println("enter the no to get the factors of a given number  : ");
int number=z.nextInt();
getFactors(number);

	}

}
