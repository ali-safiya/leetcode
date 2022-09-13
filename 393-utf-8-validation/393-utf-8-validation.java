class Solution {
    public boolean validUtf8(int[] data) {
        
        int noOfones =0;
        
        int mask1= 1<<7;
        
        int mask2= 1<<6;
        
        
        for(int i=0;i<data.length;i++){
            
            if(noOfones==0){
            
            int mask = 1<<7;
            while((mask & data[i]) !=0){
                noOfones++;
                mask>>=1;
            }
            
            if(noOfones==0)
                continue;
            
            if(noOfones> 4 || noOfones < 2 )
                return false;
                
            }
            else{
                
                if(!( (data[i]& mask1 )!=0 && (data[i] & mask2)==0) )
                    return false;
            }
            
            noOfones--;
            
        }
        return noOfones==0;
    }
}