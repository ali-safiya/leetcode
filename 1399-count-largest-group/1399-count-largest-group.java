class Solution {
    public int countLargestGroup(int n) {
        
        HashMap<Integer ,Integer> freq = new HashMap<Integer,Integer>();
        int maxFreq=0;
        for(int i=1 ;i<=n;i++){
            
            int sum=0;
            int num =i;
            
            while(num>0){
                
                sum+=num%10;
                num=num/10;
            }
            
            freq.put(sum ,freq.getOrDefault(sum,0)+1);
            maxFreq= Math.max(maxFreq , freq.get(sum));
        }
        int count=0;
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            
            if(entry.getValue()==maxFreq){
                count++;
            }
        }
      return count;  
    }
}