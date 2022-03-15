class Solution {
    HashSet<Integer> set = new HashSet<Integer>();
    public boolean isHappy(int n) {
        if(n==1)
            return true;
        int sum= getSum(n);
        if(set.contains(sum)) return false ;
        set.add(sum);
        if(isHappy(sum)) return true;
        return false;
        
        
    }
    int getSum(int num){
        if (num==0)
        return 0;
        int digit=num%10;
        return  getSum(num/10)+digit*digit; 
        
    }
}