class Solution {
    public List<String> removeAnagrams(String[] words) {
        
        List<String> ans = new ArrayList<>();
        
        HashMap<String,Integer> set = new HashMap<>();
        
        for(int i=0;i< words.length;i++ ){
            
            String sorted = findSorted(words[i]);
            
            if(set.containsKey(sorted)){
                
                if(i-set.get(sorted)>1){
                    ans.add(words[i]);
                }
                else{
                    set.put(sorted , i);
                }
            }
            else{
                set.put(sorted,i);
                ans.add(words[i]);
            }
            
        }
        
        return ans;
        
    }
    
    String findSorted(String str){
        
        int[] count = new int[26];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)-'a']++;
        }
        StringBuilder sorted = new StringBuilder();
        for(int i=0;i<26;i++){
            if(count[i]!=0){
                sorted.append((char)(i+'a')).append(count[i]);
            }
        }
        
        return sorted.toString();
    }
}