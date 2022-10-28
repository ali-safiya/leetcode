class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String , List<String>>  map = new HashMap<>();
        
        for(String s : strs){
            
            String sorted = sortString(s);
            
            map.putIfAbsent(sorted , new ArrayList<String>());
            map.get(sorted).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
    
    String sortString(String s){
        
        int[] count = new int[26];
        
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        
        StringBuilder sortedString = new StringBuilder();
        
        for(int i=0;i<26;i++){
            if(count[i]!=0){
                sortedString.append((char)(i + 'a')).append(count[i]);
            }
        }
        
        return sortedString.toString();
    }
}