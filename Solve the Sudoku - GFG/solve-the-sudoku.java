//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class
{
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int grid[][] = new int[9][9];
            for(int i = 0; i < 9; i++)
            {
                for(int j = 0; j < 9; j++)
                grid[i][j] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            if(ob.SolveSudoku(grid) == true)
                ob.printGrid(grid);
            else
                System.out.print("NO solution exists");
            System.out.println();
            
        }
    }
}




// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find a solved Sudoku. 
    static boolean SolveSudoku(int grid[][])
    {
        // add your code here
        
        int i=0,j=0;
        
        for(i=0;i<9;i++){
            boolean flag = false;
            for(j=0;j<9;j++){
                
                if(grid[i][j]==0){
                    flag= true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        
        if(i==9 && j==9 ){
            return true;
        }
        
        for(int n= 1 ;n<=9;n++){
            
            if(isSafe(i,j,n,grid)){
                grid[i][j]=n;
                if(SolveSudoku(grid))
                    return true;
                grid[i][j]=0;
            }
        }
        return false;
    }
    
    static boolean isSafe(int i, int j , int n, int[][] grid){
        
        for(int k=0;k<9;k++){
            
            if(grid[i][k]== n || grid[k][j]==n)
                return false;
        }
        
        int x =  i - (i%3);
        int y =  j - (j%3);
        
        for(int m=x ;m<x+3;m++){
            
            for(int q= y; q<y+3;q++){
                
                if(grid[m][q]==n){
                    return false;
                }
            }
        }
        return true;
    }
    
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
        // add your code here
        for(int i=0;i<9;i++){
            for(int j=0;j<9 ; j++){
                System.out.print(grid[i][j]+" ");
            }
        }
    }
}