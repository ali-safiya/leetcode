// Last updated: 26/07/2025, 22:36:39
class Solution {
    public char kthCharacter(int k) {
       
        return solve(0,(int) (Math.log(k) / Math.log(2)), "a").charAt(k-1);
    }

    String solve(int n,int noOfOpNeedsToBePerformed,  String word){

        if(n>noOfOpNeedsToBePerformed ){
            return word;
        }

        return solve(n+1,noOfOpNeedsToBePerformed, word+getNextWord(word));
    }

    String getNextWord(String word){

        String ans="";
        for(int i=0;i<word.length();i++){
            ans+=(char)(word.charAt(i)+1);
        }
        return ans;
    }
}