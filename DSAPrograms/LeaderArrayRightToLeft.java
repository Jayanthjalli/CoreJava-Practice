

package com.DSAPrograms;

import java.util.Arrays;

public class LeaderArrayRightToLeft {

	public static void main(String[] args) {
int ar[]= {16,17,4,3,5,2}; //          17 5 2
int a[]= new int[ar.length];
int count=0;
int temp=ar[ar.length-1];
a[count++]=temp;

for(int i=ar.length-2;i>=0;i-- ) {

	if(ar[i]>temp) {

		 temp=ar[i];
		 a[count++]=temp;
		 
			

		 }


	}	
System.out.print("[");

for(int j=count-1;j>=0;j--) {
	
	System.out.print(" "+a[j]);
	if(j!=0) {
		System.out.print(",");
		
	}
}

System.out.print("]");



}




	}






