package com.POC_Programs;

import java.util.Scanner;

public class Food_Restaraunt {



    public static void main(String[] args) {

        System.out.println("welcome to our Restaraunt");
        String menu;
        String vegMenu;
        String non_vegDetails;
        int quantity;
        double price = 0;
        String con;

        System.out.println("Welcome to the Super Restarunt");

        Scanner x = new Scanner(System.in);

        do {
            System.out.println("enter the menu");
            
            menu = x.nextLine();

            switch (menu) {

                case "veg" -> {
                    System.out.println("enter the order veg details:");
                    vegMenu = x.nextLine();

                    switch (vegMenu) {

                        case "lemon rice" -> {
                            System.out.println("select the quantity of lemon rice:");
                            quantity = x.nextInt();
                            x.nextLine();
                            price += quantity * 220;
                        }

                        case "curd rice" -> {
                            System.out.println("select the quantity of curd rice:");
                            quantity = x.nextInt();
                            x.nextLine();
                            price += quantity * 150;
                        }

                        case "tomato rice" -> {
                            System.out.println("select the quantity of tomato rice:");
                            quantity = x.nextInt();
                           x.nextLine();
                            price += quantity * 100;
                        }

                        case "Meals" -> {
                            System.out.println("select the quantity of meals rice:");
                            quantity = x.nextInt();
                            x.nextLine();
                            price += quantity * 90;
                        }
                    }
                }

                case "non-veg" -> {
                    System.out.println("enter the non-veg details ");
                    non_vegDetails = x.nextLine();

                    switch (non_vegDetails) {

                        case "Mutton-biriyani" -> {
                            System.out.println("select the quantity of mutton biriyani");
                            quantity = x.nextInt();
                            x.nextLine();
                            price += quantity * 390;
                        }

                        case "chicken-biriyani" -> {
                            System.out.println("select the quantity of chicken biriyani");
                            quantity = x.nextInt();
                           x.nextLine();
                            price += quantity * 300;
                        }

                        case "prawn-biriyani" -> {
                            System.out.println("select the quantity of prawn biriyani");
                            quantity = x.nextInt();
                            x.nextLine();
                            price += quantity * 300;
                        }
                    }
                }

                default -> {
                    System.out.println("there is only food in the restaraunt no tiffins");
                }
            }

            System.out.println("do u want to order something again :");
            
            con = x.next();
            x.nextLine();

        } while (con.equalsIgnoreCase("yes"));

        if(price>1000) {
        	double discount=(price*2)/100;
        	price=price-discount;
            System.out.println("Total Bill = " + price);

        	
        }else {
            System.out.println("Total Bill = " + price);

        }
        
        System.out.println("thank for visiting");

        x.close();
    }
}
