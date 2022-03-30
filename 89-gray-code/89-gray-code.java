class Solution {
    public List<Integer> grayCode(int n) {
     
        
        List<Integer> result =new ArrayList<Integer>();
        result.add(0);
        int pow=1;
        return findSequence(result,n,pow);
    }
    List<Integer>  findSequence(List<Integer> result,int n,int pow){
        
        if(n==0)
            return result;
        
        for(int i=result.size()-1;i>=0;i--){
            result.add(result.get(i)+pow);
        }
       
        return findSequence(result,n-1,2*pow);
    }
}