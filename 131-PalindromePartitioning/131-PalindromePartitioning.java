// Last updated: 21/02/2026, 02:29:23
1class Solution {
2    public List<List<String>> partition(String s) {
3
4        List<List<String>> ans = new ArrayList<>();
5
6        List<String> temp = new ArrayList<>();
7        partitionString(s,0,ans, temp);
8        return ans;
9        
10    }
11
12    private void partitionString(String s, int ind, List<List<String>> ans , List<String> temp){
13
14        if(ind>s.length()) return;
15        if(ind == s.length()){
16            ans.add(new ArrayList<>(temp));
17            return;
18        }
19
20        for(int i=ind ;i<s.length();i++){
21
22            if(isPalindrome(s,ind,i)){
23                temp.add(s.substring(ind,i+1));
24                partitionString(s,i+1,ans,temp);
25                temp.remove(temp.size()-1);
26            }
27        }
28    }
29    private boolean isPalindrome(String s, int low , int high){
30
31        while(low<=high){
32            if(s.charAt(low)==s.charAt(high)){
33                low++;
34                high--;
35            }
36            else
37                return false;
38        }
39        return true;
40
41    }
42}