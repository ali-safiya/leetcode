// Last updated: 24/02/2026, 02:39:37
1class Solution {
2    public int myAtoi(String s) {
3
4        s =removeWhiteSpace(s);
5
6        boolean isNeg = isNegCheck(s);
7
8        int num = read(s, isNeg);
9
10        return isNeg ? num*-1 : num;
11        
12    }
13
14    private int read(String str, boolean isNeg){
15        int i=0;
16        if(!str.isEmpty()) 
17            if( str.charAt(0) == '+' || str.charAt(0) == '-'){
18            i++;
19            }
20        while(i < str.length() && str.charAt(i) == '0'){
21            i++;
22        }
23
24        int num =0;
25        while(i < str.length() && Character.isDigit(str.charAt(i))){
26
27            int curDigit = str.charAt(i)- '0';
28
29            if(num > (Integer.MAX_VALUE - curDigit)/10 ){
30                return isNeg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
31            }
32
33            num*= 10 ;
34            num+= curDigit;
35            i++;
36        }
37        return num;
38    }
39
40    private boolean isNegCheck(String s){
41        if(!s.isEmpty() && s.charAt(0) == '-') return true;
42        return false;
43    }
44
45    private String removeWhiteSpace(String str){
46        int i=0;
47
48        while(i<str.length() && str.charAt(i) == ' '){
49            i++;
50        }
51
52        return str.substring(i,str.length());
53    }
54}