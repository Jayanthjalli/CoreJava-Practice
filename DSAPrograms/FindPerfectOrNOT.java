
package com.DSAPrograms;

import java.util.Scanner;

public class FindPerfectOrNOT {

	static void perfectOrNot(int n) {
		int sum=0;
		if(n==0) {
			System.out.println("it is not perfect no");
			

		}
		else {
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
			sum+=i;
			}
		
			
		}
		if(sum==n) {
			System.out.println("it is perfect no");
		}else {
			System.out.println("it is not perfect no");
		}
	}}
	public static void main(String[] args) {
		System.out.println("enter the no:");
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		perfectOrNot( n);
		x.close();
	}

}




/*

package com.DSAPrograms;

import java.util.Scanner;

public class FindPerfectOrNOT {
	
	public static void main(String[] args) {
		System.out.println("method started");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		boolean  a=getPerfectNo(n);
		if(a) {
			System.out.println("perfect");
		}
		else {
			System.out.println("not perfect ");
		}
	}

	private static boolean getPerfectNo(int n) {
		boolean s=false;
		int sum=0;
		int i=1;
		if(n==0) {
			return false;
			
		}
		while(i<=n/2) {

			if(n%i==0) {
				sum+=i;
			}
			i++;		
			
		}
		if(sum==n) {
			s= true;
		}
		
		
		return s;
	}
	
	
}
*/




























