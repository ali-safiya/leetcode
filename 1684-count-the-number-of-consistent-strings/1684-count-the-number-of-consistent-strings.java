class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        
        HashSet<Character> set = new HashSet<Character>();
        
        for(int i=0;i<allowed.length();i++){
            
            set.add(allowed.charAt(i));
            
        }
       int count=0;
     
        
        for(String word : words){
               boolean flag=false;
            for(int i =0 ; i<word.length();i++){
                
                if(! set.contains(word.charAt(i))){
                    flag=true;
                    break;
                }
            }
            if(flag==false)
            count++;
        }
        
        return count;
    }
}