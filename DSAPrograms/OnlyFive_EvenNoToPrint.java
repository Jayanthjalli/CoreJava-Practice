package com.DSAPrograms;
import java.util.Scanner;

public class OnlyFive_EvenNoToPrint {



		public static void main(String[] args) {
			System.out.println("enter the no :");
			Scanner s=new Scanner(System.in);
			int count=0;
			int t=0;
			
	while(t>=0) {
		int num=s.nextInt();

		if(num%2==0) {
			count++;
			if(count==5) {
				break;
			}
		}
		else {
			
		}
		t++;
	}
	System.out.println("exit");
		}

	}



