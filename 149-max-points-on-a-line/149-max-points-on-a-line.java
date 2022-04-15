class Solution {
    public int maxPoints(int[][] points) {
        if(points.length<3){
            return points.length;
        }
        HashMap<Double,Integer> map = new HashMap<>();
        
        int result=0;
        int n=points.length;
        
        for(int i =0;i<n;i++){
            
            for(int j=0;j<n;j++){
                
                if(i!=j){
                    
                    Double slope = cal(points[i],points[j]);
                    map.put(slope,map.getOrDefault(slope,1)+1);
                }
                
                for(Double d : map.keySet()){
                    result=Math.max(map.get(d),result);
                }
            }
            map.clear();
        }
        
        return result;
        
    }
    Double cal(int[] x ,int[] y){
        
        Double xdiff = Double.valueOf((y[0])-(x[0]));
        Double ydiff =  Double.valueOf((y[1])-(x[1]));
        
        if(xdiff==0)
            return  Double.MAX_VALUE;
        
        return ydiff/xdiff;
    }
}