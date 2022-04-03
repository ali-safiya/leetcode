class Solution {
    public int reversePairs(int[] nums) {
        return sort(nums,0,nums.length-1);
        
    }
    int sort(int[] nums, int l,int r){
        int count=0;
        if(l<r){
            int m=l+(r-l)/2;
            count+=sort(nums,l,m);
            count+=sort(nums,m+1,r);
            count+=merge(nums,l,m,r);
        }
        return count;
    }
    
    int merge(int[]  nums,int l ,int m, int r){
        int count=0;
        int n1=m-l+1;
        int n2=r-m;
        
        int j=m+1;
        for(int i=l;i<=m;i++){
            while(j<=r && nums[i]>2*(long)nums[j]){
                j++;
            }
            count+=j-(m+1);
        }
        
        int[] left =new int[n1];
        int[] right=new int[n2];
        
        for(int i=0;i<n1;i++)
            left[i]=nums[l+i];
        
        for(int i=0;i<n2;i++)
            right[i]=nums[m+1+i];
        
        int i=0,k=l;
        j=0;
        
        while(i<n1 &&j<n2){
            
            if(left[i]<=right[j]){
               nums[k]=left[i];
                i++;
            }
            else{
                nums[k]=right[j];
                j++;
            }
            k++;
        }
        
        while(i<n1){
            nums[k++]=left[i++];
        }
        
        while(j<n2){
            nums[k++]=right[j++];
        }
        return count;
    }
}