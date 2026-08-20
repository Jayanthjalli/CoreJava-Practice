package com.DSAPrograms;

import java.util.Scanner;

public class SumOfThePrimaryAndSecondaryRemoveDuplicates {
	static Scanner s=new Scanner(System.in);


	public static void main(String[] args) {
		System.out.println("size");
		int size=s.nextInt();
int arr[][]=new int[size][size];
int sum=0;

int temp = 0;

for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {
	arr[i][j]=	s.nextInt();	
		}
}

	int count=0;
	int count1=size-1;
for(int i=0;i<size;i++) {
	for(int j=0;j<size;j++) {
		if(i==j) {
			sum+=arr[i][j];
		}
		else if(count<size && count1>=0){
			
			sum+=arr[count++][count1--];
			 if(count==count1) {
			temp=arr[count][count1];	 
			 }
		}
	
			}
	}
	

System.out.println("the sum is :"+(sum-temp));

	}

	}
