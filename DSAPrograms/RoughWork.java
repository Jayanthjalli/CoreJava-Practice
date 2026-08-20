/*
//Sum of the natural numbers of the given range

package com.DSAPrograms;
 

import java.util.Scanner;

public class RoughWork {
	static void method(int sumofNo) {
		int count=0;
	for(int i=1;i<=sumofNo;i++) {
		count+=i;
	}		System.out.println(count);

	
	}
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the no u want to sum of the range:");
	int sumofNo=s.nextInt();
	method(sumofNo);
	System.out.println((sumofNo*(sumofNo+1))/2);
	
	
	
}

}


*/


/*
// all prime no to print blw the given range
package com.Revision;
 

import java.util.Scanner;

public class RoughWork {
	static void method(int findFactor) {
			for(int i=1;i<findFactor;i++) {
				int count=0;

				for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;}}
					if(count==2) {
						System.out.println(i +"no is  ");
					}
				
				
			}
	}
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("how many    no u want toma:");
	int findFactor=s.nextInt();
	method(findFactor);
	
	
	
}

}

*/

/*



//given no place of the prime no to print it
package com.Revision;
 

import java.util.Scanner;

public class RoughWork {
	static void method(int findFactor,int placePrime) {
		int count1=0;

			for(int i=1;i<findFactor;i++) {
				int count=0;

				for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
					}}
					if(count==2) {
						count1++;
						System.out.println(i +"no is  ");
						if(placePrime==count1) {
							System.out.println(i +" ");

						}
					}
			}
			
	}
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("how many    no u want toma:");
	int findFactor=s.nextInt();
	System.out.println("which you want to get it the place of it :");
	int placePrime=s.nextInt();

	method(findFactor,placePrime);
	
	
	
}

}

*/

/*
//  21/7/26    . Print the first N prime numbers
package com.Revision;
 

import java.util.Scanner;

public class RoughWork {
	static void method(int findFactor,int NoOfPrime) {
		int count1=0;

			for(int i=1;i<findFactor;i++) {
				int count=0;

				for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
					}}
					if(count==2) {
						System.out.print (i +" ");

						count1++;
						if(NoOfPrime ==count1) {
                            return;
						}
					}
			}
			
	}
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter how much range :");
	int findFactor=s.nextInt();
	System.out.println("how many values to print from given range of prime no :" );
	int NoOfPrime=s.nextInt();

	method(findFactor,NoOfPrime);
	
	
	
}

}
*/

/*
// Count the number of prime numbers in a range
package com.Revision;
 

import java.util.Scanner;

public class RoughWork {
	static void method(int findFactor,int NoOfPrime) {
		int count1=0;

			for(int i=findFactor;i<NoOfPrime;i++) {
				int count=0;

				for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
					}}
					if(count==2) {
						System.out.print (i +" ");

						count1++;
						if(NoOfPrime ==count1) {
                            return;
						}
					}
			}
			System.out.println("total no of prime no of the given range "+count1);
			
			
			
	}
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter how start point  range :");
	int startPoint=s.nextInt();
	System.out.println("enter how end point  range :" );
	int endPoint=s.nextInt();

	method(startPoint,endPoint);
	
	
	
}

}

*/

/*
// Find the largest prime number in a range

package com.Revision;
 

import java.util.Scanner;

public class RoughWork {
	static void method(int findFactor,int NoOfPrime) {
		int count1=0;
int max=0;
int temp=0;
			for(int i=findFactor;i<NoOfPrime;i++) {
				int count=0;

				for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
					}}
					if(count==2) {
						System.out.print (i +" ");
						max=i;
						temp=i;
						if(max>temp) {
							max=temp;
						}
						
						count1++;
						if(NoOfPrime ==count1) {
                            return;
						}
					}
			}
			System.out.println("Maximum  prime no of the given range "+max);
			
			
			
	}
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter how start point  range :");
	int startPoint=s.nextInt();
	System.out.println("enter how end point  range :" );
	int endPoint=s.nextInt();

	method(startPoint,endPoint);
	
	
	
}

}

*/


