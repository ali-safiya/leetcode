class Solution {
    public int nthUglyNumber(int n) {
        
        int[] ugliNo = new int[n];
        
        ugliNo[0]=1;
        int a=0,b=0,c=0;
        
        for(int i=1;i<n;i++){
            
            ugliNo[i]=Math.min(ugliNo[a]*2,Math.min(ugliNo[b]*3,ugliNo[c]*5));
            
            if(ugliNo[i]==ugliNo[a]*2)
                a++;
            if(ugliNo[i]==ugliNo[b]*3)
                b++;
            if(ugliNo[i]==ugliNo[c]*5)
                c++;
            
        }
        return ugliNo[n-1];
    }
}