class Solution {
    public String convertToTitle(int columnNumber) {
        
         String result="";
        while(columnNumber>0){
            int last=(columnNumber-1)%26+(int)'A';
            result=(char)last+result;
            columnNumber=(columnNumber-1)/26;
          
        }
    return result;
        

    }
}