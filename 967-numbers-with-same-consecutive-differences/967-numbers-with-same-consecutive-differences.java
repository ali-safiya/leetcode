class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
   
        List<Integer> ans = new ArrayList<Integer>();
      for(int i=1;i<=9;i++){  
         find(ans,n-1,k,i); 
      }
         int[] res = new int[ans.size()]; 
        int i=0;
        for(Integer val: ans)
           res[i++]=val; 
      return res;  
    }
    
    void find(List<Integer> ans, int n, int k,int digits){
        
        if(n==0){
            ans.add(digits);
            return ;
        }
        
        int d= digits%10;
        
        
        if(d+k<10)
            find(ans,n-1,k,digits*10+(d+k));
        if(d+k!=d-k)
        if(d-k>=0)
            find(ans,n-1,k,digits*10+(d-k));
        
        
    }
}