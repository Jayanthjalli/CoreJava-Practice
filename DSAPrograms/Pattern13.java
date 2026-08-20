package com.DSAPrograms;



/*
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
 */
public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int star=n;
		int space=0;
		for(int i=1;i<=2*n;i++) {
			
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<n) {
				star-=1;
				space+=2;
			}
			else if(i==n) {
				continue;
			}
			else {
				star+=1;
				space-=2;
			}
			
		}
	}

}
