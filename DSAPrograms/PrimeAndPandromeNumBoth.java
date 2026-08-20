package com.DSAPrograms;

import java.util.Scanner;

public class PrimeAndPandromeNumBoth {

	static void gelindromAndPrime(int e) {
		int count=0;

		for(int i=1;i<=e;i++) {
			if(e%i==0) {
			count++;	
			}}
		int temp=e;
		int rev=0;
		int rem=0;

		for(;e>0;) {
			 rem=e%10;
e=e/10;	
rev=rev*10+rem;}
			if(count==2 && temp==rev) {
				System.out.println("prime + pandrome");

				
						}
			else {
					
					System.out.println(" not prime and not pandrome");
				}

			
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		System.out.println("enter the no (prime no +  palindrome)");
		int y=s.nextInt();
		gelindromAndPrime(y);
		s.close();
	
	
	
}

}


