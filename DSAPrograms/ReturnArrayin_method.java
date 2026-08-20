package com.DSAPrograms;
import java.util.Scanner;

public class ReturnArrayin_method {
// return the array  inside the  method    
static int[] fun() {
	int arr[]= {34,8,98,65,45,87,809,453,675};
	return arr;
}
	public static void main(String[] args) {
	
	int s[]=fun();
for(int i=0;i<s.length;i++) {
	System.out.print(s[i]+"  ");
	
}
	
	
	}


}


