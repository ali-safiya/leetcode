class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res= new int[2*n];
        int j=0;
        int k=n;
        for(int i=0;i<2*n;i++)
        {
            res[i]=nums[j++];
            res[++i]=nums[k++];
        }
        return res;
    }
}