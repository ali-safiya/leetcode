class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalFuel=0;
        int currentFuel=0;
        int negIndx=-1;
        for(int i=0;i<gas.length;i++){
            totalFuel+=gas[i]-cost[i];
            currentFuel+=gas[i]-cost[i];
            if(currentFuel<0){
                currentFuel=0;
                negIndx=i;
            }
        }
        if(totalFuel<0)
            return -1;
        else
            return negIndx+1;
        
    }
}