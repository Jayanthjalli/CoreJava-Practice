package com.DSAPrograms;

import java.util.Scanner;
//converting the given character into (lowercase to upercase) or (upppercase to lowercase)

public class ConvertingOfUperINtoLowerUSING_ASCII {

	public static void main(String[] args) {
		System.out.println("enter the character:");
		Scanner sc=new Scanner(System.in);
	
		System.out.println("enter the character for converting ");

		char n1=sc.next().charAt(0);
		
		getConvert(n1);
		}

	private static void getConvert(char n1) {
		int ascii=(int)n1;
		System.out.println(ascii);
		if(n1>='a' && n1<='z') {
		ascii=ascii-32;	
		System.out.printf("the lower case  %c converted into value of  %c and their ascci value is %d",n1,(char)ascii,(int)(char)ascii);

		}
		else {
			ascii=ascii+32;
			System.out.printf("the upper case  %c converted into value of  %c and their ascci value is %d",n1,(char)ascii,(int)(char)ascii);


		}		
	}
}
	
/*
char n=sc.next().charAt(0);
if(n>='A' && n<='Z') {
	System.out.println("it is upper case ");
}else {
	System.out.println("it is lower");
}

*/