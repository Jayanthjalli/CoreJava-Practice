package com.DSAPrograms;

public class Pattern9 {

		public static void main(String[] args) {
			int n1=5;
			for(int i=n1-1;i>=0;i--) {
				for(int j=0;j<n1-i-1;j++) {
					System.out.print(" ");
					
				}
				
				for(int k=0;k<2*i+1;k++) {
					if(i==n1-1 || k==0 || k==2*i) {
						
					System.out.print("*");}else {
						System.out.print(" ");

					}

				}
				System.out.println();
			}
			
		}

	}





/*




*********
 *     *
  *   *
   * *
    *

*/