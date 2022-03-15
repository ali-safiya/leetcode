class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int count=0;
        int[] misplace=new int[2];
        int[] index=new int[2];
        int j=0;
        int k=0;
            
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i))
            {
                count++;
                  if(count>2)
                return false;
                index[k++]=i;
                misplace[j++]=s2.charAt(i);
    
            }
          
        }
        if(count==2)
        {
        if(misplace[0]==s1.charAt(index[1]) && misplace[1]==s1.charAt(index[0]))
            return true;
        else
           return false;
        }
        if(count==1)
            return false;
            
        return true;
        
     
    }
}