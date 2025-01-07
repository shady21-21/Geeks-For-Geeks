//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {

    int countPairs(int arr[], int target) {
 
        int n = arr.length;
        int cnt = 0;
         //BRUTE FORCE APPROACH -> O(N^2)
        
        // for(int i = 0;i<n;i++){
        //     for(int j = i+1;j<n;j++){
        //         if(arr[i] + arr[j] == target){
        //             cnt++;
        //         }
        //     }
        // }
            
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int x :arr){
            if(map.containsKey(target - x)){
                cnt+= map.get(target-x);
            }
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        
        return cnt;
    }
}


//{ Driver Code Starts.
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            String[] inputLine = br.readLine().trim().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            int target = Integer.parseInt(inputLine[0]);

            Solution obj = new Solution();
            int res = obj.countPairs(arr, target);
            System.out.println(res);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends