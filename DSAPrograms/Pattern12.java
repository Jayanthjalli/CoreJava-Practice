package com.DSAPrograms;

import java.util.Scanner;

/*
 
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

*/

//solution 1

//public class Pattern12 {
//	public static void main(String[] args) {
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number");
//		int n=sc.nextInt();
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++)
//				if(j<=i) {
//				System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			for(int j=n-1;j>=0;j--)
//				if(j<=i) {
//				System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			System.out.println(" ");
//		}
//		for(int i=n-2;i>=0;i--) {
//			for(int j=0;j<n;j++)
//				if(j<=i) {
//				System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			for(int j=n-1;j>=0;j--)
//				if(j<=i) {
//				System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			System.out.println(" ");
//		}
//		
//	}
//}


//Solution 2

public class Pattern12 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int spaces=2*n-2;
		for(int i=1;i<=2*n-1;i++) {
			int stars=i;
			if(i>n) stars=2*n-i;
			for(int j=1;j<=stars;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=stars;j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i>=n)spaces=spaces+2;
			else spaces=spaces-2;
			
		}
		
	}
}


