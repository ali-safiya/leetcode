class Solution {
    public List<Integer> getRow(int rowIndex) {
      
    List<Integer> ans = new ArrayList<Integer>();
   
        ans.add(1);
        if(rowIndex==0) return ans;
        ans.add(1);
        if(rowIndex==1) return ans;
        
        for(int i=2;i<rowIndex+1 ;i++){
             List<Integer> temp = new ArrayList<Integer>();
            for(int j=0;j<i+1;j++){
                
                if(j>=1 && j<i)
                    temp.add(ans.get(j-1) + ans.get(j));
                else
                    temp.add(1);
            }
            ans=temp;
          
        }
        return ans;
    }
    
}