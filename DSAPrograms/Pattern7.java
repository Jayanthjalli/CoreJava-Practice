/*package com.DSAPrograms;

public class Pattern7 {

	public static void main(String[] args) {
int row=10;
int col=10;
for(int i=0;i<10;i++) {                       
	for(int j=0;j<=10;j++) {
		if(i==0) {
			if(j==0 || j<5) {
				System.out.print(" ");

			}
		else if(j==5 || j<=9) {
				System.out.print("*");
				
			}
			else {
				System.out.print(" ");
			}
		}
		else if(i==1){
			
			if(j==0 || j<4) {
				System.out.print(" ");

			}
		else if(j==4 || j<=8) {
				System.out.print("*");
				
			}
			else {
				System.out.print(" ");
			}
		}
		else if(i==2){
			if(j==0 || j<3) {
				System.out.print(" ");

			}
			else if(j==3 || j<=7) {
				System.out.print("*");
				
			}
			else {
				System.out.print(" ");
			}
		}
		
		else if(i==3){
			if(j==0 || j<2) {
				System.out.print(" ");

			}
		else if(j==2 || j<=6) {
				System.out.print("*");
				
			}
			else {
				System.out.print(" ");
			}
		}
		
		else if(i==4){
			if(j==0 || j<1) {
				System.out.print(" ");

			}
			else if(j==1 || j<=5) {
				System.out.print("*");
				
			}
			else {
				System.out.print(" ");
			}
		}
		else if(i==5){
			
			if(j==0 || j<=4) {
				System.out.print("*");
				
			}
			else {
				System.out.print(" ");
			}
		}
		
		
		
	}
	System.out.println();
	
}
	}

}

*/



/*

     ***** 
    *****  
   *****   
  *****    
 *****     
***** 


*/
















package com.DSAPrograms;

public class Pattern7 {

	public static void main(String[] args) {
int row=10;
int col=10;
for(int i=0;i<col;i++) {                       
	for(int j=0;j<col-i;j++) {

		System.out.print(" ");
		
	}
	for(int k=0;k<3;k++) {
		System.out.print("*");
	}
	System.out.println();
}}}



/*


         ***
        ***
       ***
      ***
     ***
    ***
   ***
  ***
 ***
***


*/
