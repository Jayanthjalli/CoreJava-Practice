package com.DSAPrograms;

public class FindMaxNoInStringPairs {
	//8 part 29/6/26
	/*You are given a 0-indexed array words consisting of distinct strings.

	The string words[i] can be paired with the string words[j] if:

	The string words[i] is equal to the reversed string of words[j].
	0 <= i < j < words.length.
	Return the maximum number of pairs that can be formed from the array words.

	Note that each string can belong in at most one pair.*/

       public static   String reverse(String temp1){
            String   rev="";
            for(int i=temp1.length()-1;i>=0;i--){
rev=rev+temp1.charAt(i);

            }
return rev;
        }
    public static int maximumNumberOfStringPairs(String[] words) {
        int count=0;
    
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                            String temp=words[i];
                                        String temp1=words[j];

    String re=reverse(temp1);
    if(re.equals(temp)){
        count++;
    }
}
            }
return count;
        }
    

	public static void main(String[] args) {
		String[] words = {"cd","ac","dc","ca","zz"};
		System.out.println(maximumNumberOfStringPairs(words));
		
	}

}
