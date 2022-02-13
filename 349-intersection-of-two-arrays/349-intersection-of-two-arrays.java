class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      HashSet<Integer> set =new HashSet<Integer>();
      HashSet<Integer> set2= new HashSet<Integer>();
        
        for(int ele : nums1)
            set.add(ele);
        
        for(int ele: nums2)
        {
            if(set.contains(ele))
               set2.add(ele); 
        }
        int j=0;
        int[] ans =new int[set2.size()];
        for(int i : set2)
            ans[j++]=i;
        
        return ans;
    }
}