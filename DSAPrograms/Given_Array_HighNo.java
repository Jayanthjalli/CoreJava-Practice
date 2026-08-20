/*package com.DSAPrograms;

public class Given_Array_HighNo {
//given array of the data to find the highest no in the following.  (1 way)
	public static void main(String[] args) {
		int a[]= {5,8,10,11,50,15,200,25};

		int high=0;
for(int i=0;i<a.length;i++) {
	if(a[i]>high) {
		high=a[i];
	}
	
	
}
System.out.println(high);
	}

}*/



package com.DSAPrograms;

public class Given_Array_HighNo {
//given array of the data to find the highest no and minimum value  in the following.  (2 way)
	public static void main(String[] args) {
		int a[]= {51,8,10,11,50,615,200,25};
int less=a[0];
		int high=0;
for(int i=0;i<a.length;i++) {
high=Math.max(a[i], high);

less=Math.min(a[i], less);

}
System.out.println(high);
System.out.println("less no of the following"+less);

	}

}
