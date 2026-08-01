// Last updated: 01/08/2026, 18:36:31
1class DSU{
2    int size[];
3    char parent[];
4
5    DSU(){
6        size = new int[26];
7        parent = new char[26];
8
9        for(char i = 'a'; i<='z' ;i++){
10            size[i-'a']=1;
11            parent[i-'a']=i;
12        }
13    }
14
15    public void union(char a, char b){
16
17        char x = find(a);
18        char y = find(b);
19
20        if(x==y) return;
21
22        if(size[x-'a'] < size[y-'a']){
23            parent[x-'a'] = y;
24            size[y-'a'] += size[x-'a'];
25        }
26        else{
27            parent[y-'a'] = x;
28            size[x-'a'] += size[y-'a'];
29        }
30    }
31
32    public char find(char a){
33        if(a == parent[a-'a']) return a;
34        return parent[a-'a'] = find(parent[a-'a']);
35    }
36}
37class Solution {
38    public boolean equationsPossible(String[] equations) {
39        DSU dsu = new DSU();
40
41        for(String eq : equations){
42            if(eq.charAt(1)== '='){
43                dsu.union(eq.charAt(0),eq.charAt(3));
44            }
45        }
46        for(String eq : equations){
47            if(eq.charAt(1)== '!' && dsu.find(eq.charAt(0)) == dsu.find(eq.charAt(3))){
48                return false;
49            }
50        }
51        return true;
52    }
53}