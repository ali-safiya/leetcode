class Solution {
    public List<Integer> countSmaller(int[] nums) {
        
        int[]  count =new int[nums.length];
        int[]  index =new int[nums.length];
        
        for(int i=0;i<nums.length;i++)
            index[i]=i;
        
        sort(nums,0,nums.length-1,index,count);
        
        List<Integer> ans =new ArrayList<Integer>();
        
        for(int ele: count)
            ans.add(ele);
        
        return ans;     
    }
    
    void sort(int[] nums,int l,int h,int[] index,int[] count){
        
        if(l<h){
            int m=l+(h-l)/2;
            sort(nums,l,m,index,count);
            sort(nums,m+1,h,index,count);
            merge(nums,l,m,h,index,count);
        }
    }
    
    void merge(int[] nums, int l,int m,int h,int[] index,int[] count){
        
        int n1=m-l+1;
        int n2= h-m;
        
        int[] left = new int[n1];
        int[] right = new int[n2];
        
        for(int i=0;i<n1;i++)
            left[i]=index[l+i];
        for(int i=0;i<n2;i++)
            right[i]=index[m+1+i];
        
        int i=0,j=0,k=l,con=0;
        
        while(i<n1 && j<n2){
            
            if(nums[left[i]]<=nums[right[j]]){
                index[k]=left[i];
                count[left[i]]+=con;
                i++;
            }
            else{
                index[k]=right[j];
                con=con+1;;
                j++;
            }
            k++;
        }
        
        while(i<n1){
            index[k]=left[i];
            count[left[i]]+=con;
            i++;
            k++;
        }
        while(j<n2){
            index[k]=right[j];
            j++;
            k++;
        }
        
    }
}






