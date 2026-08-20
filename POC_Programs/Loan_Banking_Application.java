package com.POC_Programs;

import java.util.Scanner;
//PARENT OR SUPER OR BASE 

// here i maintained the comman functionalities to maintain the reusablity of code.
public class Loan_Banking_Application {
void hello() {
	System.out.println("hello parent ");
}
	static Scanner a=new Scanner(System.in);
	String getName() {
		System.out.println("enter your name :");
		String name=a.next();
		return name;
	}

	int getAge() {
		System.out.println("enter your age :");

		int age=a.nextInt();
		return age;
	}

	double getSalary() {
		System.out.println("enter your salary :");

		double salary=a.nextDouble();
		return salary;
	}


	double getCibilScore() {
		System.out.println("enter your cibil Score :");

		double cibilScore=a.nextDouble();
		return cibilScore;
	}

	double getRateOfInterest() {
	double rateOfIn=12.0;
		double Score=getCibilScore();

		if(Score>300 && Score<550) {
			System.out.println("Poor credit score, may face difficulties in getting loans.");
			rateOfIn+=5.0;
			return rateOfIn;
		}
		else if(Score>=550 && Score<650) {
			System.out.println("Fair credit score, limited loan options available.");
			rateOfIn+=4.0;
			return rateOfIn;
	}
		else if(Score>=750 && Score<=900) {
			System.out.println("Good credit score, better chances of loan approvel");
			rateOfIn+=1.0;
			return rateOfIn;
	}
		
		else {
	return rateOfIn;
		}
		}

	boolean phoneValidate(){
		System.out.println("enter your mobile No:");
		String number=a.next();
		boolean phoneCheck=number.matches("^[6-9][0-9]{9}");
		return phoneCheck;
	}

	boolean addharValidate(){
		System.out.println("enter your Addhar No:");
		String number=a.next();
		boolean addharCheck=number.matches("^[2-9][0-9]{11}");
		return addharCheck;
	}


	boolean panValidate(){
		System.out.println("enter your panCard No:");
		String number=a.next();
		boolean panCheck=number.matches("^[A-Z]{5}[0-9]{4}[A-Z]");
		return panCheck;
	}
}