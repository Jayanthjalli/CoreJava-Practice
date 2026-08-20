package com.DSAPrograms;

public class Jewels_andStones {
	/*You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

	Letters are case sensitive, so "a" is considered a different type of stone from "A".
*/
	
	    public static int numJewelsInStones(String jewels, String stones) {
	        int count=0;
	        for(int i=0;i<stones.length();i++){
	            char ch=stones.charAt(i);
	            boolean found=false;
	            for(int j=0;j<jewels.length();j++){
	                            char ch1=jewels.charAt(j);
	                            if(ch==ch1){
	                                found=true;
	                                break;

	                            }
	                           
	            }
	            if(found==true){
	count=count+1;
	            }
	            
	            }
	            
	            return count;
	        }

	    

public static void main(String[] args) {
	String jewels = "aA", stones = "aAAbbbb";
	System.out.println(numJewelsInStones( jewels,  stones));

}
}
