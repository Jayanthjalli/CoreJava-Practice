package com.DSAPrograms;
/*There is a programming language with only four operations and one variable X:

++X and X++ increments the value of the variable X by 1.
--X and X-- decrements the value of the variable X by 1.
Initially, the value of X is 0.

Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.

*/
public class Find_ValueOfVariableAfterOperator {
	    public static int finalValueAfterOperations(String[] operations) {
	        int sum=0;
	        for(int i=0;i<operations.length;i++){
	            String  temp=operations[i];
	if(temp.equals("X++")|| temp.equals("++X") ){
	    sum=sum+1;
	}
	else{
	        sum=sum-1;

	}
	        }
	return  sum;  }
	
	public static void main(String[] args) {

		String operations[] = {"--X","X++","X++"};
		System.out.println(finalValueAfterOperations( operations));
		
	}

}
