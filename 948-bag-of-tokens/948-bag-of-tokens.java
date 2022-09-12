class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        
        Arrays.sort(tokens);
        
        
        int i=0;
        int j=tokens.length-1;
        int score =0;
        int ans=0;
        while(i<=j && (score>0 || power>= tokens[i])){
            
            while(i<=j && power>=tokens[i]){
                score++;
                power-=tokens[i];
                i++;
            }
            ans=Math.max(ans,score);
            
            if(i<=j && score>0 ){
              
                score--;
                power+=tokens[j];
                j--;
            }
           
        }
      return ans;  
    }
}