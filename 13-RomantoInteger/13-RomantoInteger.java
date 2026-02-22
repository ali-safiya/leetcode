// Last updated: 23/02/2026, 02:47:58
1class Solution {
2    public int romanToInt(String s) {
3        
4        HashMap<Character, Integer> map = new HashMap<>();
5        map.put('I',1);
6        map.put('V',5);
7        map.put('X',10);
8        map.put('L',50);
9        map.put('C',100);
10        map.put('D',500);
11        map.put('M',1000);
12
13        int num=0;
14        int i=0;
15        for(i=0;i<s.length()-1;i++){
16
17            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
18                num-=map.get(s.charAt(i));
19            }
20            else{
21                num+=map.get(s.charAt(i));
22            }
23        }
24        num+=map.get(s.charAt(i));
25        return num;
26    }
27}