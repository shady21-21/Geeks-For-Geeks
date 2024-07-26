//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
       
        int t = sc.nextInt();
        while(t-- > 0){
            
            
           int M = sc.nextInt();
           int K = sc.nextInt();
            
            
            //int n = sc.nextInt();
            sc.nextLine();
            String s[]=sc.nextLine().split(" ");
            int n=s.length;
            int[] bloomDay = new int[n];
            for(int i=0;i<n;i++) bloomDay[i]=Integer.parseInt(s[i]);
            
            Solution obj = new Solution();
            int res = obj.solve(M, K, bloomDay);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    public static int solve(int M, int K, int[] bloomDay) {
     
     //this is the corner case.
     if((long)M*K > bloomDay.length)return -1;
     
     
     int min = Integer.MAX_VALUE;
     int max = Integer.MIN_VALUE;
     for(int i:bloomDay){
         min = Math.min(min, i);
         max = Math.max(max, i);
     }
    
     int si = min;
     int ei = max;
     
     while(si<= ei){
         int mid = (si+ei)/2;
         if(isPossible(bloomDay, mid, M, K)){
            ei = mid-1; 
         }else{
             si = mid+1;
         }
     }
      return si;
    }
    
    // To make M bouquets is Possible.
    
    static boolean isPossible(int[]arr, int days, int m, int k){
        int cnt = 0;
        int noOfBouq = 0;
        for(int i:arr){
            if(i<= days){
                cnt++;
              
            }else{
                 //and i'll cal how many bouquets are from.
                noOfBouq += (cnt/k); 
                cnt = 0;
            }
               
        }
        // and the end of the day i will also cal.
        noOfBouq += (cnt/k);
        return noOfBouq >= m;
    }
    
    
    
}