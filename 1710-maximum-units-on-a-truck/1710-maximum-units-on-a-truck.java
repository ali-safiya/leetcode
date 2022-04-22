class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
     
        
    
        
        Comparator<int[]> mycomp = new Comparator<int[]>(){
            public int compare(int[] a ,int[] b){
                if(a[1]> b[1])
                    return -1;
                else if(a[1]<b[1]) return 1;
                else  return 0;
                    
            }
        };
            Arrays.sort(boxTypes, mycomp);
        int cap=0;
        for(int i=0;i<boxTypes.length;i++){
            
             if(boxTypes[i][0] > truckSize) {
                cap += truckSize*boxTypes[i][1];
                break;
            }
            cap+= boxTypes[i][1]*boxTypes[i][0];
            truckSize-=boxTypes[i][0];         
                
        }
        
        return cap;
    }
}