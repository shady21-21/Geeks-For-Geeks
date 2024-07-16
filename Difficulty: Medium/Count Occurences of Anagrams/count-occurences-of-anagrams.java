//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String txt = br.readLine().trim();
            String pat = br.readLine().trim();

            int ans = new Solution().search(pat, txt);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    int search(String pat, String txt) {
        
        int[] pathFreq = new int[26];
        int k = pat.length();
        for(int i = 0;i<k;i++){
            int index = pat.charAt(i) - 97;
            pathFreq[index]++;
        }
        
        int[] textFreq = new int[26];
        //now cal for the first window.
     
        for(int i = 0;i<k;i++){
            int index = txt.charAt(i) - 97;
            textFreq[index]++;
        }
        int cnt  = 0;
        if(Arrays.equals(pathFreq, textFreq)){
            cnt++;
        }
        
        
        //cal for the rest others elements.
        int n = txt.length();
        for(int i = 1;i<n-k+1;i++){
            int removeIndx = txt.charAt(i-1) - 97;
            int addIndx = txt.charAt(i+k-1) - 97;
            textFreq[addIndx]++;
            textFreq[removeIndx]--;
            
            if(Arrays.equals(pathFreq, textFreq)){
            cnt++;
            }   
        }
        return cnt;
    }
}