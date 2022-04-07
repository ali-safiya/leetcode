class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1)
            return stones[0];
        Arrays.sort(stones);
        int n=stones.length;
        int k=stones.length-1;
        while(n!=0){
            if(stones[k]==stones[k-1]){
                stones[k]=0;
                stones[k-1]=0;
            }else{
                
                stones[k]=stones[k]-stones[k-1];
                stones[k-1]=0;
            }
            Arrays.sort(stones);
            n--;
             for(int ele:stones)
            System.out.println(ele);
        }
    
        return stones[k];
    }
}