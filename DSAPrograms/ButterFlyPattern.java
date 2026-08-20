package com.DSAPrograms;

import java.util.Scanner;

public class ButterFlyPattern {

	public static void main(String[] args) {
System.out.println("enter the no : ");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=0;i<=n-1;i++) {
	
	for(int j=0;j<=i;j++) {
		System.out.print("*");
		
		
	}
	for(int k=n-1;k>i;k--) {
		System.out.print(" ");
	}
	for(int u=n-1;u>i;u--) {
		System.out.print(" ");
	}
	
	for(int y=0;y<=i;y++) {
		System.out.print("*");
	}
	
	System.out.println();
	}


for(int i=0;i<n-1;i++) {
	
	for(int j=n-1;j>i;j--) {
		System.out.print("*");
		
	}
	for(int k=0;k<=i;k++) {
		System.out.print(" ");
	}
	for(int p=0;p<=i;p++) {
		System.out.print(" ");
	}
	for(int r=n-1;r>i;r-- ) {
		System.out.print("*");
	}
	System.out.println();
	}

	}

}


/*
enter the no : 
12





*                      *
**                    **
***                  ***
****                ****
*****              *****
******            ******
*******          *******
********        ********
*********      *********
**********    **********
***********  ***********
************************
***********  ***********
**********    **********
*********      *********
********        ********
*******          *******
******            ******
*****              *****
****                ****
***                  ***
**                    **
*                      *


*/
