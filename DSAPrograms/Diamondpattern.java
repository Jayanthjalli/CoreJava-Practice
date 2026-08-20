package com.DSAPrograms;

public class Diamondpattern {

	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
				
			}
			
			for(int k=0;k<2*i+1;k++) {
				System.out.print("*");

			}
			System.out.println();
		}
		int n1=4;
		for(int i=n1-2;i>=0;i--) {
			for(int j=0;j<n1-i-1;j++) {
				System.out.print(" ");
				
			}
			
			for(int k=0;k<2*i+1;k++) {
				System.out.print("*");

			}
			System.out.println();
		}
			
	}

}




/*



   *
  ***
 *****
*******
 *****
  ***
   *


*/