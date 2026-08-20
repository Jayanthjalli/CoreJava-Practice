package com.DSAPrograms;

import java.util.Scanner;

public class GivenLetterCount_InGivenString {
static void getCount(String name,char s1) {
	int count=0;
	for(int i=0;i<name.length();i++) {
		char d=name.charAt(i);
		if(s1==d) {
			count++;
		}
		
		
	}
	System.out.println(count);
	
	
}
	public static void main(String[] args) {
		System.out.println("enter the string :");
		Scanner s=new Scanner(System.in);
		String name=s.nextLine();
char s1=s.next().charAt(0);
		getCount(name,s1);
		
		s.close();
	}

}
