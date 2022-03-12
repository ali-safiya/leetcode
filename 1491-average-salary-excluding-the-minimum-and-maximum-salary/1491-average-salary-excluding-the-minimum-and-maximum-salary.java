class Solution {
    public double average(int[] salary) {
        int n=salary.length;
        int minSalary=Integer.MAX_VALUE;
        int maxSalary=Integer.MIN_VALUE;
        double avgSalary=0;
        
        
        for(int curSalary : salary ){
            minSalary=Math.min(minSalary,curSalary);
            maxSalary=Math.max(maxSalary,curSalary);
            avgSalary+=curSalary;
            
        }
        avgSalary-=(minSalary+maxSalary);
        
        
         return avgSalary/(n-2);   
    }
}