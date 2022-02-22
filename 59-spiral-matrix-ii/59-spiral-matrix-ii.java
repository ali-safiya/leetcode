class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        int i=0,j=n-1,k=0,l=n-1,z=1;
        int a,b;
        while(i<j)
        {
            a=i;
            while(a!=j){
                arr[i][a++]=z++;
            }
            b=k;
            while(b!=j){
                arr[b++][j]=z++;
            }
            a=l;
            while(a!=k){
                arr[l][a--]=z++;
            }
            b=l;
            while(b!=i){
                arr[b--][i]=z++;
            }
            i++;
            j--;
            k++;
            l--;
        }
    if(i==j)
        arr[i][j]=z;
        return arr;
    }
}