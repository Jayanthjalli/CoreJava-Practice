/*

package com.VcubeDsa;

public class TwoPointerSum {
//bruteforce methodies   --- o(n2)
	public static void main(String[] args) {

		int a[]= {3,4,5,6,7,10,12,15};
		int target=15;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length-1;j++) {
				if(a[i]+a[j]==target) {
					System.out.println(i+"with of  "+ a[i]+"|   " +j+" with value of "+a[j]);
					
				}
			}
		}
		
	}

}

//output:
//0with of  3|   6 with value of 12
//2with of  5|   5 with value of 10

*/
/*
package com.VcubeDsa;

public class TwoPointerSum {
//bruteforce methodies         --- o(n2)
	public static void main(String[] args) {

		int a[]= {3,4,5,6,7,10,12,15};
		int target=15;
		boolean status=false;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length-1;j++) {
				if(a[i]+a[j]==target) {
					System.out.println(i+"  with of  "+ a[i]+"|   " +j+" with value of "+a[j]);
					status=true;
					
				}
			}
			if(status) {
				break;
			}
		}
		
	}

}

*/


package com.DSAPrograms;

public class TwoPointerSum {
//bruteforce methodies         --- o(n)
	public static void main(String[] args) {

		int a[]= {3,4,5,6,7,10,12,15};
		int target=15;
int start=0;
int end=a.length-1;
		while(start<end) {
			int sum=a[start]+a[end];
			if(sum==target) {
				
				System.out.println(start+" "+end);
				start++;
				end--;
			}
			else if(sum<target){
				start++;
			}
			else {
				end--;
			}
		}
		
	}
}
