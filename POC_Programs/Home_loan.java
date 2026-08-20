package com.POC_Programs;
//CHILD OR SUB OR DERIVED 
public class Home_loan  extends Loan_Banking_Application {
		
	void Home_loanInfo() {
		System.out.println("your Documents recieved Successfully");
	}

		public static void main(String[] args) {
			System.out.println("welcome to Banking Applications");
			Home_loan p=new Home_loan();
			boolean phoneValidate=p.phoneValidate();
			boolean addharValidate=p.addharValidate();
			boolean panValidate=p.panValidate();
					
		

					if(phoneValidate && addharValidate &&  panValidate) {
						int ag=p.getAge();
						double sal=p.getSalary();
						
						double cibi=p.getCibilScore();

			if(ag>25 && ag<=55 && sal>600000 && cibi>300 ) {
				System.out.println("Welcome to Home Loan Applications");
				System.out.println("congrations u are eliglible for home loan your interest is :"+p.getRateOfInterest());
				p.Home_loanInfo();
			}
			else {
				System.out.println("focus on your carrer goals ");
			}
			
					}
					else {
						System.out.println("INvalid details U are provided .");
			
		}

		}}
