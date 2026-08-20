package com.DSAPrograms;
import java.util.Random;
import java.util.Scanner;
public class GuessTheRandomNo {

	


		public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		
		Random s1=new Random();
			int y=s1.nextInt(10);
		System.out.println(y);
			
				
			
				for(int j=0;j<3;j++) {
					int y1=s.nextInt();
				
				if(y1==y) {
					System.out.println("win");
					break;
				}
				else if(y1<y ) {
					System.out.println("lower");
				}
				else if(y1>y ) {
					System.out.println("upper");
				}
				
			}	
					System.out.println("best luck nexttime");
				
			
			}
				
}
		
		
		
