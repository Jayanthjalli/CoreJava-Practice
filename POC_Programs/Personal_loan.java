package com.POC_Programs;

import java.util.Scanner;

//here we write only the bussiness logic

public class Personal_loan extends Loan_Banking_Application {
	
void Personal_loanInfo() {
	System.out.println("your Documents recieved Successfully");
}
void hello() {
	System.out.println("hello child ");
}
	public static void main(String[] args) {
		
		System.out.println("welcome to Personal Loan Applications");
		Personal_loan p=new Personal_loan();
		
		p.hello();
		boolean phoneValidate=p.phoneValidate();
		boolean addharValidate=p.addharValidate();
		boolean panValidate=p.panValidate();
				
	

				if(phoneValidate && addharValidate &&  panValidate) {
					int ag=p.getAge();
					double sal=p.getSalary();
					
					double cibi=p.getCibilScore();

		if(ag>25 && ag<=45 && sal>800000 && cibi>300 ) {
			System.out.println("Welcome to Banking Applications");
			System.out.println("congrations u are eliglible for personal loan your interest is :"+p.getRateOfInterest());
			p.Personal_loanInfo();
		}
		else {
			System.out.println("focus on your carrer goals ");
		}
		
				}
				else {
					System.out.println("INvalid details U are provided .");
		
	}

	}}
