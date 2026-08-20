/*

package com.DSAPrograms;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		System.out.println("enter the no :");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		boolean x = getArmstrong(a);

		if (x) {
			System.out.println("Armstrong ");
		} else {
			System.out.println("Not Armstrong ");
		}
	}

	private static boolean getArmstrong(int a) {
		boolean s = false;
		int rem;
		int sum = 0;
		int count = 0;

		int temp = a;
		int tem = a;

		while (a > 0) {
//			rem = a % 10;
			a = a / 10;
			count++;

		}
		System.out.println(count);
		while (temp > 0) {
			rem = temp % 10;
			temp = temp / 10;
			int a1 = (int) Math.pow(rem, count);
			sum += a1;
		}

		if (sum == tem) {
			return true;
		}
		return s;
	}

}


*/


/*
package com.DSAPrograms;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		System.out.println("enter the no :");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		boolean x = getArmstrong(a);

		if (x) {
			System.out.println("Armstrong ");
		} else {
			System.out.println("Not Armstrong ");
		}
	}

	
	private static boolean getArmstrong(int a) {
		boolean s = false;
		int rem;
		int sum = 0;

		int temp = a;
		int tem = a;
		String a1=Integer.toString(a);
		int count=a1.length();
		int s1;
if(temp==0) {
return false;
		}else {
		while (temp > 0) {
			rem = temp % 10;
			temp = temp / 10;
		int aa=power(rem,count);
		System.out.println(aa);
			sum+=aa;
			
		}
		
		System.out.println(sum);

		if (sum == tem) {
			return true;
		}}
		return s;
	}


	private static int power(int rem,int count) {
		 int res=1;
		for(int i=1;i<=count;i++) {
			res=res*rem;
		}
		return res;
		
		
	}

}
*/

package com.DSAPrograms;

import java.util.Scanner;

public class ArmStrong {
	
	
	static int  power(int n,int len){
		int res=1;
		for(int i=1;i<=len;i++) {
			
			res=res*n;
		}
		
		return res;
	}
	static void getArmStrong(int a) {
		String s=Integer.toString(a);
		int w=a;
		int len=s.length();
		int sum=0;
		int n=0;
		int re=0;
		for(int i=0;i<len;i++) {
			n=a%10;
			a=a/10;
			int rev=power(n,len);
			sum=sum+rev;
			

		}
		System.out.println(sum);
		if(w==sum) {
			System.out.println("arm");
		}else {
			System.out.println("notarm");
		}

	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println("enter the no :");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		
		getArmStrong(a);
		
	}
	
	
}
































