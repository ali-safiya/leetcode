class Solution {
    public int longestNiceSubarray(int[] nums) {

        int maxLength = 0;

        int start =0 ;
        int setBits =0 ;

        for(int end =0 ;end < nums.length ; end++){

            while((nums[end] & setBits )!= 0){
                setBits ^= nums[start++];
            }

            setBits |= nums[end];

            maxLength = Math.max(maxLength, end-start +1);

        }

        return maxLength;
        
    }
}