package com.DSAPrograms;

public class Score_of_String {

	public static void main(String[] args) {
System.out.println('a'-'b');
int a='s';
int a1='d';
System.out.println(a-a1);
System.out.println("a"+'b');//ab
System.out.println('a'+'t');
System.out.println('s');//s
int temp='c'-'d';
if(temp<0) {
	temp=temp*-1;
	
System.out.println(temp);	
}

//////////////////or ///////////
System.out.println(Math.abs(-78));//78
String s="hello";
int a2;
int b;
int diff;
int dif;

int add=0;
for(int i=0;i<s.length()-1;i++) {
 a2=i;
 b=i+1;
 char first=s.charAt(a2);
 char second=s.charAt(b);

 diff=first-second;
 dif=Math.abs(diff);
 add=add+dif;
 }
System.out.println(" "+add);                           // a2=0 b=1  diff=-1   dif=1  add=1 





	
	}

}
