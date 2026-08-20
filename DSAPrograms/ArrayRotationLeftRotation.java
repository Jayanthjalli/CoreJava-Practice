package com.DSAPrograms;

	import java.util.Arrays;
	import java.util.Scanner;
public class ArrayRotationLeftRotation {
	


		public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int ar[]= {1,2,3,4,5};
	System.out.println("enter the how many times to reverse the no (left Rotation) :");
	int r=s.nextInt();
	rotateArray(ar,r);
	 System.out.println(Arrays.toString(ar));

	s.close();

			
		}
		static void rotateArray(int ar[],int r) {
			int start=0;
			int end=ar.length-1;
			if(r>=ar.length) {
				r=0;
			}
			//r=r%ar.length;
			  reverseArray(ar, 0, r - 1);

		        // Reverse remaining elements
		        reverseArray(ar, r, ar.length - 1);

		        // Reverse complete array
		        reverseArray(ar, 0, ar.length - 1);


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
			 
		}

	}


	/*
	Original:

	[1, 2, 3, 4, 5]

	Left Rotation by 2:

	[3, 4, 5, 1, 2]*/