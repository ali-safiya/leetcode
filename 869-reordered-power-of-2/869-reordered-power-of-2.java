class Solution {
    public boolean reorderedPowerOf2(int n) {
        
        int[] freq = new int[10];
        freq = countDigits(n);
        
        for(int i=0;i<31;i++){
            
           if( Arrays.equals(freq , countDigits((1<<i))))
               return true;
        }
        return false;
    }
    
    int[] countDigits(int num){
        
        int[] arr = new int[10];
        
        while(num>0){
            arr[num%10]++;
            num/=10;
        }
        
        return arr;
    }
}