/*
//Find the smallest prime number in a range

package com.Revision;


import java.util.Scanner;

public class RoughWork {
	static void method(int findFactor,int NoOfPrime) {
		int count1=0;
int min=0;
int temp=0;
			for(int i=findFactor;i<NoOfPrime;i++) {
				int count=0;

				for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
					}}
					if(count==2) {
						System.out.print (i +" ");
					
						
						
						count1++;
					if(count1==1) {
						min=i;

					}
						if(NoOfPrime ==count1) {
                         return;
						}
					}
			}
			if(min>0) {
			System.out.println("minimum  prime no of the given range "+min);
			
			}else {
				System.out.println("prime num not found ");

			}
			
	}
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter how start point  range :");
	int startPoint=s.nextInt();
	System.out.println("enter how end point  range :" );
	int endPoint=s.nextInt();

	method(startPoint,endPoint);
	
	
	
}

}

*/


/*
// Sum of prime numbers in a range


package com.Revision;


import java.util.Scanner;

public class RoughWork {
	static void method(int findFactor,int NoOfPrime) {
		int count1=0;
int sum=0;
			for(int i=findFactor;i<NoOfPrime;i++) {
				int count=0;

				for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
					}}
					if(count==2) {
						System.out.print (i +" ");
					
						sum+=i;
						
						count1++;
					
						if(NoOfPrime ==count1) {
							
                         return;
						}
					}
			}
			System.out.println("sum of all  prime no of the given range "+sum);
			
			
			
	}
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter how start point  range :");
	int startPoint=s.nextInt();
	System.out.println("enter how end point  range :" );
	int endPoint=s.nextInt();

	method(startPoint,endPoint);
	
	
	
}

}

*/

/*

 //Average of prime numbers in a range

package com.Revision;


import java.util.Scanner;

public class RoughWork {
	static void method(int findFactor,int NoOfPrime) {
		int count1=0;
int sum=0;
double avg=0.0;
			for(int i=findFactor;i<NoOfPrime;i++) {
				int count=0;

				for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
					}}
					if(count==2) {
						System.out.print (i +" ");
					
						sum+=i;
						
						count1++;
					
						if(NoOfPrime ==count1) {
							
                         return;
						}
					}
			}
			avg=((double)sum/(double)count1);
			System.out.println("sum of all  prime no of the given range "+avg);
			
			
			
	}
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter how start point  range :");
	int startPoint=s.nextInt();
	System.out.println("enter how end point  range :" );
	int endPoint=s.nextInt();

	method(startPoint,endPoint);
	
	
	
}

}
*/


/*
// Reverse a number and check whether it is prime




package com.Revision;


import java.util.Scanner;


public class RoughWork {
	static void method(int findFactor) {
		int count=0;

			for(int i=1;i<=findFactor;i++) {

				if(findFactor%i==0) {
					count++;
					}
					
			}
			if(count==2) {
				System.out.println(" prime");
			
			}else {
				System.out.println(" not prime");
	
			}
			
	}
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter how start point  range :");
	int startPoint=s.nextInt();
	String sum="";
	while(startPoint >0) {
		 int num=startPoint%10;
		sum+=num;
		startPoint=startPoint/10;
	}
	
	int n = Integer.parseInt(sum);
System.out.println(n);
	method(n);
	
	
	
}

}

*/



/*
//  Check whether a number is an Emirp number


package com.Revision;


import java.util.Scanner;


public class RoughWork {
	static void method(int reverseNo,int startPoint) {
		int count=0;
		int count1=0;

		for(int i=1;i<=reverseNo;i++) {
			if(reverseNo%i==0) {
				count++;
			}
			
		}
			
		for(int i=1;i<=startPoint;i++) {
						 if(startPoint%i==0) {
				count1++;
			}
		}
		
			if(count==2 && count1==2) {
				System.out.println("emripe no ");
				
			}
			else {
		System.out.println("not emripe no");
			}
			
			
			
	}
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter how start point  range :");
	int startPoint=s.nextInt();
    int original = startPoint;

	String sum="";
	while(startPoint >0) {
		 int num=startPoint%10;
		sum+=num;
		startPoint=startPoint/10;
	}
	
	int reverseNo = Integer.parseInt(sum);
System.out.println(reverseNo);
	method(reverseNo,original);
	
	
	
	
}

}

*/

