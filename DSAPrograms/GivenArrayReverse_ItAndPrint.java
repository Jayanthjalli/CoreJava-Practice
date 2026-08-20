/*
      
      package com.DSAPrograms;
 

import java.util.Scanner;

public class GivenArrayReverse_ItAndPrint {
static void getReverse(int p[]) {
	int rev;
	int r=0;
	int i=0;
	int num=p[i];

	while(num!=0) {

rev=num%10;
num=num/10;
		//r=r+rev;
r=r*10+rev;

	}System.out.println(r);

}
	public static void main(String[] args) {

		int arr[]= {1234};
		getReverse(arr);
		}
		
	}


*/




 package com.DSAPrograms;
 

import java.util.Scanner;

public class GivenArrayReverse_ItAndPrint {
	static void getCount(int a[],int q) {
		int count=0;

		for(int i=0;i<a.length;i++) {
			int re=0;

			int e=a[i];

			while(e!=0) {

				re=e%10;
				if(q==re) {
				count++;	
				}
				e=e/10;

			}

		}
		System.out.println(count);

	}
	public static void main(String[] args) {
		System.out.println("enter the no :");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			 a[i]=s.nextInt();
			
			
		}
		System.out.println("enter the no u want : ");
		int q=s.nextInt();
		
		getCount(a,q);
	}
}
