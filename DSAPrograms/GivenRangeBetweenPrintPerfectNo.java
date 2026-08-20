package com.DSAPrograms;
import java.util.Scanner;

public class GivenRangeBetweenPrintPerfectNo {


	static void  getPerfectNoBetween(int a,int a1) {
		for(int i=a;i<a1;i++) {
			int sum=0;

			for(int j=1;j<i;j++) {
				if(i%j==0) {
					sum+=j;
					
				}
			}
		
			if(sum==i) {
				System.out.println(i);
				
			}}
			
			}

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);

			System.out.println("enter the start no :");
			int a=s.nextInt();
			System.out.println("enter the end no :");
			int a1=s.nextInt();
			getPerfectNoBetween(a,a1);
		
		}

	}

