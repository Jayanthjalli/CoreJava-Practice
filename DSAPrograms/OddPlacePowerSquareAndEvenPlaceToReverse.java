package com.DSAPrograms;

import java.util.Scanner;

public class OddPlacePowerSquareAndEvenPlaceToReverse {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);

System.out.println("Enter the rows :");
int rows=s.nextInt();
System.out.println("Enter the cols :");
int cols=s.nextInt();
int ar[][]=new int[rows][cols];

System.out.println("enter the two dimensional array values : ");
for(int i=0;i<rows;i++) {
	for(int j=0;j<cols;j++) {
		ar[i][j]=s.nextInt();
	}
	System.out.println();
}

for(int i=0;i<rows;i++) {
	if(i%2==0) { //i= 0   2 
	for(int j=0;j<cols/2;j++) {
		int temp=ar[i][j];//00 
		ar[i][j]=ar[i][cols-1-j];
		ar[i][cols-1-j]=temp;
	}
		
	}
	else {  // i= 1  3
		for(int j=0;j<cols;j++) {
			ar[i][j]=ar[i][j]*ar[i][j];
		}
	}
}




System.out.println("****************printing ****************************8");
for(int i=0;i<rows;i++) {
	for(int j=0;j<cols;j++) {
	
		System.out.print(ar[i][j]+ " ");
	}
	System.out.println();
}


	}

}

