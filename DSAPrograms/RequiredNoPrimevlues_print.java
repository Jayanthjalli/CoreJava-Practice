/*package com.DSAPrograms;

import java.util.Scanner;

public class RequiredNoPrimevlues_print {
	static void getPrime(int c) {
		for(int i=1;i<=c;i++) {
			int count=0;
		for(int j=1;j<=i;j++) {
			if(i%j==0) {
		count++;
		}
		}
			if(count==2) {
				System.out.print(i+" ");
				
			}
			}
	}
	public static void main(String[] args) {
System.out.println("enter the no to print the prime no's :");
Scanner s=new Scanner(System.in);
int c=s.nextInt();
getPrime(c);
	}

}
*/

package com.DSAPrograms;

import java.util.Scanner;

public class RequiredNoPrimevlues_print {
	static void getPrime(int c) {
	for(int i=2;i<=c;i++) {
		boolean result=true;
		for(int j=2;j*j<=i;j++) {
			if(i%j==0) {
				 result=false;
				break;
			}
		}
		if(result) {
			System.out.print(i+" ");
		}
	}
		
	}
		
		
		
		
		
		
		
		
		
		
	public static void main(String[] args) {
System.out.println("enter the no to print the prime no's :");
Scanner s=new Scanner(System.in);
int c=s.nextInt();
getPrime(c);
	}

}





/*


package com.DSAPrograms;

import java.util.Scanner;

public class Nth_prime_Or_Not {
static boolean prime(int d) {
	boolean d1=true;
	if(d==0 || d==1) {
	return false;	
	}
	for(int i=2;i<=d/2;i++) {
		if(d%i==0) {
			d1=false;
			break;
		
		}
	}
	return d1;
}
	public static void main(String[] args) {
		System.out.println("range no of prime values u want  :");
Scanner i1=new Scanner(System.in);
int d=i1.nextInt();
for(int i=0;i<=d;i++) {
	if(prime(i)) {
		System.out.println(i+" ");
	}
	
}
	}

}*/

