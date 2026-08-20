package com.DSAPrograms;

import java.util.Scanner;

public class Given_String_Reverse_Of_it {
static void getReverse(String name) {
	String m="";
	for(int i=name.length()-1;i>=0;i--) {
		char d=name.charAt(i);
		m=m+d;
	}
	System.out.println(m);
	
}
	public static void main(String[] args) {
		System.out.println("enter the string :");
		Scanner s=new Scanner(System.in);
		String name=s.nextLine();
		getReverse(name);
		s.close();
	}

}
