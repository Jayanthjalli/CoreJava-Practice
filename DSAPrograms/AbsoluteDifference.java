package com.DSAPrograms;

import java.util.Arrays;

public class AbsoluteDifference {


	public static void main(String[] args) {

	int ar[]={1,5,3,19,18,25};
	divide(ar);
		
	System.out.println(Arrays.toString(ar));
	

    int minDiff = Integer.MAX_VALUE;
    int a = 0, b = 0;

    for (int i = 0; i < ar.length - 1; i++) {
        int diff = Math.abs(ar[i] - ar[i + 1]);

        if (diff < minDiff) {
            minDiff = diff;
            a = ar[i];
            b = ar[i + 1];
        }
    }

    System.out.println("Pair: " + a + ", " + b);
    System.out.println("Minimum absolute difference: " + minDiff);
}
	

	
	static void divide(int ar[]) {
		int i=0;
		if(ar.length<=1) {
			return;
			
		}
		
		int left[]=new int[ar.length/2];
		int right[]=new int[ar.length-left.length];
for(i=0;i<left.length;i++) {
	
	left[i]=ar[i];
}
for(int j=0;j<right.length;j++) {
	
	right[j]=ar[i++];
}

		
		divide(left);
		System.out.println("left"+Arrays.toString(left));
		divide(right);
		System.out.println("right"+Arrays.toString(right));

		
merge(ar,left,right);
	}
	static void merge(int ar[],int left[],int right[]) {
		int j=0;
		int i=0;
		int k=0;
		while(i<left.length && j<right.length) {
			if(left[i]<right[j]) {
				ar[k++]=left[i++];
			}
			else {
				ar[k++]=right[j++];

			}
		}
		
		while(i<left.length) {
			ar[k++]=left[i++];
			
		}
		while(j<right.length) {
			ar[k++]=right[j++];
			
		}
		
		
	}

}

