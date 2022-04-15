class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        HashMap<String,Integer> map = new HashMap<>();
        int n=words.length;
        
        for(int i=0;i<n;i++){
           map.put(words[i],i) ;
        }
        
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        for(int i=0;i<n;i++)
        {
            int l=0 ;
            int r=0;
            while(l<=r){
                String s = words[i].substring(l,r);
                Integer j= map.get(new StringBuilder(s).reverse().toString());
                if(j!=null && i!=j &&  isPalindrome(words[i].substring(l==0? r:0,l==0?words[i].length():l))){
                    ArrayList<Integer> list= new ArrayList<Integer>();
                    if(l==0){
                        list.add(i);
                        list.add(j);
                    }
                    else{
                        list.add(j);
                        list.add(i);
                    }
                        
                    ans.add(list);
                }
            if(r<words[i].length())
                ++r;
            else
                ++l;
            }
        }
        return ans;
    }
    
    boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}