// Last updated: 04/02/2026, 15:40:55
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        
4        Arrays.sort(g);
5        Arrays.sort(s);
6
7        int j=0;
8        int i=0;
9        int count =0;
10
11        while(i<g.length){
12
13            if(j >= s.length) break;
14                        // System.out.println(j +"count: " + count + "s: " + s[j] + "g: " + g[i]);
15
16            if(g[i] <= s[j]){
17                count++;
18                j++;
19                i++;
20            }  
21            else{
22                j++;
23            }
24        }
25        return count;
26    }
27}