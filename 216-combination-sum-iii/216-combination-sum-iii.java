class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
         
        result= new ArrayList<List<Integer>>();
        
        List<Integer> list = new ArrayList<Integer>();
        
        findCombination(list,k,n,1);
        return result;
    }
    List<List<Integer>> result;
    
    void findCombination(List<Integer> list,int k,int n ,int index){
        
        if(k==0 && n==0){
            
            result.add(new ArrayList<Integer>(list));
            return;
        }
        
        for(int i=index;i<10;i++){
            
            list.add(i);
            findCombination(list,k-1,n-i,i+1);
            list.remove(list.size()-1);
        }
        return;
    }
}