package com.DSAPrograms;
/*Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

*/
import java.util.Scanner;

public class Defanging_String {
	 public static String defangIPaddr(String address) {
         char temp;
                 String temp1="";

        for(int i=0;i<address.length();i++){
             temp=address.charAt(i);
            if(temp=='.'){
          temp1=temp1+"[.]";
            }
            else{
            temp1=temp1+temp;     
            }}
            return temp1;
        }
	public static void main(String[] args) {
String address="1.1.1.1";		
		System.out.println(defangIPaddr( address));
		   
		    
		
	}

}
