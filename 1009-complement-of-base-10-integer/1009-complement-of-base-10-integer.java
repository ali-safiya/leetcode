class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        int bit=1;
        int i=n;
        
        while(i !=0){
            n = n^bit;
            bit=bit<<1;
            i=i>>1;
            
            
        }
        return n;
    }
}