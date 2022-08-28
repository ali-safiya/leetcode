class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        
        List<Integer>  res = new ArrayList<Integer>();
        
        for(int i=0;i< expression.length() ; i++){
            
            char c =expression.charAt(i);
            
            if(c== '+' || c=='-' || c=='*' ){
                
                String a = expression.substring(0,i);
                String b = expression.substring(i+1);
                
                List<Integer> left = diffWaysToCompute(a);
                List<Integer> right = diffWaysToCompute(b);
                
                for(Integer val1 : left){
                    for(Integer val2 :right){
                        
                        if(c == '*')
                            res.add(val1*val2);
                        else if(c == '-')
                            res.add(val1-val2);
                        else
                            res.add(val1+val2);
                    }
                }
            }
        }
        
        if(res.size()==0 )
            res.add(Integer.valueOf(expression));
        
        return res;
        
    }
}