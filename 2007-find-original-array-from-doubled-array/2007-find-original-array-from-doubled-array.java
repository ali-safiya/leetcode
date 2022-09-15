class Solution {
    public int[] findOriginalArray(int[] changed) {
        
        int n =(changed.length);
        if(n%2!=0)
            return new int[0];
        HashMap<Integer,Integer> freq = new HashMap<>();
        int[] original = new int[n/2];
        
        Arrays.sort(changed);
        
        for(int ele : changed){
            freq.put(ele,freq.getOrDefault(ele,0)+1);
        }
        int i=0;
        for(int ele : changed ){
            
            if(freq.get(ele)>0){
                freq.put(ele,freq.getOrDefault(ele,0)-1);
                original[i]=ele;
                i++;
            if(freq.containsKey(ele*2) && freq.get(ele*2)>0){
                freq.put(ele*2,freq.getOrDefault(ele*2,0)-1);
            }
            else{
                return new int[0];
            }
          }
        }
        
        return original;
    }
}