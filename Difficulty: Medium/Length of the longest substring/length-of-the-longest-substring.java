//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubstring(s));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int longestUniqueSubstring(String s) {
        
        int n = s.length();
        int maxLen = 0;
        
        for(int i = 0;i<n;i++){
            boolean[]vis = new boolean[256];
            for(int j = i;j<n;j++){
                char currChar = s.charAt(j);
                
                if(vis[currChar]){break;}
                
                vis[currChar] = true;
                
                maxLen = Math.max(maxLen, j-i+1);
            }
        }
        return maxLen;
    }
}