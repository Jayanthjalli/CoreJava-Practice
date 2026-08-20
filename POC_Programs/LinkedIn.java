package com.POC_Programs;

import java.util.Scanner;

public class LinkedIn {

	public static void main(String[] args) {
		String position;

		Scanner s=new Scanner(System.in);
		System.out.println("which role are you interested in this position ");
		 position=s.nextLine();
		 if(position.equalsIgnoreCase("SD")||position.equalsIgnoreCase("JSD")||position.equalsIgnoreCase("SrSD")) {
			 System.out.println("lets start the interview");
			 System.out.println("tell your skills");
			 String skill=s.nextLine();
			 if(skill.equalsIgnoreCase("java")) {
				 System.out.println("our skills are matching with this role ");
				 System.out.println("do  you have Experience");
				 Boolean exp=s.nextBoolean();
				 if(exp==true) {
					 System.out.println("ok tell me your, no of years experience");
					 int year=s.nextInt();
					 if(year>1) {
						 System.out.println("u are willing to go further forward");
						 
					 }
					 else {
						 System.out.println("sorry, we are not looking for more than one year experience employess ");

					 }
				 }
				 else {
					 System.out.println("sorry, we are not looking for fresher ");

				 }
			 }
			 else {
			 System.out.println("your skills are not matching with the role");
		 }}
		 else {
			 System.out.println("u are not fit for this role");

		 }

	}
	

}
