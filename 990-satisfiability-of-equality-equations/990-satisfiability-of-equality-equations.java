class Solution {
    int[] root;
    public boolean equationsPossible(String[] equations) {
        
        root = new int[26];
        
        for(int i=0;i<26;i++){
            root[i]=i;
        }
        
        for(String exp : equations){
            
            if(exp.charAt(1)=='='){
                
                int x= findRoot(exp.charAt(0)-'a');
                int y= findRoot(exp.charAt(3)-'a');
                
                root[y]=x;
            }
        }
        
        for(String exp: equations){
            
            if(exp.charAt(1)== '!'){
                       
                int x= findRoot(exp.charAt(0)-'a');
                int y= findRoot(exp.charAt(3)-'a');
                
                if(x==y)
                    return false;
                
            }
        }
        return true;
    }
    int findRoot(int val){
        
        return root[val]==val ?  val : (root[val]=findRoot(root[val]));
        
    }
}