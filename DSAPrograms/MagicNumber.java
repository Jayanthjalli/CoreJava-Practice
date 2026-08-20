package com.DSAPrograms;

import java.util.Scanner;

//1234 

//1+2+3+4 = 10
//10    -> 1 + 0=1 is a magic no .
public class MagicNumber {
static void getMagicNo(int n) {
	int re=0;
 
	while(n>9) {
		int sum=0;
while(n>0) {
	sum=sum+n%10;
	n=n/10;
	//1729
	

	
}
	n=sum;	
		
		
	}
	if(n==1) {
		System.out.println("magic");
	}else {
		System.out.println("not magic");
	}
	
	
}
	public static void main(String[] args) {
System.out.println("enter the no :");
Scanner r=new Scanner(System.in);
int q=r.nextInt();
getMagicNo(q);
	}

}
