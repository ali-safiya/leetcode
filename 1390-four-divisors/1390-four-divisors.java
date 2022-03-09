class Solution {
    public int sumFourDivisors(int[] nums) {
        
        ArrayList<Integer> div = new ArrayList<Integer>();
        int sum=0;
        
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            
            for(int j=1;j*j<=nums[i]; j++){
                
                if(nums[i]%j==0){
                    div.add(j);
                    if(nums[i]/j!=j)
                    div.add(nums[i]/j);
                      
            
                }
              
            }
            
            if(div.size()==4){
               for(int ele : div)
                   sum+=ele;
            }
            div.clear();
        }
       return sum; 
    }
}