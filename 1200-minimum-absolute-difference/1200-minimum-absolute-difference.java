class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        
        List<List<Integer>> result =new ArrayList<List<Integer>>();
        
        for(int i=1;i<arr.length;i++){
            
            if(min>arr[i]-arr[i-1]){
                min=arr[i]-arr[i-1];
                result= new ArrayList();
                result.add(Arrays.asList(arr[i-1],arr[i]));
            }
            else if(min==arr[i]-arr[i-1])
                result.add(Arrays.asList(arr[i-1],arr[i]));
        }
      return result;  
    }
}