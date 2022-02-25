class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
     for(int i=0;i<candies.length;i++)
         max=Math.max(max,candies[i]);
        
        ArrayList<Boolean> res=new ArrayList<Boolean>();
        for(int i=0;i<candies.length;i++)
        {
            if(extraCandies+candies[i]>=max)
            {
               
                res.add(true);
            }
            else
                res.add(false);
        }
        return res;
         
    }
}