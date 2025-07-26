// Last updated: 26/07/2025, 21:13:45
class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>>  tri = new ArrayList<>();

        for(int i=0;i<numRows;i++){

            List<Integer> curRow = new ArrayList<>();
            for(int j=0;j<i+1;j++){
                if(j==0 || j==i ){
                    curRow.add(1);
                }
                else{
                    curRow.add(tri.get(i-1).get(j-1) + tri.get(i-1).get(j));
                }
            }
            tri.add(curRow);
        }
        return tri;
    }
}