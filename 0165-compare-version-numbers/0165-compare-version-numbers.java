class Solution {
    public int compareVersion(String version1, String version2) {
       
        int len1 = version1.length();
        int len2 = version2.length();
        
        int i=0;
        int j=0;
        
       
        
        int num1=0;
        int num2=0;
                
        while(i<len1 || j<len2){
            num1=0;
            num2=0;
            while(i < len1 && version1.charAt(i)!='.'){
                num1= num1*10 + version1.charAt(i++)-'0';
              
            }
            while(j<len2 && version2.charAt(j)!='.'){
                num2= num2*10 + version2.charAt(j++)-'0';

            }
           
                if(num1> num2)
                    return 1;
                else if(num1 <num2)
                    return -1;
                else{
                    i++;
                    j++;
                    }
     
            
        }
   
                    return 0;
            

        
    }
}