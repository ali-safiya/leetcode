class Solution {
    public boolean hasAlternatingBits(int n) {
        
        int num = (n>>1) + n;
        
        return (num & (num+1))==0;
        
    }
}