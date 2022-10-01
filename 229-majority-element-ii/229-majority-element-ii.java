class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int count1=0;
        int count2=0;
        
        int majEle1 =-1;
        int majEle2=-1;
        
        for(int num:nums){
            
            if(num ==majEle1 )
                count1++;
            else if(num == majEle2)
                count2++;
            else if(count1==0){
                count1=1;
                majEle1=num;
            }
            else if(count2==0){
                count2=1;
                majEle2=num;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int ele : nums){
            if(ele== majEle1){
                count1++;
            }
            else if(ele ==majEle2){
                count2++;
            }
        }
        
        List<Integer> ans = new ArrayList<Integer>();
        
        if(count1 > nums.length/3)
            ans.add(majEle1);
        if(count2> nums.length/3)
            ans.add(majEle2);
        return ans;
        
    }
}