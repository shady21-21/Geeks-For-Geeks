//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            int K;
            K = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.smallestDivisor(nums, K);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int smallestDivisor(int[] nums, int K) {
        
        //corner case.
        if(nums.length > K)return -1;
        
        int si = 1;
        int ei = max(nums);
        
        while(si<= ei){
            int mid = (si+ei)/2;
            if(smDiv(nums, mid) <= K){
                ei = mid-1;
            }else{
                si = mid+1;
            }
        }
        
        return si; 
     
        
       /* for(int i = 1;i<=ei;i++){
            int sum = 0;
            for(int j = 0;j<nums.length;j++){
                sum+= Math.ceil((double)nums[j]/(double)i);
            }
            if(sum <= K){
                return i;
            }
        }
        return -1;*/
    }
    
    static int smDiv(int[]arr, int x){
        int sum = 0;
        for(int i:arr){
            sum+= Math.ceil((double)i/(double)x);
        }
        return sum;
    }
    
    static int max(int[]arr){
        int max = Integer.MIN_VALUE;
        for(int i:arr){
            max = Math.max(max, i);
        }
        return max;
    }
}