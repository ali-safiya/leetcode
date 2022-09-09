class Solution {
    public int numberOfWeakCharacters(int[][] arr) {
        
        Arrays.sort(arr ,(a,b)-> {
            if(a[0]!=b[0])
                return b[0]-a[0];
            else
                return a[1]-b[1];
        });
        
        int max=arr[0][1];
        
        int count=0;
        for(int i=1;i<arr.length;i++){
            
            if(arr[i][1]<max)
                count++;
            
            max=Math.max(max,arr[i][1]);
        }
        return count;
    }
}