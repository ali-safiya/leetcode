class Solution {
    public List<List<String>> partition(String s) {
        
        List<List<String>> palindromes = new ArrayList<List<String>>();
        
        List<String> list = new ArrayList<String>();
        
        
        return findPalindromes(palindromes,list,s,0);
        
    }
    
    List<List<String>> findPalindromes(List<List<String>> palindromes,List<String> list,String s,int index){
        
        
        if(index==s.length()){
            
            palindromes.add(new ArrayList<String>(list));
            
            return palindromes;
        }
        
        for(int i=index;i<s.length();i++){
            System.out.println(s.substring(index,i+1)+" "+index+" "+i);
           if(isPalindrome(s,index,i)){
               
               list.add(s.substring(index,i+1));
               findPalindromes(palindromes,list,s,i+1);
               list.remove(list.size()-1);
               
           } 
        }
        return palindromes;
    }
    
    boolean isPalindrome(String s,int start,int end){
        
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end))
                return false;
            
            start++;
            end--;
        }
        return true;
    }
}