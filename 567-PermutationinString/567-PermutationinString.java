// Last updated: 14/10/2026, 05:02:45
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3
4        int n1= s1.length();
5        int n2 = s2.length();
6        int[] string1 = new int[26];
7        int[] string2 = new int[26];
8
9        if(n1>n2) return false;
10
11        for(int i=0;i<n1;i++){
12            string1[s1.charAt(i)-'a']++;
13        }
14
15        int low=0;
16        for(int i=0;i<n2;i++){
17
18            char cur = s2.charAt(i);
19            string2[cur - 'a']++;
20
21            if((i-low+1)> n1){
22                string2[s2.charAt(low) - 'a']--;
23                low++;
24            }
25            if((i-low+1) == n1){
26                if(matches(string1,string2)) return true;
27            }         
28        }
29        return false;
30        
31    }
32    private boolean matches(int[] s1, int[] s2){
33        for(int i=0;i<26;i++){
34            if(s1[i]!= s2[i]) return false;
35        }
36        return true;
37    }
38}