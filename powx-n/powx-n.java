class Solution {
    public double myPow(double x, int n) {

return findPow(x,(long)n);
    }

    public double findPow(double x, long n){
        if(n==0)
            return 1;
        if(n<0){
            return 1.0/findPow(x,-1*n);
        }

        if(n%2==1){
            return x*findPow(x*x,(n-1)/2);
        }
        else{
            return findPow(x*x,(n/2));
        }
    }
}