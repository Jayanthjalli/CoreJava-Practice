/*package com.DSAPrograms;

import java.util.Scanner;

public class ConvertDecimalINTOBinary {

	public static void main(String[] args) {
System.out.println("main method started");
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the decimal no :");
		int e=s.nextInt();
		System.out.println(getBinary(e));
	}

	private static String getBinary(int e) {
		int s=0;
		int rev;
		String s1="";
		
		while(e>0 ) {
			rev=e%2;
			e=e/2;
			s1=rev+s1;
		}
		
		return s1;
	}

}

*/
