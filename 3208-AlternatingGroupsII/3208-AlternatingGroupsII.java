class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {

        int n = colors.length;

        int lastColor = colors[0];
        int noOfAdjCol = 1;
        int result =0;

        for(int i=1;i < n+(k-1) ; i++){

            int index = i%n;

            if(lastColor!=colors[index]){
                noOfAdjCol++;
            }
            else{
                noOfAdjCol =1;
            }
            lastColor= colors[index];

            if(noOfAdjCol >= k){
                result++;
            }
        }
        return result;
        
    }
}