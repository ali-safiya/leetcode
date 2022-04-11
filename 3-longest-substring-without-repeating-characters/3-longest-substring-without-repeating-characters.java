class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        HashMap<Character,Integer> map =new HashMap<>();
    
        int max=Integer.MIN_VALUE;
        int start=0;
        for(int index=0;index<s.length();index++){
         
            if(map.containsKey(s.charAt(index))){
                if(start<=map.get(s.charAt(index)))
                start=map.get(s.charAt(index))+1;
                map.put(s.charAt(index),index);
                
            }else{
                 map.put(s.charAt(index),index);
            }
        
            max=Math.max(max,index-start+1);
        }
        return max;
        
    }
}