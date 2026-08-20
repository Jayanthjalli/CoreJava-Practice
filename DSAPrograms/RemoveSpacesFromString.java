package com.DSAPrograms;

import java.util.Scanner;

public class RemoveSpacesFromString {
static void getRemove(String name) {
	System.out.println(name.trim());
	
}
	public static void main(String[] args) {

		System.out.println("enter the string :");
		Scanner s=new Scanner(System.in);
		String name=s.nextLine();
		getRemove(name);
		
		s.close();
	}

}
