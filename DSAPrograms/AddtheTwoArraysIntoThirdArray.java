package com.DSAPrograms;

import java.util.Arrays;

public class AddtheTwoArraysIntoThirdArray {

	public static void main(String[] args) {
		int a[]= {12,32,44,54,5};
		int size=a.length;

		int aw[]= {12,32,44,54,5};
		int size1=aw.length;
		
		int c[]=new int[size];
		for(int i=0;i<size;i++) {
			c[i]=a[i]+aw[i];
		}
		System.out.println(Arrays.toString(c));
	}

}
