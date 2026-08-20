package com.DSAPrograms;
import java.util.Scanner;

public class FindLeafYearORNOt {



		public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the year to find it is leaf year or not !!!!!!!!  :");
	int year=s.nextInt();
findLeafYear(year);
	
	}

		private static void findLeafYear(int year) {
			
			
				if(year%400==0 ||( year%4==0 && year%100!=0))
					System.out.println("leaf");
				else
					System.out.println("not leaf ");
				
		}

	}