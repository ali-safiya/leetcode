class Solution {
    class pair{
        int diff;
        int ind;
        pair(int diff,int ind){
            this.diff=diff;
            this.ind=ind;
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        PriorityQueue<pair> q = new PriorityQueue<pair>((a,b)->{
            
            int dif1 = Math.abs(a.diff-x);
            int dif2 = Math.abs(b.diff-x);
            
            if(dif1!=dif2)
                return dif1-dif2;
            else
                return a.ind-b.ind;
        });
        
        for(int i=0;i<arr.length;i++){
            
            q.add(new pair(arr[i],i));
        }
        
       List<Integer> ans = new ArrayList<Integer>();
        while(k>0){
            
            pair p = q.remove();
            ans.add(p.diff);
            k--;
            
        }
        Collections.sort(ans);
        return ans;
    }
}