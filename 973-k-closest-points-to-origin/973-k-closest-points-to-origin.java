class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
       int left=0;
       int right=points.length-1;
      
        while(left<=right){
            
            int pivot = partitions(points,left,right);
            
            if(pivot==k)
                break;
            else if(pivot>k)
                right=pivot-1;
            else
                left=pivot+1;
        }
      return Arrays.copyOfRange(points,0,k);  
    }
    
    int partitions(int[][] points,int l,int r){
        
        int pivot=r;
        int i=l-1;
        
        for(int j=l;j<=r-1;j++){
            
            if(cal(points[j])<cal(points[pivot])){
                i++;
                int[] temp=points[i];
                 points[i]=points[j];
                points[j]=temp;
            }
        }
        int[] temp=points[i+1];
                 points[i+1]=points[r];
                points[r]=temp;
        
        return i+1;
    }
    int cal(int[] num){
        return num[0]*num[0]+num[1]*num[1];
    }
    
    
}