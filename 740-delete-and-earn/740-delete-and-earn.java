class Solution {
    public int deleteAndEarn(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int n= nums.length;
      
        int max=0;
        for(int ele: nums){
            map.put(ele,map.getOrDefault(ele,0)+ele);
            max=Math.max(max,ele);
        }
          int[] dp = new int[max+1];
        
        dp[0]=0;
        dp[1]=map.getOrDefault(1,0);
        int gain=0;
        for(int i=2;i<max+1;i++){
            gain=map.getOrDefault(i,0);
            int take= gain + dp[i-2];
            int notTake= dp[i-1];
            dp[i]= Math.max(take,notTake);
        }
        return dp[max];
    }
}