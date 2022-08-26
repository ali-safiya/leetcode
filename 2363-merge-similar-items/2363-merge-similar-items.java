class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        
        Arrays.sort(items1, (a,b)-> (a[0]-b[0]));
        Arrays.sort(items2,(a,b)-> (a[0]-b[0]));
        
        int n =items1.length;
        int m =items2.length;
        
        int i=0;
        int j=0;
          
       List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
       while(i < n && j<m ){
           
           ArrayList<Integer> list = new ArrayList<>();
           
           if(items1[i][0]<items2[j][0]){
               list.add(items1[i][0]);
               list.add(items1[i][1]);
               i++;
           }
           else if(items1[i][0]>items2[j][0]){
               list.add(items2[j][0]);
               list.add(items2[j][1]);
               j++;
           }
           else{
               list.add(items1[i][0]);
               list.add(items1[i][1]+items2[j][1]);
               i++;
               j++;
           }
            ans.add(list);   
       }
        while(i<n){
             ArrayList<Integer> list = new ArrayList<>();
             list.add(items1[i][0]);
             list.add(items1[i][1]);
            i++;
             ans.add(list);  
        }
         while(j<m){
             ArrayList<Integer> list = new ArrayList<>();
             list.add(items2[j][0]);
             list.add(items2[j][1]);
            j++;
             ans.add(list);  
        }
      
        return ans;
    }
}