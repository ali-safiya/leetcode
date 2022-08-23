class Solution {
    public int countPrimeSetBits(int left, int right) {
       int count=0;
        for(int i=left;i<=right;i++){
            if(isPrime(Integer.bitCount(i)))
                count++;
        }
        return count;
    }
    
    boolean isPrime(int no){
        return (no==2 || no==3 || no==5 || no ==7 || no== 11 || no==13 || no==17 ||no==19);
    }
}