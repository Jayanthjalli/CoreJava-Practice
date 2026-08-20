package com.POC_Programs;

import java.util.Scanner;

public class Simple_Calculator {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		String com;
		double result;
		do {
			

		System.out.println("enter the first no :");
		int a=x.nextInt();
		System.out.println("enter the second no :");
		int b=x.nextInt();
		System.out.println("enter the character :");
		char c=x.next().charAt(0);
		 result=0;
		switch(c) {
		case '+'-> result=a+b;
		case '-'-> result=a-b;
		case '/'-> result=a/b;
		case '*'-> result=a*b;
		case '%'-> result=a%b;

		default ->System.out.println("invalid character");

		}
		System.out.println(result);

		System.out.println("do you want to continue y/n");

		 com=x.next();
		}

		while(com.equalsIgnoreCase("yes"));
		System.out.println("exit ");
		System.out.println("method ended ");

			
	}

}
