package com.DSAPrograms;

import java.util.Scanner;

public class FindFactorialUsing_Recursion {
static int findFactorial(int n) {
	/*int fact=1;
	for(int i=n;i>0;i--) {
		fact*=i;*/
    // Base case
    if (n == 0 || n == 1) {
        return 1;
    }

    // Recursive call
    return n * findFactorial(n - 1);

	}
	
	

	
public static void main(String[] args) {
	System.out.println("enter the no : ");
Scanner s=new Scanner(System.in);
		
	int n=s.nextInt();
	System.out.println(findFactorial(n));
		
	}

}
