class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> result= new ArrayList<Integer>();
        
        HashMap<Integer,Integer>  minElem = new HashMap<Integer,Integer>();
        
        
        int row=matrix.length;
        int col=matrix[0].length;
       
        
        for(int i=0;i<row;i++){
                int min=Integer.MAX_VALUE;
                int index=0;
            
            for(int j=0;j<col;j++){

                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    index=j;
                }
              
            }
            if(minElem.containsKey(index)){
                minElem.put(index,Math.max(min,minElem.get(index)));
            }
            else
            minElem.put(index,min);
            
        }
       
              System.out.println(minElem.size());
       
       
        for(Map.Entry<Integer,Integer> entry : minElem.entrySet()){
             
       
          int max=0;
            
          for(int i=0;i<row;i++){
          
              if(matrix[i][entry.getKey()]>max){
                  max=matrix[i][entry.getKey()];
              }
          }
            
            if(max==entry.getValue())
                result.add(entry.getValue());
            
        }
        
        return result;
        
    }
}