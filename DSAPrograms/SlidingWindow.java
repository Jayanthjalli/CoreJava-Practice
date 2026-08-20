package com.DSAPrograms;

public class SlidingWindow {

	public static void main(String[] args) {
		int a[]= {50,70,120,200,300,40,35,40};
		int days=3;
		int windowsSum=0;
		int avg=0;
		for(int i=0;i<days;i++) {
			windowsSum=windowsSum+a[i];
		}
		avg=windowsSum/days;
		System.out.println("First 3 days : Window Sum & avg"+windowsSum+" "+avg);
		for(int i=1;i<a.length-days;i++) {
			windowsSum=windowsSum-a[i-1]+a[i+days-1];
			avg=windowsSum/days;
			System.out.println("Window Sum  " +windowsSum+" "+avg);
		}
	}
}
