public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        int noOfOne =0;
      
        
        while(n!=0){
            
            if((n & 1)==1)  noOfOne++;
            
            n=n>>>1;
        }
        return noOfOne ;
        
    }
}