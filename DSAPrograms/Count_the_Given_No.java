//-------------------------- 1 question  of the first day

/*package com.DSAPrograms;

public class Count_the_Given_No {
// in the given list ,the reqired no which no is repeating how many times, like the count of the given no
	public static void main(String[] args) {
int arr[]= {12,34,55,12,33,45,55,34,12,55,45,65,12,23,34};
int count=0;

for(int i=0;i<arr.length;i++) {
	if(arr[i]==12) {
		count++;//count=count+1;
	}
}
System.out.println("count of the given no is :"+count);

}
}
*/


//-------------------------- 2 question


/*
package com.DSAPrograms;

public class Count_the_Given_No {
// in the given list ,the how many  no which no is divisble by 3 ,then print it and total no  count of their divisble no ,
	public static void main(String[] args) {
int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
int count=0;

for(int i=0;i<arr.length;i++) {
	if(arr[i]%3==0) {
		System.out.printf(" the given no %d is divisible by 3",arr[i]);
		System.out.println();
		count++;
	}
	
}
System.out.println("count of the  no's are divisible by 3 is :"+count+" members in the list");

}
}*/


//-------------------------- 3 question

/*
package com.DSAPrograms;

public class Count_the_Given_No {
// in the given list ,the how many  no which no is divisble by 3 or 2 ,then print it and total no  count of their divisble no ,
	public static void main(String[] args) {
int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
int count=0;

for(int i=0;i<arr.length;i++) {
	/*if(arr[i]%3==0) {
		System.out.printf(" the given no %d is divisible by 3",arr[i]);
		System.out.println();
		count++;
	}
	else if(arr[i]%2==0) {
		System.out.printf(" the given no %d is divisible by 2",arr[i]);
		System.out.println();

		count++;

	}
//  ------------------------ or  -----------------------------     
	if(arr[i]%3==0 || arr[i]%2==0) {
		System.out.printf(" the given no %d is divisible by 3",arr[i]);
		System.out.println();
		count++;
	}
	
//-----------------------------------------------------------	
	
	
}

System.out.println("count of the  no's are divisible by 3 or 2 is :"+count+" members in the list");

}
}*/




//-------------------------- 4 question

package com.DSAPrograms;

public class Count_the_Given_No {
// in the given list ,the how many  no which no is divisble by 3 and 2 ,then print it and total no  count of their divisble no ,
	public static void main(String[] args) {
int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
int count=0;

for(int i=0;i<arr.length;i++) {
	
	
     
	if(arr[i]%3==0 && arr[i]%2==0) {
		System.out.printf(" the given no %d is divisible (2 and 3)",arr[i]);
		System.out.println();
		count++;
	}
	
	
	
	
}

System.out.println("count of the  no's are divisible by both ( 3 and  2 ) is :"+count+" members in the list");

}
}





