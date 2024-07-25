//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int h = sc.nextInt();
            Solution obj = new Solution();
            int ans = obj.Solve(n,a,h);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int Solve(int N, int[] piles, int H) {
      
      // find out the maximum ..
      int si = 1;
      int ei = findMax(piles);
      
      while(si<= ei){
          int mid = (si+ei)/2;
          
          int totalHr = timeNeed(piles, mid);
          if(totalHr<= H){
              ei = mid-1;
          }else{
              si = mid+1;
          }
      }
      return si;
    }
    
    static int findMax(int[]arr){
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            max = Math.max(max, i);
        }
        return max;
    }
    
    static int timeNeed(int []arr, int x){
        int time = 0;
        for(int i:arr){
            time+= Math.ceil((double)i/x);
        }
        return time;
    }
}
        
