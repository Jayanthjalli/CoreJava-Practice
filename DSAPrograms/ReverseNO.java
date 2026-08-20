package com.DSAPrograms;

import java.util.Scanner;

public class ReverseNO {
/*static void getReverse(int a){
	int rev=0;
    while( a>0) {
		int y=a%10;
		 a=a/10;
		 
		 rev=rev*10+y;

	}
    System.out.println(rev);
	
}
	public static void main(String[] args) {

		System.out.println("enter the no :");
		Scanner s=new Scanner(System.in);
int a=s.nextInt();
getReverse(a);
	}

}
	*/
	static void getReverse(int w){
		int rev=0;
		for(;w>0;) {
			int q=w%10;
			w=w/10;
			rev=rev*10+q;
			
			
		}
		System.out.println(rev);
	}
	
	public static void main(String[] args) {
		
		System.out.println("enter the no :");
		Scanner e=new Scanner(System.in);
		int w=e.nextInt();
		getReverse(w);
	}
	}