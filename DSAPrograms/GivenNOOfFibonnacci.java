package com.DSAPrograms;

import java.util.Scanner;

//    0 1 1 2 3 5 8 13 21 34
public class GivenNOOfFibonnacci {
static  void getFibonnacci(int n) {
	int a=0;
	int b=1;
	System.out.print(a+" "+b);
/*for(int i=0;i<=n;i++) {
		
		int c=a+b;
		System.out.print(" "+c+" ");
		a=b;
		b=c;
		
		
		
		
		
	}*/
	
	int i=0;
	while(i<=n) {
		
		int c=a+b;
		System.out.print(" "+c+" ");
		a=b;
		b=c;
		
		
		i++;
	}
}
	public static void main(String[] args) {
		System.out.println("enter the no:");
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		getFibonnacci( n);
	}

}
