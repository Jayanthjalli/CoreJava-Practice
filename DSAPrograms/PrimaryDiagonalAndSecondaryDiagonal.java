/*package com.DSAPrograms;

import java.util.Scanner;

public class PrimaryDiagonalAndSecondaryDiagonal {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the rows :");
int row=s.nextInt();
System.out.println("Enter the cols :");
int cols=s.nextInt();
int ar[][]=new int[row][cols];

for(int i=0;i<row;i++) {
	for(int j=0;j<cols;j++) {
		ar[i][j]=s.nextInt();
		
		
	}
	System.out.println();
}


for(int i=0;i<row;i++) {
	for(int j=0;j<cols;j++) {
		System.out.print(ar[i][j]+" ");
		
		
	}
	System.out.println();
}
int sum=0;
for(int i=0;i<row;i++) {
	for(int j=0;j<cols;j++) {
		if(i==j) {
			sum+=ar[i][j];
		}
	}}
System.out.println("the primary diagonals sum : "+sum);


int sum1=0;
int count=0;
int count1=cols-1;
for(int i=0;i<row;i++) {
	for(int j=0;j<cols;j++) {
		if( count<row && count1>=0) {
			sum1+=ar[count++][count1--];
		}
	}}
System.out.println("the secondary diagonals sum : "+sum1);


	}

}
*/

package com.DSAPrograms;

import java.util.Scanner;

public class PrimaryDiagonalAndSecondaryDiagonal {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the rows :");
int row=s.nextInt();
System.out.println("Enter the cols :");
int cols=s.nextInt();
int ar[][]=new int[row][cols];

for(int i=0;i<row;i++) {
	for(int j=0;j<cols;j++) {
		ar[i][j]=s.nextInt();
		
		
	}
	System.out.println();
}


for(int i=0;i<row;i++) {
	for(int j=0;j<cols;j++) {
		System.out.print(ar[i][j]+" ");
		
		
	}
	System.out.println();
}
int sum=0;
for(int i=0;i<row;i++) {
	//for(int j=0;j<cols;j++) {
			sum+=ar[i][i];
		
	//}
}


int sum1=0;
int count=0;
int count1=cols-1;
//for(int i=0;i<row;i++) {
//	for(int j=0;j<cols;j++) {
//		if( count<row && count1>=0) {
//			sum1+=ar[count++][count1--];
//		}
//	}}
System.out.println("the primary diagonals sum : "+sum1);


while( count<row && count1>=0) {
	sum1+=ar[count++][count1--];
}
System.out.println("the secondary diagonals sum : "+sum1);

}}