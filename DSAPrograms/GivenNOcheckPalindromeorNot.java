package com.DSAPrograms;
import java.util.Scanner;

public class GivenNOcheckPalindromeorNot {
	

		public static void main(String[] args) {
	System.out.println("To check the No is Palindrome or not ");
			
			Scanner s=new Scanner(System.in);
			System.out.println("enter the  no :");
			int a=s.nextInt();
			getPalindrome(a);
		}

		 static void getPalindrome(int a) {
	int rem=0;
	int r=0;
	int a1=a;
			 for(;a>0;) {
		rem=a%10;
		a=a/10;
		r=r*10+rem;
			 }
			 System.out.println(r);
			 if(a1==r) {
				System.out.println("it is palindrome"); 
			 }
			 else {
					System.out.println("it is not palindrome"); 

			 }
			 
			 
			 
		

	}

}
