package com.DSAPrograms;

import java.util.Scanner;

public class NinetyDegreesArrayToPrint {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
		System.out.println("enter the size : ");
		int size=s.nextInt();
		int ar[][]=new int[size][size];
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				ar[i][j]=s.nextInt();
			}
		}
		
		
		
		
		
		
		System.out.print("THE ARRAYS OF  ");

		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();

		}
		
		
		System.out.println("THE 90 DEGREE  ARRAY TO PRINT IT ");

		int count1=size-1;
		for(int i=0;i<size;i++) {
			for(int j=size-1;j>=0;j--) {
				if(count1>=0 ) {
				System.out.print(ar[j][i]+" ");
			}
		}
			System.out.println();

		}
			
		s.close();		
	
		}
		}

