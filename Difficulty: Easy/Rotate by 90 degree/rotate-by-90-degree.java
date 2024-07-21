//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
         BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            int matrix[][] = new int[n][n];
            String st[] = read.readLine().trim().split("\\s+");
            int k = 0;
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                    matrix[i][j] = Integer.parseInt(st[k++]);
            }
            Solution ob = new Solution();
            ob.rotateby90(matrix, n);
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int matrix[][], int n) { 
        
        //Simple Approach.
        // First turn this into Transport Matrix.
        //then Reverse each Row.
        
        
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j = i+1;j<col;j++){
                
                //swap
                int tem = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tem;
            }
        }
        reverse(matrix);
    }
    
    
    // Reverse the Col.. Which is Anti-ClockWise.....
    static void reverse(int[][]matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        
        
        for (int j = 0; j < col; j++) {
            int si = 0;
            int ei = row - 1;
            while (si < ei) {
                int temp = matrix[si][j];
                matrix[si][j] = matrix[ei][j];
                matrix[ei][j] = temp;
                si++;
                ei--;
            }
        }
    }
}