// Last updated: 24/02/2026, 03:52:31
1class Solution {
2    public int compareVersion(String version1, String version2) {
3
4        int i=0;
5        int j=0;
6
7        int n1= version1.length();
8        int n2= version2.length();
9
10        while(i<n1 || j<n2){
11
12            int num1 = 0; 
13            int num2 = 0;
14
15            while(i<n1 && version1.charAt(i)!= '.'){
16                num1*=10;
17                num1+=version1.charAt(i)-'0';
18                i++;
19            }
20
21            while(j<n2 && version2.charAt(j)!= '.'){
22                num2*=10;
23                num2+=version2.charAt(j)-'0';
24                j++;
25            }
26
27            if(num1 > num2) return 1;
28            if(num2 > num1) return -1;
29
30            i++;
31            j++;
32        }
33        return 0;
34    }
35}