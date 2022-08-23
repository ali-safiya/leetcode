class Solution {
    public int binaryGap(int n) {
        
        int i=n;
        int maxDist=0;
        int dist=0;
        boolean flag=false;
        while(i!=0){
            
          
            if((i & 1)== 1 ){
                maxDist=Math.max(maxDist,dist);
                dist=0;
                flag=true;
            }
            if(flag==true)
            dist++;
            
            i=i>>1;
        }
        
        return maxDist;
        
    }
}