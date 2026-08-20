package com.DSAPrograms;

import java.util.Scanner;

public class GivenArraysPrintOnlyPrimeNO_in_it {
static boolean getPrime(int a) {
	boolean flg=true;
	
	if( a==0 || a==1) {
		flg=false;
	}
	
	
	for(int i=2;i<a;i++) {
		if(a%i==0) {
			return false;
		}
	}
	return flg;
}
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the size :");
int size=s.nextInt();

int a[]=new int[size];
System.out.println("enter the no: ");
	for(int i=0;i<a.length;i++) {
		a[i]=s.nextInt();
	}
	
	for(int i=0;i<a.length;i++) {

		boolean d=getPrime(a[i]);
		
		if(d) {
			System.out.println("Prime no is :"+a[i]);
		}
		else {
			System.out.println("non -prime "+a[i]);
		}
		
	}
	
	
	s.close();
	}

}
