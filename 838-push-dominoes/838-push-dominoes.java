class Solution {
    public String pushDominoes(String dominoes) {
        
        int n = dominoes.length();
        
        int[] force = new int[n];
        
        int f=0;
        for(int i=0;i<n;i++){
            
            char c = dominoes.charAt(i);
            
            if(c=='R'){
               f=n; 
            }
            else if(c=='L'){
               f=0;
            }
            else{
                f=Math.max(0,f-1);
            }
            force[i]+=f;
        }
        
        f=0;
        
         for(int i=n-1;i>=0;i--){
            
            char c = dominoes.charAt(i);
            
            if(c=='R'){
               f=0; 
            }
            else if(c=='L'){
               f=n; 
            }
            else{
                f=Math.max(0,f-1);
            }
            force[i]-=f;
        }
        
        StringBuilder ans= new StringBuilder();
        
        for(int ele : force){
            
            ans.append( ele > 0 ? 'R' : (ele <0 ? 'L' : '.' ));
        }
        return ans.toString();
    }
}