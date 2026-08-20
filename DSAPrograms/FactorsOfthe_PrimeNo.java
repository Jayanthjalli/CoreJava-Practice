package com.DSAPrograms;
import java.util.*;
public class FactorsOfthe_PrimeNo {
	//1.primeFactor 
	static void getPrimeFactor(int q) {
		
		for(int i=1;i<=q;i++) {
			int count=0;

			if(q%i==0) {
			

				for(int j=1;j<=i;j++) {

					if(i%j==0) {
						count++;
						
					}}
					if(count==2) {
						System.out.println(i);
					}
				}
			}
		
	}
				
				
			
			
	
		
	
	
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
		System.out.println("enter the no (primefactor) :");
		int w=s.nextInt();
		getPrimeFactor(w);
	


s.close();
		}}