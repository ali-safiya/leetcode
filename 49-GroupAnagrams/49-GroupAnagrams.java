// Last updated: 12/10/2026, 01:53:22
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3
4        HashMap<String,List<String>> anagramsGrp = new HashMap<>();
5        List<List<String>> ans = new ArrayList<>();
6
7        for(String str : strs){
8
9            int[] freq = new int[26];
10
11            for(int i=0;i<str.length();i++){
12                freq[str.charAt(i) - 'a']++;
13            }
14
15            StringBuilder signature = new StringBuilder();
16
17            for(int i=0;i<26;i++){
18                if(freq[i]!=0){
19                    signature.append((char)(i+'a'));
20                    signature.append(freq[i]);
21                }
22            }
23            String key = signature.toString();
24            // System.out.println(key);
25
26            if(anagramsGrp.containsKey(key)){
27                anagramsGrp.get(key).add(str);
28            }
29            else{
30                List<String> group = new ArrayList<>();
31                group.add(str);
32                anagramsGrp.put(key,group);
33            }
34        } 
35
36        for(List<String> anagrams : anagramsGrp.values()){
37            ans.add(anagrams);
38        } 
39
40        return ans;      
41    }
42}