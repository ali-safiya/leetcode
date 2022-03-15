class Solution {
    public int[] singleNumber(int[] nums) {
       
        int num1=0;
        int num2=0;
        
        int xor=0;
      
        for(int ele:nums )
            xor^=ele;
        
        int rightmostsetbit=  xor &( ~(xor-1));
        //finding rightmostsetbit bcz xor is one if both bits are diff 
       
        for(int ele :nums){
            
            if( (rightmostsetbit & ele)==rightmostsetbit)
                num1^=ele;  
            else
                num2^=ele;
            
              
        }
        int[] result = new int[2];
        
        result[0]=num1;
        result[1]=num2;
        
        return result;
        
    }
}