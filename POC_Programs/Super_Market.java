package com.POC_Programs;

import java.util.Scanner;

public class Super_Market {

	public static void main(String[] args) {


		int kg;
		String menu;
		String fruilt;
		double price=0;
		String vegies;
		String con;
		System.out.println("Welcome to the Super Market");
Scanner x=new Scanner(System.in);
do {
System.out.println("enter the menu want to do want like Fruits or vegetables");
 menu=x.next();
switch(menu) {

case "fruits" ->{System.out.println("enter the  fruit name :");
fruilt=x.next();

switch(fruilt) {
case "Apple"->{
	System.out.println("how mny kilos do u want of the apple");
	kg=x.nextInt();
	price+=kg*300;
}
case "mango"->{
	System.out.println("how mny kilos do u want of the mango");
	kg=x.nextInt();
	price+=kg*70;
}

case "pineApple"->{
	System.out.println("how mny kilos do u want of the pineApple");
	kg=x.nextInt();
	price+=kg*150;
}
}
}
case "Vegetables"->{
	System.out.println("enter the  vegetable name :");
	 vegies=x.next();
	 switch(vegies) {
	 case "patato"->{
			System.out.println("how mny kilos do u want of the patato");
			kg=x.nextInt();
			price+=kg*35;
	 }
	 case "tomato"->{
			System.out.println("how mny kilos do u want of the tomato");
			kg=x.nextInt();
			price+=kg*30;
	 }
	 case "mirchi"->{
			System.out.println("how mny kilos do u want of the mirchi");
			kg=x.nextInt();
			price+=kg*20;
	 }
	 }
}
default-> System.out.println("Invalid we don't have out of stock");
}


System.out.println("do u want to continue :");
 con=x.next();
}while(con.equalsIgnoreCase("yes"));
System.out.println("the total amount :"+price);
System.out.println("exit");
	}




	}


