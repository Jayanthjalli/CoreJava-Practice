// second day
/*                      1 question                   reverse the string
package com.DSAPrograms;

public class Reverse_String {

	public static void main(String[] args) {
String s="hai iam good";//iah
String answer="";
for(int i=s.length()-1;i>=0;i--) {
	 answer=answer+s.charAt(i);
}
System.out.print(answer);

	}

}
*/

// 2 questions                        given string is  palindrome or not   (way 1)
/*
package com.DSAPrograms;

public class Reverse_String {

	public static void main(String[] args) {
String s="aba";//
String new1 ="";
for(int i=s.length()-1;i>=0;i--) {
	new1 =new1 +s.charAt(i);
}
System.out.println(new1 );
if(s.equals(new1)) {
	System.out.println("it is pandrome");
	
}
else {
	System.out.println("not palindrome");
}

	}

}
*/

// 2 questions                        given string is  palindrome or not   (way 2)
/*

package com.DSAPrograms;

public class Reverse_String {

	public static void main(String[] args) {
		String s="abcqwcba";
		int n=s.length();
		boolean isPalindrome=true;
		for(int i=0;i<n/2;i++) {
			System.out.println(i);
			if(s.charAt(i)!=s.charAt(n-i-1)) {
				isPalindrome=false;
				break;
			}
			
		}
		if(isPalindrome) {
			System.out.println("it is  palindrome");

		}
			else {
				System.out.println("it is not palindrome");
			}
			
		}
	}
	*/

