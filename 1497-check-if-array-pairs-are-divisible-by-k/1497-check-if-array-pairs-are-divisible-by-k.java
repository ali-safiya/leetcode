class Solution {
    public boolean canArrange(int[] arr, int k) {
        int n=arr.length;
        
        HashMap<Integer,Integer> remainder =new  HashMap<Integer,Integer>();
        
        for(int i=0;i<n;i++){
            int ele=((arr[i]%k)+k)%k;
            if(remainder.containsKey(ele)){
                remainder.put(ele, remainder.get(ele)+1);
            }
            else
                remainder.put(ele,1);
        }
      
        
        
        System.out.println(remainder);
        for(Map.Entry<Integer,Integer> entry : remainder.entrySet()){
            
            int key=entry.getKey();
            
            int counter=( k-key)%k;
            
            if(key==0 )
            {
                if(remainder.get(key)%2!=0)
                return false;
            }
            else{
            if(!remainder.containsKey(counter) || ((remainder.get(key)- remainder.get(counter))!=0))
            {
              
                return false;
            }
            }
        }
        
       
        return true;
        
    }
}