class Solution {
    public int numberOfSteps(int num) {
        
        int ones =0;
        int n=num;
        boolean flag=false;
        for(int i=0;i<32;i++){
            
            if((num & 1)==1 ){
                ones++;
                flag =true;
            }
            num= num>>1;
            
        }
        if(flag==true)
            ones--;
        
        int i=1;
        while(n>= i){
            ones++;
            i*=2;
        }
        
        return ones;
        
    }
}