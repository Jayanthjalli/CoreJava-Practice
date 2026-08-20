/*
package com.DSAPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class RotationOfArrayFromRightToLeft {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int ar[]= {1,2,3,4,5,6,7,8};
System.out.println("enter the how many times to reverse the no  (right Rotation):");
int r=s.nextInt();
rotateArray(ar,r);

		
	}
	static void rotateArray(int ar[],int r) {
		int start=0;
		int end=ar.length-1;
		/*if(r>=ar.length) {
			r=0;
		}
		r=r%ar.length;
		reverseArray(ar,start,end);
		reverseArray(ar,start,r-1);
		reverseArray(ar,r,end);


	}
	 static void reverseArray(int[] ar, int start, int end) {
		 int temp;
		 
		while(start<end) {
			temp= ar[start];
			ar[start]=ar[end];
			ar[end]=temp;
			start++;
			end--;
			 
			
			
		}
		 
		 System.out.println(Arrays.toString(ar));
	}

}
*/

/*

Right Rotation by 2:

[4, 5, 1, 2, 3]

*/
//Left Rotation: The first element goes to the last.
//Right Rotation: The last element goes to the first.