/*
 Two prime numbers are called Twin Primes if their difference is 2.
package com.DSAPrograms;
import java.util.Scanner;

public class RoughWork {

    static boolean isPrime(int n) {
        
    if(n<2) {
    	return false;
    	
    }
    int count=0;
    for(int i=1;i<=n;i++) {
    	if(n%i==0) {
    		count++;
    	}
    }
    
   return count==2;
    
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();
 

        if (isPrime(a) && isPrime(a) && Math.abs(a-b)==2) {
            System.out.println("Twin Prime");
        } else {
            System.out.println("Not Twin Prime");
        }
//&& isPrime(b) && Math.abs(a - b) == 2
        sc.close();
    }
} 

*/



/*
//A Circular Prime is a prime number for which every rotation of its digits is also prime.

package com.DSAPrograms;
import java.util.Arrays;
import java.util.Scanner;


 class RoughWork {

    static Scanner c = new Scanner(System.in);

    void circularPrime(int a) {

        int a1 = a;
        int count = 0;

        // Count digits
        while (a > 0) {
            a /= 10;
            count++;
        }

        // Store digits in array
        int temp[] = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            temp[i] = a1 % 10;
            a1 /= 10;
        }
        

        System.out.println("Digits: " + Arrays.toString(temp));

        // Check every rotation
        for (int i = 0; i < count; i++) {

            int num = arrayToNumber(temp);

            System.out.println("Rotation " + (i + 1) + " : " + num);

            if (!isPrime(num)) {
                System.out.println(num + " is not Prime");
                System.out.println("Not a Circular Prime");
                return;
            }

            // Rotate array by one position
            rotate(temp);
        }

        System.out.println("Circular Prime");
    }

    // Rotate array left by one position
    void rotate(int temp[]) {

        int first = temp[0];

        for (int i = 0; i < temp.length - 1; i++) {
            temp[i] = temp[i + 1];
        }

        temp[temp.length - 1] = first;
    }

    // Convert array into number
    int arrayToNumber(int temp[]) {

        int num = 0;

        for (int i = 0; i < temp.length; i++) {
            num = num * 10 + temp[i];
        }

        return num;
    }

    // Prime checking
    boolean isPrime(int n) {

        if (n < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        RoughWork obj = new RoughWork();

        System.out.print("Enter the number: ");
        int a = c.nextInt();

        obj.circularPrime(a);
    }
}


*/


//perfect no 

/*
 * 1.Check whether a given number is a Perfect Number.

3.Print all Perfect Numbers in a given range.
4.Count Perfect Numbers in a given range.
5.Find the sum of all Perfect Numbers in a range.
6.Find the first N Perfect Numbers.
7.Check a Perfect Number using recursion.
8.Write an optimized Perfect Number program using √n complexity.
9.Find the next Perfect Number after a given number.
10.Find the largest Perfect Number in a range.
11.Check whether two numbers are both Perfect Numbers.

 */

/*

 //1.Check whether a given number is a Perfect Number.


package com.DSAPrograms;
import java.util.Arrays;
import java.util.Scanner;


 class RoughWork {
	 static boolean tocheckPerfectNo(int a) {
		 boolean status=false;
		 int sum=0;
		 for(int i=1;i<a;i++) {
			 if(a%i==0) {
				 sum+=i;
			 }
			 
		 }
		 if(sum==a) {
			 status= true;
		 }
		 return status;
	 }
	 
	 public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter the no to check wheather the no is perfect or not ");
		 int a=s.nextInt();
		 if(tocheckPerfectNo(a)) {
			 System.out.println("the given no is perfect no");
		 }else {
			 System.out.println(" not  perfect no");

		 }
		 
	 }
	}
	 
 */

//3.Print all Perfect Numbers in a given range.
package com.DSAPrograms;
import java.util.Arrays;
import java.util.Scanner;


 class RoughWork {
	 static void tocheckPerfectNo(int a) {
		 for(int j=1;j<=a;j++) {
			 int temp=0;

			 int sum=0;

		 for(int i=1;i<j;i++) {
			 if(j%i==0) {
				 sum+=i;
			 }
						 
		 } if(sum==j) {
				temp=j; 
				 
			 }
			System.out.println(temp);

}
	 }
	 
	 public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 System.out.println("the range  to print the  perfect no is : ");
		 int a=s.nextInt();
		 tocheckPerfectNo(a);
			
		 s.close();
	 }
	}


