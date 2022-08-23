class Solution {
    public String addBinary(String a, String b) {
        
        int l1= a.length()-1;
        int l2= b.length()-1;
 
         StringBuilder ans = new StringBuilder();
        int i=0;
        int carry=0;
        
        while(l1 >= 0 || l2 >=0){
          int x=0;
          int y=0;
          int sum=0;
            
            if(l1>=0){
                 x = Character.getNumericValue(a.charAt(l1--));
              
            }
            
             if(l2>=0){
                y = Character.getNumericValue(b.charAt(l2--));
              
               
            }
            
            sum = x + y + carry;
            
          carry =(sum==2 || sum==3 )? 1 :0;
            
          ans.append((sum==1 || sum==3 )?1:0);
            
        }
      if(carry>0)
          ans.append(1);
        
        return  ans.reverse().toString();
        
    }
}