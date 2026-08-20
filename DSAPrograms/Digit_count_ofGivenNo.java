package com.DSAPrograms;
import java.util.Scanner;

public class Digit_count_ofGivenNo {
/*	static void getDigitCount(int s) {
		int count=0;
		while(s>0) {
		int a=s%10;
		s=s/10;
		count++;
		}
		System.out.println(count);
	}
		public static void main(String[] args) {
	System.out.println("enter the no: ");
	Scanner s=new Scanner(System.in);
	int q=s.nextInt();
	getDigitCount(q);
		}

	}

*/

	static void getDigital(int a) {
		int count=0;
		for(;a>0;) {
			int w=a%10;
			 a=a/10;
			count++;
		}
		System.out.println(count);
	}
public static void main(String[] args) {
	System.out.println("enter the no : ");
	Scanner u=new Scanner(System.in);
	int a=u.nextInt();
	getDigital(a);
}	
}

	