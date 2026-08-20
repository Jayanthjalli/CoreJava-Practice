package com.DSAPrograms;

public class pattern6 {
public static void main(String[] args) {
	int row=7;
	int col=12;
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
			
			if(i==2 || i==4 ) {
				if(j==0 || j==col-2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");

				}
				
			}else if(i==0 || i==row-1) {
				if(j>=0 && j<col-1) {
					System.out.print("*");

				}
			}else {
				System.out.print(" ");
			}
			
		}
		System.out.println();
	}
}
}


/*

***********
            
*         * 
            
*         * 
            
***********


*/