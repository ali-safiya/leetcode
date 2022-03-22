class Solution {
    public boolean checkIfExist(int[] arr) {
        
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        
        for(int i:arr){
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
                map.put(i,1);
        }
        
        for(int i:arr){
             if(i==0 && map.get(0)>1)
                   return true;
            if(i!=0){
            if(map.containsKey(2*i)){
               return true;
              }
            }
        }
        return false;
        
    }
}