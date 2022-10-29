class Solution {
    public int nextGreaterElement(int num) {
        
        String str = num+"";
        char[] digit = str.toCharArray();
        
        int n = digit.length;
        
        int index=-1;
        int index2=n-1;
        for(int i=n-1;i>0;i--){
            if(digit[i]>digit[i-1]){
                index=i-1;
                break;
            }
        }
        
        if(index==-1)
            return -1;
        while(digit[index] >= digit[index2]){
            index2--;
        }
        // System.out.println(index+" "+ index2);
        char temp=digit[index];
        digit[index]= digit[index2];
        digit[index2]= temp;
        
        String ans = "";
        
        for(int i=0;i<=index;i++){
            ans+=digit[i];
        }
        for(int i=n-1;i>index;i--){
            ans+=digit[i];
        }
        
       try{ 
        return Integer.parseInt(ans);
       }
        catch(Exception e){
            return -1;
        }
    }
}