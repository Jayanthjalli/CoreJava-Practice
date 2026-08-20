/*package com.DSAPrograms;

public class TrainglePattern {

	public static void main(String[] args) {

		int rows=5;
		int cols=9;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(i==0) {
					
					if( j==0 || j==1 || j==2 || j==3 ) {
						System.out.print(" ");

					}
					else if(j==4) {
						System.out.print("*");
						
					}
					else {
						System.out.print(" ");
					}
				}
				
				else if(i==1) {
					if(j==0 || j==1 || j==2) {
						System.out.print(" ");

					}
					else if(j==3 || j==4 || j==5) {
						System.out.print("*");
						
					}
					else {
						System.out.print(" ");
					}
				}
				else if(i==2) {
					
					if(j==0 || j==1) {
						System.out.print(" ");

					}
				else if(j==2 || j==3 || j==4 || j==5 || j==6) {
						System.out.print("*");
						
					}
					else {
						System.out.print(" ");
					}
				}
				else if(i==3) {
					if(j==0) {
						System.out.print(" ");

					}
					else if( j==1 || j==2 || j==3 || j==4 || j==5 || j==6 || j==7) {
						System.out.print("*");
						
					}
					else {
						System.out.print(" ");
					}
				}	
				
				else if(i==4) {
					if(j==0 || j==1 || j==2 || j==3 || j==4 || j==5 || j==6 || j==7|| j==8) {
						System.out.print("*");
						
					}
				}
				
			}
			
			System.out.println();
			
		}
		
		
		
	}

}


*/







/*





    *    
   ***   
  *****  
 ******* 
*********



*/

/*
package com.DSAPrograms;

public class TrainglePattern {

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
		
	}}

*/


