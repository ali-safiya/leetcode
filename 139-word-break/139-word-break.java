class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n=s.length();
        boolean[] dp = new boolean[n+1];
        dp[0]=true;
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        
        for(String str : wordDict){
            map.put(str,1);
        }
        
        for(int i=0;i<n+1;i++){
            
            for(int j=i;j<n+1;j++){
                //System.out.print(" "+ s.substring(i,j));
                if(map.containsKey(s.substring(i,j)) && dp[i]==true){
                    dp[j]=true;
                }
            }
        }
        // for(int i=0;i<n+1;i++)
        //     System.out.print(" "+ dp[i]);
        return dp[n];
    }
}