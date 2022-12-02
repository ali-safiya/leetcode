class Solution {
    public boolean closeStrings(String word1, String word2) {
        
        if(word1.length() != word2.length())
            return false;
        
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        
        freq1 = getFrq(word1);
        freq2 = getFrq(word2);
        
        for(int i=0;i<26;i++){
            
            if((freq1[i]==0 && freq2[i]!=0) || (freq1[i]!=0 && freq2[i]==0))
                return false;
       
        }
        
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        
        for(int i=0;i<26;i++){
            
            if(freq1[i]!=freq2[i])
                return false;
       
        }
        return true;
        
    }
    
    int[] getFrq(String str){
        
        int[] arr = new int[26];
        for(int i =0;i<str.length() ;i++){
            arr[str.charAt(i)-'a']++;
        }
        return arr;
    }
}