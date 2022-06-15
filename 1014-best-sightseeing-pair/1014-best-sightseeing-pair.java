class Solution {
    public int maxScoreSightseeingPair(int[] values) {
      int n = values.length;
       int maxj=Integer.MIN_VALUE; 
      int[] maxVal = new int[n];
        
        for(int i=n-1;i>0;i--){
            maxj=Math.max(maxj,values[i]-i);
            maxVal[i]=maxj;
        }
        int ans=0;
        for(int i=0;i<n-1;i++){
            int sumi= values[i]+i;
            ans=Math.max(ans,sumi+maxVal[i+1]);
        }
      return ans;
    }
}