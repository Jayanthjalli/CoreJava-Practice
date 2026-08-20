package com.DSAPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArrayWithSortedOrder {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first array elements :");
		int size=s.nextInt();
int ar1[]= new int[size];	
System.out.println("enter the second array elements :");
int size1=s.nextInt();
int ar[]=new int[size1];

for(int i=0;i<ar1.length;i++) {
	ar1[i]=s.nextInt();
}
System.out.println(Arrays.toString(ar1));

for(int i=0;i<ar.length;i++) {
	ar[i]=s.nextInt();
}
System.out.println(Arrays.toString(ar));

int arr[]=new int[size+size1];

System.out.println("result before sort"+Arrays.toString(arr));

merge(arr,ar1,ar);

System.out.println(Arrays.toString(arr));
	
}
static void merge(int arr[],int left[],int right[]) {
	int j=0;
	int i=0;
	int k=0;
	while(i<left.length && j<right.length) {
		if(left[i]<right[j]) {
			arr[k++]=left[i++];
		}
		else {
			arr[k++]=right[j++];

		}
	}
	
	while(i<left.length) {
		arr[k++]=left[i++];
		
	}
	while(j<right.length) {
		arr[k++]=right[j++];
		
	}
	
	



}


	}


