// Last updated: 24/02/2026, 03:26:14
1class Solution {
2    public String countAndSay(int n) {
3
4        if(n ==1) return "1";
5        String num =1+"";
6        for(int i=1;i<n;i++){
7            num =rle(num);
8        }
9        return num;
10    }
11
12    private String rle(String num){
13
14        int count =1;
15        String ans="";
16        int i=0;
17        for(i=0;i<num.length()-1;i++){
18            if(num.charAt(i) == num.charAt(i+1)){
19                count++;
20            }
21            else{
22                ans+=count+"" + num.charAt(i);
23                count =1;
24            }
25        }
26        return ans+= count+"" + num.charAt(i);
27    }
28}