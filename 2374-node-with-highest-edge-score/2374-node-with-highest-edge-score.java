class Solution {
    public int edgeScore(int[] edges) {
        
        HashMap<Integer,Long> freq = new HashMap<>();
        long maxScore=0;
        int edge=0;
        for(int i=0;i<edges.length;i++){
            
            freq.put(edges[i],freq.getOrDefault(edges[i],0L)+i);
            
            if(freq.get(edges[i])> maxScore){
                maxScore = freq.get(edges[i]);
                edge= edges[i];
            }
            if(freq.get(edges[i])== maxScore){
                edge= Math.min(edge,edges[i]);
            }
        }
         
        return edge;
    }
}