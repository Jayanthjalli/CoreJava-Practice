package com.DSAPrograms;

import java.util.Scanner;

public class CountOftheGivenStringWords {
	
	static void getCount(String name) {
		
		int count=1;
		for(int i=0;i<name.length();i++)
	{         char s=name.charAt(i);
		if(s==' ') {
			count++;
			
		}
			
			}
		System.out.println(count);
	}
		public static void main(String[] args) {
	System.out.println("enter the string :");
	Scanner s=new Scanner(System.in);
	String name=s.nextLine();

	getCount(name);
		}

	}
