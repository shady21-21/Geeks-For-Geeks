//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0;i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            System.out.println(sol.findMin(A, n));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    int findMin(int arr[], int n){
       
       int min = Integer.MAX_VALUE;
       
       int si = 0;
       int ei = n-1;
       while(si<= ei){
           int mid = (si+ei)/2;
           
           //some how my array been sorted then si index is my ans.
           if(arr[si]<= arr[ei]){
               min = Math.min(min, arr[si]);
               break;
           }
           
           if(arr[si]<= arr[mid]){
               //means left portion is sorted.
               min = Math.min(min , arr[si]);
               si = mid+1;
           }else{
               ei = mid-1;
               min = Math.min(min, arr[mid]);
           }
       }
       return min;
    }
}
