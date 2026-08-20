/*
 * package com.DSAPrograms;

import java.util.Scanner;

public class Sum_AllEleme_of_givenNo {
static void getSum(int s) {
	int sum=0;
	while(s>0) {
	int a=s%10;
	s=s/10;
	
	sum=sum+a;
	}
	System.out.println(sum);
}
	public static void main(String[] args) {
System.out.println("enter the no: ");
Scanner s=new Scanner(System.in);
int q=s.nextInt();
getSum(q);
	}

}
*/

package com.DSAPrograms;

import java.util.Scanner;

public class Sum_AllEleme_of_givenNo {
static void getSum(int q) {
	int sum=0;
	for(;q>0;) {
		int a=q%10;
		 q=q/10;
		sum=sum+a;
	}
	System.out.println(sum);
}
	public static void main(String[] args) {
System.out.println("enter the no: ");
Scanner s=new Scanner(System.in);
int q=s.nextInt();
getSum(q);
	}

}

