class Solution {
    public int minimumRecolors(String blocks, int k) {
        
        int minNoOfOp = Integer.MAX_VALUE;

        for(int i= 0 ; i <= (blocks.length()- k);i++){
            int noOfOp =0 ;
            for(int j =i ;j< i+k ;j++){

                char color = blocks.charAt(j);
                if(color == 'W'){
                    noOfOp++;
                }
            }
            if(minNoOfOp > noOfOp){
                minNoOfOp = noOfOp;
            }
        }

        return minNoOfOp;
    }
}