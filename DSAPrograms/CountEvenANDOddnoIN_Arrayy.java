
 package com.DSAPrograms;

import java.util.Scanner;

public class CountEvenANDOddnoIN_Arrayy {
static void  getCountOfEvenOrOdd(int ar[]) {
	
	int count=0;
	int count1=0;

	for(int i=0;i<ar.length;i++) {
		
		
		if(ar[i]%2==0) {
			count++;
			//System.out.println("even no :"+count);
	}
		else if(ar[i]%2==1) {
			count1++;
		}
		
		
		
		
	}
	System.out.println(" even count :"+count);
	System.out.println(" odd count :"+count1);


}
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the size  of the array :");
		int size=s.nextInt();
		int[] ar=new int[size];
		
		for(int i=0;i<ar.length;i++) {
			ar[i]=s.nextInt();
}
		int  sq=0;
			  getCountOfEvenOrOdd(ar);

 s.close();
	}

}



/*
package com.DSAPrograms;

import java.util.Scanner;

public class CountEvenANDOddnoIN_Arrayy {
	
	
	public static void main(String[] args) {
		int arr[]= {10,15,22,33,40,51};
		int count=0;
		int count1=0;

		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				count++;
			}
			else if(arr[i]%2==1) {
				count1++;
			}
			
		}
		System.out.println("even no :"+count);
		System.out.println("odd no :"+count1);

	}
}


*/