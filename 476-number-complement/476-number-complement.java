class Solution {
    public int findComplement(int num) {
        int i=0;
        int n=num;
        while(n> Math.pow(2,i)){
            i++;
            
        }
        int x=0;
       
        for(int j=0;j<i;j++){
            if((n & 1) == 0){
                x+= Math.pow(2,j);
            }
                        
            n=n>>1;
           
            
        }
        return x;
    }
}