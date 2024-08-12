//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());

        while (t-- > 0) {
            int k = Integer.parseInt(read.readLine().trim());
            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            Solution obj = new Solution();
            int ans = obj.getPairsCount(nums, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int getPairsCount(int[] arr, int sum) {
        
        
        HashMap<Integer, Integer> map = new HashMap<>();
        // for(int ele : arr){
        //     map.put(ele, map.getOrDefault(ele, 0)+1);
        // }
        int cnt = 0;
        for(int i = 0;i<arr.length;i++){
            if(map.containsKey(sum-arr[i])){
                cnt+= map.get(sum-arr[i]);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        return cnt;
        
        //brute froce . TC -> 0(N^2)
        /*int cnt = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == sum){
                    cnt++;
                }
            }
        }
        return cnt;*/
    }
}
