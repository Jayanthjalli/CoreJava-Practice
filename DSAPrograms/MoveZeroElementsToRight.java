package com.DSAPrograms;

import java.util.Arrays;

public class MoveZeroElementsToRight {
//[10,0,20,0,30,40]
	// output [10,20,30,40,0,0]
	public static void main(String[] args) {
int arr[]= {10,0,20,0,30,40,0,80,0,90};
int index=0;
for(int i=0;i<arr.length;i++) {
	if(arr[i]!=0) {
			arr[index++]=arr[i];
		
		
	}
	
}
// Fill remaining positions with zeros
while (index < arr.length) {
    arr[index] = 0;
    index++;
}

System.out.println(Arrays.toString(arr));
	}

}
