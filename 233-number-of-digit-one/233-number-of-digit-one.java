class Solution {
    public int countDigitOne(int n) {
      
        String s= Integer.toString(n);
        
        int noOfDigits= s.length();
        
        int temp=0;
        
        int noOfOnes =0;
        
        while(noOfDigits>0){
            
            
            if(Integer.parseInt(String.valueOf(s.charAt(temp)))>1){
                noOfOnes+=Math.pow(10,noOfDigits-1);
            }
            
           
            
            if(Integer.parseInt(String.valueOf(s.charAt(temp)))==1){
                noOfOnes+=(n %Math.pow(10,noOfDigits-1))+1;
                
            }
            
          
            
            noOfOnes+=Integer.parseInt(String.valueOf(s.charAt(temp)))*(noOfDigits-1)*Math.pow(10,(noOfDigits-2));
            
        
            
            temp++;
            
            
            noOfDigits--;
            
        }
        
        
       return noOfOnes; 
        
    }
}