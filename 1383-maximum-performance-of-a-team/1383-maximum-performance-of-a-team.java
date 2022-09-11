class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int[][] pair = new int[n][2];
        
        for(int i=0;i<n;i++){
            pair[i][0]=efficiency[i];
            pair[i][1]=speed[i];
        }
        
        Arrays.sort(pair ,  (a,b) -> (b[0]-a[0]));
        
        PriorityQueue<Integer>  q= new PriorityQueue<Integer>();
        
        
        long max=0;
        long totalSpeed=0;
        
        for(int i=0;i<n;i++){
            
            if(q.size()>=k){
                totalSpeed-=q.remove();
            }
            
            totalSpeed+= pair[i][1];
            q.add(pair[i][1]);
            
            max=Math.max(max,totalSpeed*pair[i][0]);
        }
        return (int)(max%1000000007);
    }
}