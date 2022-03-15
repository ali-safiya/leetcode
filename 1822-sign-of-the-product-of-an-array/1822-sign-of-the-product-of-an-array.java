class Solution {
    public int arraySign(int[] nums) {
        int count=0;
        for(int ele : nums)
        {
          if(ele==0)
              return 0;
            if(ele <0)
                count++;
           
        }
        
        
        return (count%2==0)? 1 : -1;
        
        
    }
}