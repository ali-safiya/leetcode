class Solution {
    public void nextPermutation(int[] a) {
      int n=a.length;
        int index=0;
        int i=0;
       for(i=n-1;i>0;i--)
       {
           if(a[i]>a[i-1])
           {
               break;
           }
       }
        
        index=i-1;
        if(index>=0)
        {
            
       for(int j=n-1;j>index;j--)
        {
            if(a[j]>a[index])
            {
                swap(a,index,j);
                break;
            }
        }
        }
        int start=n-1; int last=index+1;
        while(last<start)
        {
            swap(a,last,start);
            last++;
            start--;
        }
    } 
        private void swap(int[] a,int i,int j)
        {
           int temp=a[i];
            a[i]=a[j];
            a[j]=temp; 
        }
    
}