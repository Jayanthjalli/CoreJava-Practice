package com.DSAPrograms;

import java.util.Arrays;

public class MixTwoArrays {

	public static void main(String[] args) {
int a[]= {12,32,44,54,5};
int size=a.length;

int aw[]= {12,32,44,54,5};
int size1=aw.length;
int c[]= new int[size+size1];
for(int i=0;i<size;i++) {
	c[i]=a[i];
}
System.out.println(Arrays.toString(c));

for(int i=0;i<aw.length;i++) {
	c[size+i]=aw[i];
}
System.out.println(Arrays.toString(c));

	}

}
