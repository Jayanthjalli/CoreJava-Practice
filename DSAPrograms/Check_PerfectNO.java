/*
  package com.Prepare;


import java.util.Scanner;

public class Se {
static int m1(int a) {
	int sum=0;
for(int i=1;i<a;i++) {
	if(a%i==0) {
		sum+=i;
	}
	
}
return sum ;
	

}
// to perfect no 
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the no :");
		int a=s.nextInt();
		 int a1= m1(a);
		 if(a==a1) {
			 System.out.println("perfect no");
		 }
		 else {
			 System.out.println("non-perfect no");

		 }
	}
	

}

 */


/*
//All perfect no of given range : 
package com.Prepare;


import java.util.Scanner;

public class Se {
static void m1(int a) {
for(int i=1;i<=a;i++) {
	int sum=0;

	for(int j=1;j<i;j++) {

	if(i%j==0) {
		sum+=j;
	}
	}
	 if(i==sum) {
		System.out.print(i+" ");
	
	
	}}
	

}
// to perfect no 
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the no :");
		int a=s.nextInt();
		System.out.println("All perfect no of given range : ");
		 m1(a);
		s.close();
	}
	

}

*/


/*
//nth perfect no
package com.Prepare;


import java.util.Scanner;

public class Se {
static void m1(int a,int a1) {
	int count=0;
	int temp=0;
for(int i=1;i<=a;i++) {
	int sum=0;

	for(int j=1;j<i;j++) {

	if(i%j==0) {
		sum+=j;
	}
	}
	
	 if(i==sum) {
		
		 count++;

	
	}

if(a1==count) {
	System.out.print(i+" ");
	return;
	
}

	
	
}

System.out.println("not found given position");

	

}
// to perfect no 
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the range no :");
		int a=s.nextInt();
		System.out.println("enter the place of perfect no u want  :");
		int a1=s.nextInt();
		 m1(a,a1);
		s.close();
	}
	

}

*/



// the given no of the perfect no all, to print it

package com.DSAPrograms;


import java.util.Scanner;

public class Check_PerfectNO {
static void m1(int a,int a1) {
	int count=0;
	int temp=0;
for(int i=1;i<=a;i++) {
	int sum=0;

	for(int j=1;j<i;j++) {

	if(i%j==0) {
		sum+=j;
	}
	}
	
	 if(i==sum) {
		System.out.print(i+" ");
			 count++;
			 if(count==a1) {
				 return;
			 }

	}
	 
	 


	
	
}


	

}
// to perfect no 
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the range no :");
		int a=s.nextInt();
		System.out.println("enter the no of  perfect no u want to print here :");
		int a1=s.nextInt();
		 m1(a,a1);
		s.close();
		
	}
	

}




