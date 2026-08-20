package com.DSAPrograms;
import java.util.Arrays;

public class ArrayOfDiifferentSizeAddition {


	
	 public static void main(String[] args) {
System.out.println("the main method ");
int a[]= {10,20,30,40,50};
int b[]= {10,20,30};
int size=a.length;
int size1=b.length;

int c[]=new int[size];
for(int i=0;i<size;i++) {
	if(i>=0 && i<3) {
	c[i]=a[i]+b[i];
	}
	else {
		c[i]=a[i];
	}
	
	
	
}
System.out.println(Arrays.toString(c));
	}



}
