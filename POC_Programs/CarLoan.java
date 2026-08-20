package com.POC_Programs;

public class CarLoan extends Loan_Banking_Application {
	
void CarLoanInfo() {
	System.out.println("your Documents recieved Successfully");
}

	public static void main(String[] args) {
		System.out.println("welcome to Car Loan Applications");
		CarLoan p=new CarLoan();
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
			p.CarLoanInfo();
		}
		else {
			System.out.println("focus on your carrer goals ");
		}
		
				}
				else {
					System.out.println("INvalid details U are provided .");
		
	}

	}}
