class Solution {
    public int trap(int[] height) {
        
        int n = height.length;
        
        int[] maxLeft = new int[n];
        int[] maxRight = new int[n];
        
        int max;
        
        maxLeft[0]=0;
        maxRight[n-1]=0;
        
        max=height[0];
        for(int i=1;i<n;i++){
           if(height[i-1]>max){
               max=height[i-1];
           } 
            maxLeft[i]=max;
            //System.out.println("insideloop" + maxLeft[i]);
        }
        
         max=height[n-1];
        for(int i=n-2;i>=0;i--){
           if(height[i+1]>max){
               max=height[i+1];
           } 
            maxRight[i]=max;
        }
      
            
        int totalTrappedRain=0;
        for(int i=0;i<n;i++){
        if((Math.min(maxLeft[i],maxRight[i])-height[i])>=0)
         
            totalTrappedRain+=Math.min(maxLeft[i],maxRight[i])-height[i];
               //System.out.print(totalTrappedRain );
        }
        
        return totalTrappedRain;
    }
}