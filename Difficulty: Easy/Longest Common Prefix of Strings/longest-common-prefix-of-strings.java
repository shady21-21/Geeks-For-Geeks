//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            String ans = ob.longestCommonPrefix(arr);

            if (ans.isEmpty()) {
                System.out.print("\"\"");
            } else {
                System.out.print(ans);
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        
        
        Arrays.sort(arr);
        
        int n = arr.length;
        
        String firstString = arr[0];
        String lastString = arr[n-1];
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<Math.min(firstString.length(), lastString.length()) ;i++){
            if(firstString.charAt(i) == lastString.charAt(i)){
                sb.append(firstString.charAt(i));
            }else{
                break;
            }
        }
        return (sb.length() == 0 ? "" : sb.toString());
    }
}