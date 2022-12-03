class Solution {
    class Pair {
        char key;
        int val;
        public Pair(char key,int val){
            this.key =key;
            this.val=val;
        }
    }
    public String frequencySort(String s) {
        
       HashMap<Character,Integer> freq = new HashMap<>();
        
        for(int i=0;i< s.length(); i++){
            
           freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0)+1);
        }
        
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a,b) -> b.val-a.val);
        
        for(Map.Entry<Character,Integer> entry : freq.entrySet()){
            
                pq.add(new Pair(entry.getKey(), entry.getValue()));
            
        }
        
        StringBuilder ans = new StringBuilder("");
        
                while(!pq.isEmpty()){
            
            Pair pair = pq.remove();
            char c=pair.key;
            int frq =pair.val;
            while(frq-- > 0){
                ans.append(c);
            }
        }
        
        return ans.toString();
    }
}