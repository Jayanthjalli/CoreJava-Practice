package com.DSAPrograms;
import java.util.*;
public class Encoded_String {
// test 1: 
	//s=3[a]2[bc]
	//output : aaabcbc
	
	// test 2: 
		//s=2[a3[c]]
		//output : acccaccc	

    public static String send(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        StringBuilder curr = new StringBuilder();
        int num = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }
            else if (ch == '[') {
                countStack.push(num);
                stringStack.push(curr);
                curr = new StringBuilder();
                num = 0;
            }
            else if (ch == ']') {
                int count = countStack.pop();
                StringBuilder prev = stringStack.pop();

                for (int i = 0; i < count; i++) {
                    prev.append(curr);
                }
                curr = prev;
            }
            else {
                curr.append(ch);
            }
        }

        return curr.toString();
    }

  
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the String : ");
String s=sc.nextLine();
System.out.println(send(s));



		
		
	}

}
