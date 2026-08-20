package com.DSAPrograms;

import java.util.Scanner;

public class PrimeBetweenGivenNo {
	static void getPrimeNo(int n,int e){
		for(int i=n;i<=e;i++) {
			int u=1;
			int count=0;
			if(i%u==0) {
				count++;
				if(count==2) {
					System.out.println(i);
				}
				u++;

			}
			
			
		}
	}
	public static void main(String[] args) {
		System.out.println("enter the no:");
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int e=x.nextInt();

		getPrimeNo( n,e);
	}

}
