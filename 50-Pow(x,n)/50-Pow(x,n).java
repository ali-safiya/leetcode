// Last updated: 14/01/2026, 19:28:37
1class Solution {
2    public double myPow(double x, int n) {
3
4        long N = n;
5
6        if(n<0){
7            N=-N;
8            x = 1/x;
9        }
10        
11        return power(x,N);
12    }
13
14    private double power(double x, long n){
15        if(n == 0) return 1.0;
16        if (n == 1) return x;
17       
18        if(n%2==0){
19            return power(x*x,n/2);
20        }
21        else{
22            return x * power(x,n-1);
23        }
24    }
25}