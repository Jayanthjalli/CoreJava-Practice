package com.DSAPrograms;
import java.util.Scanner;

public class Sum_Natural_No_and_reverseOrder {



	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no that u want to get the reverse from the strating 1 and sum of it :");
		int x=s.nextInt();
for(int i=x;i>0;i--) {
	System.out.println(i);
	
	
}
int sum=0;
for(int i=1;i<=x;i++) {
	sum=sum+i; //n*(n+1)/2  formula for n natural no's sum of it 
}
System.out.println("********************************************");
System.out.println(sum);
System.out.println("********************************************");

System.out.println("all Natural no to get sum the  formula  n*(n+1)/2 :"+(50*(50+1)/2));


	}

}
