package com.DSAPrograms;

public class FrequencyofEach_Digit {

	public static void main(String[] args) {

		
		int a[]= {2,7,2,3,2,8,7,3,2};
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {

			
			if(a[i]==a[j]) {
				count++;
			}
				
			}
			
			
		}
		System.out.println(count +"  ");
	}

}
