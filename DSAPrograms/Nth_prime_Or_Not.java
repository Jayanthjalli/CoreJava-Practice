package com.DSAPrograms;

import java.util.Scanner;

public class Nth_prime_Or_Not {

    static boolean prime(int d) {

        boolean d1 = true;

        if (d == 0 || d == 1) {
            return false;
        }

        for (int i = 2; i < d; i++) {
            if (d % i == 0) {
                d1 = false;
                break;
            }
        }

        return d1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the position u want to get the    prime  no : ");
        int w = sc.nextInt();

        int count = 0;

        for (int i = 2; ; i++) {   // Infinite for loop

            if (prime(i)) {
                count++;

                if (count == w) {
                    System.out.println("The " + w + "th prime number is: " + i);
                    break;
                }
            }
        }

        sc.close();
    }
}






/*
package com.Revision;

import java.util.Scanner;

public class Whileloop {
static boolean prime(int n) {
	boolean e=true;
	if(n==0 || n==1) {
		return false;
	}
	int i=2;
	while(i<n) {
		
		if(n%i==0) {
			e=false;
		}
		i++;
	}
	
	
	
	
	
	return e;
}
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no :");
		int n=s.nextInt();
		int i=2;
		int count=0;
		while(true) {
			if(prime(i)) {
count++;
if(count==n) {
	System.out.println(n+" position is  having value is : "+i);
	
}
}
			i++;
		}
	}

}
*/