class Solution {
    public String sortSentence(String s) {
        
        String[] sentence = s.split(" ");
        
        String[] words = new String[sentence.length];
        
        for(int i=0;i< sentence.length;i++){
            
            int index = sentence[i].charAt( sentence[i].length() -1) -'0';
            words[index-1] = sentence[i].substring(0,sentence[i].length()-1);
            
        }
        String ans="";
        for(String str : words){
            
            ans+=str;
            ans+=" ";
        }
        
        return ans.trim();
        
    }
}