package com.DSAPrograms;
/*A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

You are given an array of strings sentences, where each sentences[i] represents a single sentence.

Return the maximum number of words that appear in a single sentence.*/


public class Given_ArrayOfStringHigh_WordCount {
	    public static int mostWordsFound(String[] sentences) {
	        int ans=0;
	        for(int i=0;i<sentences.length;i++){
	            int temp=1;
	            String s=sentences[i];
	                    for(int j=0;j<s.length();j++){
	                        if(s.charAt(j)==' '){
	                            temp++;
	                        }
	                    }
	                      ans=Math.max(ans,temp);
	                    }
	                    return ans;
	    }



	        
	    
	
	public static void main(String[] args) {
		String sentences[] = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};

		System.out.println(mostWordsFound(sentences));
	}

}
