package com.POC_Programs;

import java.util.Scanner;

public class Matrimony {

	

		public static void main(String[] args) {
			
		
			Scanner c=new Scanner(System.in);
			System.out.println("tell yours assets and salary : ");

	double assets=c.nextDouble();
	System.out.println("tell you salary");
	double sal=c.nextDouble();

	if(assets>2500000.0 || sal>60000.0) {
		System.out.println("ok we will go further");
	System.out.println("tell your age");
	int age=c.nextInt();

	if(age>=25 && age<=28) {
		System.out.println("ok tell me about your habits");
		System.out.println("do u smoke or drink");
		Boolean smoke_drink=c.nextBoolean();
		if(!smoke_drink) {
			System.out.println("ok good habits u are having ");
			System.out.println("tell your height");
			float height=c.nextFloat();
			if(height>=5.4f || height <=6.0f) {
				System.out.println("the height is having good tell the about your sibling");
				Boolean sibling=c.nextBoolean();
				if(!sibling) {
					System.out.println("you are not having any sibling we are willing procced");
					System.out.println("tell your skin tone color");
					String color=c.next();
					if(color.equalsIgnoreCase("white")||color.equalsIgnoreCase("red")) {
						System.out.println("your color matches with our profile we moves forward");
					
					}else {
						System.out.println("your color is black , so our exception are not macthing with u");
					}
				}
				else {
					System.out.println("u are having the sibling we are not willing to move forword");
				}
			}else {
				System.out.println("your height is too short or long");
			}
		}
		else {
			System.out.println("The Alcoholic or smoker we don't like sorry ");
		}
	}else {
		System.out.println("ur age is too long or short");

	}
	}
		else{
			System.out.println("your assets and salaries is not matching with our exception");
		}
	}}


