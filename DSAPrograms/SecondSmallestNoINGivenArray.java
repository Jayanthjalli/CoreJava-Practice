/*package com.DSAPrograms;

import java.util.Arrays;

public class SecondSmallestNoINGivenArray {

	public static void main(String[] args) {
int ar[]= {10,20,30,5,4};
int min=ar[0];
for(int i=1;i<ar.length;i++) {
	int temp;
	int r;
	if(ar[i]<min) {
		temp=ar[i];
		ar[i]=min;
		min=temp;
		
	
		
	}
	
}
System.out.println(min);
	}

}*/
package com.DSAPrograms;

import java.util.Arrays;

public class SecondSmallestNoINGivenArray {

	public static void main(String[] args) {
		
		int ar[]= {10,20,30,5,4};
		int temp;
for(int i=0;i<ar.length-1;i++) {
	for(int j=0;j<ar.length-1-i;j++) {
		if(ar[j]>ar[j+1]) {
			temp=ar[j];
			ar[j]=ar[j+1];
			ar[j+1]=temp;
			
		}
		
		
		
	}
	
}
System.out.println(Arrays.toString(ar));
System.out.println(ar[1]);
	}
	}
