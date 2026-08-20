package com.DSAPrograms;

import java.util.Scanner;

public class GivenNo_IsprimeOrNot {
static void getPrime(int c) {
	int count=0;

	for(int i=1;i<=c;i++) {
		if(c%i==0) {
			count++;
		}}
		 if(count==2) {
		System.out.println("prime");	
		}
		else {
			System.out.println("Not prime");	

		
	}
}
	public static void main(String[] args) {
System.out.println("enter the no to check it is prime or not ");
		Scanner c=new Scanner(System.in);
		int s=c.nextInt();
		getPrime(s);
		c.close();
	}

}
