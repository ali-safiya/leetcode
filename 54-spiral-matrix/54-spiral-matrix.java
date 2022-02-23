class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      ArrayList<Integer> res= new ArrayList<Integer>();
        int i=0;
        int j=matrix[0].length-1;
        int k=0;
        int l=matrix.length-1;
        int a;
        int total=(j+1)*(l+1);
int flag=0;
        if(j==l && (j+1)%2!=0)
            flag=1;
        while(i<=j && k<=l ){
        
            a=i;
            while(a!=j && total>0){
                res.add(matrix[i][a++]);
                total--;
            }
            a=k;
           
            while(a!=l && total>0){
              
                res.add(matrix[a++][j]);
                total--;
            }
            a=j;
            while((a!=i && total>0)){
                 
                res.add(matrix[l][a--]);
                total--;
            }
            a=l;
            while(a!=k && total>0){
                 
                res.add(matrix[a--][i]);
              total--;
            }
            i++;k++;j--;l--;
        }
        if(flag==1)
            res.add(matrix[--i][++j]);
        return res;
    }
}